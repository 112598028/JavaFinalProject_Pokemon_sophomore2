import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class battle_2 extends JFrame implements ActionListener {
	
	// 設置按鈕，1~12生命值、13戰鬥按鈕、14背包按鈕、15精靈按鈕、16逃跑按鈕
	public JButton BTN1, BTN2, BTN3, BTN4, BTN5, BTN6, BTN7, BTN8, BTN9, BTN10, BTN11, BTN12, BTN13, BTN14, BTN15, BTN16, cha_1_BTN;
	
	// 我方使用精靈，預設為皮卡丘，使用路徑為1
	public String cha_2_path = null;
	public static int path = 1;
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	public int a = 1, w = 0, x = 0, y = 0, z = 0;
	// 寶貝球參數
	int n, m, l, ballnum;
	
	JPanel imagePanel;
	
	public battle_2(int path,int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		super("戰鬥");
		setSize(800,540);
		setLocation(200, 50);
		
		// 背景設置
		String bg_path = "images\\battle_background.jpg";
		ImageIcon background = new ImageIcon(bg_path);
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, this.getWidth(), this.getHeight());
		imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		// 呼叫按鈕函式，放置按鈕
		button(path);
		setVisible(true);
		
		// 將傳入的參數進行存取
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		ballnum = bn;
	}
	
	// 設置按鈕排版
	public void button(int path){
		imagePanel.setLayout(null); 

	    BTN1 = new JButton(""); 
	    BTN1.setSize(30, 30); 
	    BTN1.setLocation(115,193);
	    BTN1.setBackground(Color.GREEN);
	    imagePanel.add(BTN1);
	    BTN1.setVisible(true);
	    
	    BTN2 = new JButton(""); 
	    BTN2.setSize(30, 30); 
	    BTN2.setLocation(115 + 30,193);
	    BTN2.setBackground(Color.GREEN);
	    imagePanel.add(BTN2);
	    BTN2.setVisible(true);
	    
	    BTN3 = new JButton(""); 
	    BTN3.setSize(30, 30); 
	    BTN3.setLocation(115 + 60,193);
	    BTN3.setBackground(Color.GREEN);
	    imagePanel.add(BTN3);
	    BTN3.setVisible(true);
	    
	    BTN4 = new JButton(""); 
	    BTN4.setSize(30, 30); 
	    BTN4.setLocation(115 + 90,193);
	    BTN4.setBackground(Color.GREEN);
	    imagePanel.add(BTN4);
	    BTN4.setVisible(true);
	    
	    BTN5 = new JButton(""); 
	    BTN5.setSize(30, 30); 
	    BTN5.setLocation(115 + 120,193);
	    BTN5.setBackground(Color.GREEN);
	    imagePanel.add(BTN5);
	    BTN5.setVisible(true);
	    
	    BTN6 = new JButton(""); 
	    BTN6.setSize(30, 30); 
	    BTN6.setLocation(115 + 150,193);
	    BTN6.setBackground(Color.GREEN);
	    imagePanel.add(BTN6);
	    BTN6.setVisible(true);
	    
	    BTN7 = new JButton(""); 
	    BTN7.setSize(30, 30); 
	    BTN7.setLocation(553,193);
	    BTN7.setBackground(Color.GREEN);
	    imagePanel.add(BTN7);
	    BTN7.setVisible(true);
	    
	    BTN8 = new JButton(""); 
	    BTN8.setSize(30, 30); 
	    BTN8.setLocation(553 + 30,193);
	    BTN8.setBackground(Color.GREEN);
	    imagePanel.add(BTN8);
	    BTN8.setVisible(true);
	    
	    BTN9 = new JButton(""); 
	    BTN9.setSize(30, 30); 
	    BTN9.setLocation(553 + 60,193);
	    BTN9.setBackground(Color.GREEN);
	    imagePanel.add(BTN9);
	    BTN9.setVisible(true);
	    
	    BTN10 = new JButton(""); 
	    BTN10.setSize(30, 30); 
	    BTN10.setLocation(553 + 90,193);
	    BTN10.setBackground(Color.GREEN);
	    imagePanel.add(BTN10);
	    BTN10.setVisible(true);
	    
	    BTN11 = new JButton(""); 
	    BTN11.setSize(30, 30); 
	    BTN11.setLocation(553 + 120,193);
	    BTN11.setBackground(Color.GREEN);
	    imagePanel.add(BTN11);
	    BTN11.setVisible(true);
	    
	    BTN12 = new JButton(""); 
	    BTN12.setSize(30, 30); 
	    BTN12.setLocation(553 + 150,193);
	    BTN12.setBackground(Color.GREEN);
	    imagePanel.add(BTN12);
	    BTN12.setVisible(true);
	    
	    BTN13 = new JButton("戰鬥"); 
	    BTN13.setSize(85, 60); 
	    BTN13.setLocation(500, 37);
	    BTN13.setBackground(Color.WHITE);
	    BTN13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24));
	    BTN13.addActionListener(this);
	    imagePanel.add(BTN13);
	    BTN13.setVisible(true);
	    
	    BTN14 = new JButton("背包"); 
	    BTN14.setSize(85, 60); 
	    BTN14.setLocation(620, 37);
	    BTN14.setBackground(Color.WHITE);
	    BTN14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24));
	    BTN14.addActionListener(this);
	    imagePanel.add(BTN14);
	    BTN14.setVisible(true);
	    
	    BTN15 = new JButton("精靈"); 
	    BTN15.setSize(85, 60); 
	    BTN15.setLocation(500, 99);
	    BTN15.setBackground(Color.WHITE);
	    BTN15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24));
	    BTN15.addActionListener(this);
	    imagePanel.add(BTN15);
	    BTN15.setVisible(true);
	    
	    BTN16 = new JButton("逃跑"); 
	    BTN16.setSize(85, 60); 
	    BTN16.setLocation(620, 99);
	    BTN16.setBackground(Color.WHITE);
	    BTN16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24));
	    BTN16.addActionListener(this);
	    imagePanel.add(BTN16);
	    BTN16.setVisible(true);
	    
	    String cha_1_path = "images\\250\\6.png";
		ImageIcon cha_1 = new ImageIcon(cha_1_path);
	    cha_1_BTN = new JButton(cha_1); 
	    cha_1_BTN.setSize(220, 220); 
	    cha_1_BTN.setLocation(75,260);
	    cha_1_BTN.addActionListener(this);
	    imagePanel.add(cha_1_BTN);
	    cha_1_BTN.setVisible(true);
	    
	    // 傳入路徑判斷，以進行我方寶可夢更換
	    if(path == 1) {
	    	cha_2_path = "images\\250\\1.png";
	    }else if(path == 2) {
	    	cha_2_path = "images\\250\\2.png";
	    }else if(path == 3) {
	    	cha_2_path = "images\\250\\3.png";
	    }else if(path == 4) {
	    	cha_2_path = "images\\250\\4.png";
	    }else if(path == 5) {
	    	cha_2_path = "images\\250\\5.png";
	    }else if(path == 6) {
	    	cha_2_path = "images\\250\\6.png";
	    }else if(path == 7) {
	    	cha_2_path = "images\\250\\7.png";
	    }else if(path == 8) {
	    	cha_2_path = "images\\250\\8.png";
	    }
		ImageIcon cha_2 = new ImageIcon(cha_2_path);
	    JButton cha_2_BTN = new JButton(cha_2); 
	    cha_2_BTN.setSize(220, 220); 
	    cha_2_BTN.setLocation(515,260);
	    imagePanel.add(cha_2_BTN);
	    cha_2_BTN.setVisible(true);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {

		// 攻擊後的生命值結果設置
		if(e.getSource() == BTN13) {
			if(cha_2_path == "images\\250\\1.png") {
				BTN12.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\2.png"){
				BTN12.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\3.png"){
				BTN12.setBackground(Color.WHITE);
				BTN11.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\4.png"){
				BTN12.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
				BTN4.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\5.png"){
				BTN12.setBackground(Color.WHITE);
				BTN11.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
				BTN4.setBackground(Color.WHITE);
				BTN3.setBackground(Color.WHITE);
				BTN2.setBackground(Color.WHITE);
				// 已達可收服標準，跳出可收服提示視窗，將收服的判斷值從1改為0
				hint cc = new hint();
				a = 0;
			}else if(cha_2_path == "images\\250\\6.png"){
				BTN12.setBackground(Color.WHITE);
				BTN11.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\7.png"){
				BTN12.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
			}else if(cha_2_path == "images\\250\\8.png"){
				BTN12.setBackground(Color.WHITE);
				BTN11.setBackground(Color.WHITE);
				BTN6.setBackground(Color.WHITE);
				BTN5.setBackground(Color.WHITE);
				BTN4.setBackground(Color.WHITE);
				BTN3.setBackground(Color.WHITE);
				hint cc = new hint();
				a = 0;
			}
		}
		// 開啟背包，以進行收服
		else if(e.getSource() == BTN14) {
			backpack cc = new backpack(a, 5,w,x,y,z, n, m, l, ballnum);
		}
		// 開啟卡牌，更換精靈
		else if(e.getSource() == BTN15) {
			this.setVisible(false);
			pokemon_2 cc = new pokemon_2(w,x,y,z, n, m, l, ballnum); 
		}
		// 逃跑
		else if(e.getSource() == BTN16) {
			this.setVisible(false);
		}
		// 點擊妙蛙種子觀看角色訊息
		else if(e.getSource() == cha_1_BTN) {
			bulbasaur cc = new bulbasaur();
		}
	}
}