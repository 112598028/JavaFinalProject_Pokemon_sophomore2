import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class get extends JFrame{
	
	// ���A�ϥ�
	JButton pic;
	
	// �d�P�ѼơAw�հ��Bx����ؤl�By�i�F�n�Bz�p���s
	int w,x,y ,z;
	
	// ���A�d���Ѽ�n_1�A�_���y�Ѽ�
	int n_1, n, m, l, ballnum;
	
	public get(int n_1,int g,int p,int j,int c,int q, int r, int s, int bn) {
		
		// �����]�m
		super("GET!"); 
		setSize(400, 400); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">�z���A�F�@���_�i�ڡI</p></body></html>");
		label.setSize(200, 200);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		jp.add(label);
		
		ImageIcon a = new ImageIcon("images\\luffy.gif");
		pic = new JButton(a); 
		pic.setSize(340, 300); 
		pic.setBackground(Color.WHITE);
		pic.setVisible(true);
	    jp.add(pic);
		
		this.add(jp);
		
		// �P�_���A�d�����ȡA�N�ǤJ���Ѽƶi��s��
		// ���Aw�հ�
		if(n_1 == 4) {
			w = 1;
			x = p;
			y = j;
			z = c;			
		}
		
		// ���Ax����ؤl
		if(n_1 == 5) {
			w = g;
			x = 1;
			y = j;
			z = c;			
		}	
		
		// ���Ay�i�F�n
		if(n_1 == 6) {
			w = g;
			x = p;
			y = 1;
			z = c;		
		}
		
		// ���Az�p���s
		if(n_1 == 7) {
			w = g;
			x = p;
			y = j;
			z = 1;	
		}
		
		// �N�ǤJ���_���y�Ѽƶi��s��
		n = q;
		m = r;
		l = s;
		ballnum = bn -1;
		
		// ��s�a�ϻP�d�P
		map cc = new map(w,x,y,z,n, m, l, ballnum);
		card dd = new card(w,x,y,z);
		// �N���\���A���ܵ����\�b�̫e��
		this.toFront();
	}
}


