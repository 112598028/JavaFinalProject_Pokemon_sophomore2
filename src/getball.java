import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class getball extends JFrame{
	
	// ��o���F�y�ϥ�
	JButton pic;
	
	// �d�P�ѼơAw�հ��Bx����ؤl�By�i�F�n�Bz�p���s
	int w, x ,y ,z ;
	
	// �_���y�Ѽ�
	int n, m, l, bn;
	
	public getball(int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		// �����]�m
		super("GET BALL!"); 
		setSize(350, 350); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">�z��o�F�@�����F�y�I</p></body></html>");
		label.setSize(200, 200);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		jp.add(label);
		
		ImageIcon get_ball = new ImageIcon("images\\pokeball.gif");
		pic = new JButton(get_ball); 
		pic.setSize(340, 300); 
		pic.setBackground(Color.WHITE);
		pic.setVisible(true);
	    jp.add(pic);
		
		this.add(jp);
		
		// �N�ǤJ���Ѽƶi��s��
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		
		// �o���_���y��+1
		bn++;
		
		// ��s�a�ϻP�I�]
		new map(w,x,y,z, q, r, s, bn);
		new backpack_map(bn);
		
		// �N���\���o���ܵ����\�b�̫e��
		this.toFront();
	}

}
