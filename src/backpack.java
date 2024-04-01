import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class backpack extends JFrame implements ActionListener{
	
	// �]�m�_���y���s
	JButton jb[] = new JButton[9]; 
	
	// �]�m�����A���d�P�Ѽ�
	int card_number;
	
	// �d�P�ѼơAw�հ��Bx����ؤl�By�i�F�n�Bz�p���s
	public int w, x, y, z;
	
	// �_���y�Ѽ�
	int n, m, l, ballnum;
	
	public backpack(int a, int n_1,int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		// �����]�m
		this.setSize(350, 350);
		this.setLocation(650, 50);
		this.setVisible(true); 
		this.setTitle("�I�]");
		
		// �N�ǤJ���Ѽƶi��s��
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		ballnum = bn;
		
		// �]�m�_���y
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		GridLayout gl = new GridLayout(3,3);
		jp.setLayout(gl);
		
		String ball_path = "images/ball.jpg";
		ImageIcon ball_icon = new ImageIcon(ball_path);
		
		for(int i=0; i<jb.length; i++) {
			jb[i] = new JButton();
			jb[i].setSize(100, 100);
			jb[i].setBackground(Color.WHITE);
			jp.add(jb[i]);
			// �z�L�ǤJ���`�_���ybn�ƶi������e�{������
			if(i < (3+bn)) {
				jb[i].setIcon(ball_icon);
			}
		}
		
		// ���A�P�_�Ȭ�0�A�i���A
		if(a == 0) {
			for(int i=0; i<jb.length; i++) {
				jb[i].addActionListener(this);
			}
		}
		// ���A�P�_�Ȭ�1�A���X�L�k���A���ܵ���
		else {
			notget cc = new notget();
			this.toFront();
			this.setVisible(false);
		}
		
		// �]�m���D
		JPanel nev_jp = new JPanel();
		nev_jp.setSize(650, 80);
		JLabel jl = new JLabel("���F�y", SwingConstants.CENTER);
		jl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		nev_jp.add(jl);
		
		// �e���ƪ�
		JPanel lf_jp = new JPanel();
		JPanel ri_jp = new JPanel();
					
		lf_jp.setPreferredSize(new Dimension(25, 350));
		ri_jp.setPreferredSize(new Dimension(25, 350));
					
		this.add(lf_jp, BorderLayout.WEST);
		this.add(ri_jp, BorderLayout.EAST);
		this.add(nev_jp, BorderLayout.NORTH);
		this.add(jp, BorderLayout.CENTER);
		
		// �ǿ�Ȧ��A�d������
		card_number = n_1;	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// �ǭȩI�sget�A�}�Ҧ��A���\���ܵ����A�P�d�P�̷s���G����
		get cc = new get(card_number, w, x, y, z,n, m, l, ballnum);
		this.setVisible(false);
	}

}