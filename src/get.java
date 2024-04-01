import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class get extends JFrame{
	
	// 收服圖示
	JButton pic;
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	int w,x,y ,z;
	
	// 收服卡片參數n_1，寶貝球參數
	int n_1, n, m, l, ballnum;
	
	public get(int n_1,int g,int p,int j,int c,int q, int r, int s, int bn) {
		
		// 版面設置
		super("GET!"); 
		setSize(400, 400); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">您收服了一隻寶可夢！</p></body></html>");
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
		
		// 判斷收服卡片的值，將傳入的參數進行存取
		// 收服w耿鬼
		if(n_1 == 4) {
			w = 1;
			x = p;
			y = j;
			z = c;			
		}
		
		// 收服x妙蛙種子
		if(n_1 == 5) {
			w = g;
			x = 1;
			y = j;
			z = c;			
		}	
		
		// 收服y可達鴨
		if(n_1 == 6) {
			w = g;
			x = p;
			y = 1;
			z = c;		
		}
		
		// 收服z小火龍
		if(n_1 == 7) {
			w = g;
			x = p;
			y = j;
			z = 1;	
		}
		
		// 將傳入的寶貝球參數進行存取
		n = q;
		m = r;
		l = s;
		ballnum = bn -1;
		
		// 更新地圖與卡牌
		map cc = new map(w,x,y,z,n, m, l, ballnum);
		card dd = new card(w,x,y,z);
		// 將成功收服提示視窗擺在最前方
		this.toFront();
	}
}


