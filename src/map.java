import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class map extends JFrame implements ActionListener{
	
	// 設置關卡按鈕
	JButton[] jb = new JButton[7];
	JButton backpack_jb, card_jb;
	
	// 設置圖示路徑
	String backpack_path = "images/backpack.jpg";
	ImageIcon bp_icon = new ImageIcon(backpack_path);
	
	String card_path = "images/card.png";
	ImageIcon card_icon = new ImageIcon(card_path);
	
	String question_path = "images/question.jpg";
	ImageIcon question_icon = new ImageIcon(question_path);
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	public int w , x , y , z ;
	// 寶貝球參數
	int n , m , l , ballnum ;
	
	
	public map(int g,int p,int j,int c, int q, int r, int s, int bn) {		
		
		super("精靈寶可夢");
		setSize(650, 615);
		setLocation(200, 50);
		
		// 背景設置
		String path = "images/map.png";
		ImageIcon background = new ImageIcon(path);
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, this.getWidth(), this.getHeight());
		JPanel imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel.setLayout(null);
		
		// 將傳入的參數進行存取
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		ballnum = bn;
	
		// 遇到精靈按鈕
		jb[0] = new JButton();
		jb[0].setIcon(question_icon);
		jb[0].setBounds(115,320,30,30);

				
		jb[1] = new JButton();
		jb[1].setIcon(question_icon);
		jb[1].setBounds(115,225,30,30);
		
		jb[2] = new JButton();
		jb[2].setIcon(question_icon);
		jb[2].setBounds(178,117,30,30);
		
		jb[3] = new JButton();
		jb[3].setIcon(question_icon);
		jb[3].setBounds(346,95,30,30);
		
		jb[4] = new JButton();
		jb[4].setIcon(question_icon);
		jb[4].setBounds(485,196,30,30);
				
		jb[5] = new JButton();
		jb[5].setIcon(question_icon);
		jb[5].setBounds(386,259,30,30);	
		
		jb[6] = new JButton();
		jb[6].setIcon(question_icon);
		jb[6].setBounds(539,376,30,30);
		
		// 背包按鈕
		backpack_jb = new JButton();
		backpack_jb.setBounds(465, 517, 60, 60);
		backpack_jb.setIcon(bp_icon);
		backpack_jb.addActionListener(this);
		backpack_jb.setVisible(true);
			
		// 看自己有多少卡牌按鈕
		card_jb = new JButton();
		card_jb.setBounds(550, 517, 60, 60);
		card_jb.setIcon(card_icon);
		card_jb.addActionListener(this);
		card_jb.setVisible(true);
			
		// 按鈕放到地圖Panel上
		imagePanel.add(backpack_jb);
		imagePanel.add(card_jb);
		
		for(int i=0; i<jb.length; i++) {
			imagePanel.add(jb[i]);
			jb[i].addActionListener(this);
			jb[i].setVisible(true);
		}		
	}

	public static void main(String[] args) {
		map mp = new map(0, 0, 0, 0, 0, 0, 0, 0);
	}
	
		@Override
		public void actionPerformed(ActionEvent evt) {
			JButton source_jb =(JButton)evt.getSource();
			
			if(source_jb == backpack_jb) {
				System.out.println("包包");
				// 跳出包包查看精靈球
				new backpack_map(ballnum);
			}
			
			else if(source_jb == card_jb) {
				System.out.println("精靈卡");
				//跳出卡包查看精靈卡
				new card(w,x,y,z);
			}
			
			// 遇到精靈行戰鬥
			// 0耿鬼、2妙蛙種子、4可達鴨、6小火龍
			else if(source_jb == jb[0]) {
				battle bt = new battle(1,w,x,y,z, n, m ,l, ballnum);
			}
			
			else if(source_jb == jb[2]) {
				battle_2 bt = new battle_2(1,w,x,y,z, n, m ,l, ballnum);
			}
			
			else if(source_jb == jb[4]) {
				battle_4 bt = new battle_4(1,w,x,y,z, n, m ,l, ballnum);
			}
			
			else if(source_jb == jb[6]) {
				battle_6 bt = new battle_6(1,w,x,y,z, n, m ,l, ballnum);
			}
			
			// 撿到寶貝球
			// n, m, l值進行是否撿到球判斷，0未撿到、1已撿到
			else if(source_jb == jb[1]) {
				if(n == 0) {
					n = 1;
					new getball(w, x, y ,z, n, m, l, ballnum);
				}else if(n == 1) {
					new notgetball();
				}
				
			}
			else if(source_jb == jb[3]) {
				if(m == 0) {
					m = 1;
					new getball(w, x, y ,z, n, m, l, ballnum);
				}else if(m == 1) {
					new notgetball();
				}
			}
			else if(source_jb == jb[5]) {
				if(l == 0) {
					l = 1;
					new getball(w, x, y ,z, n, m, l, ballnum);
				}else if(l == 1) {
					new notgetball();
				}
			}
		}	
}

