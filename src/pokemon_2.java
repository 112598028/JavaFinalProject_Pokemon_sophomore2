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

class pokemon_2 extends JFrame implements ActionListener{
	
	// 設置卡牌
	JButton jb[] = new JButton[9];
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	public int w, x , y , z ;
	
	// 寶貝球參數
	int n, m, l, ballnum;
	
	public pokemon_2(int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		// 設置版型
		super("精靈"); 
		this.setSize(426, 503);
		this.setLocation(424, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
		setVisible(true); 
		
		JPanel jp = new JPanel();
		GridLayout gl = new GridLayout(3,3);
		jp.setLayout(gl);
		
		for(int i=0; i<9; i++) {
			jb[i] = new JButton();
			jb[i].setSize(122, 151);
			jb[i].setBackground(Color.WHITE);
			jp.add(jb[i]);
		}
		
		// 皮卡丘卡牌
		String card_pikachu_path = "images/card_pikachu.png";
		ImageIcon card_pikachu_icon = new ImageIcon(card_pikachu_path);
		jb[0].setIcon(card_pikachu_icon);
		jb[0].addActionListener(this);
			
		// 伊布卡牌
		String card_Eevee_path = "images/card_Eevee.png";
		ImageIcon card_Eevee_icon = new ImageIcon(card_Eevee_path);
		jb[1].setIcon(card_Eevee_icon);
		jb[1].addActionListener(this);
		
		// 胖丁卡牌
		String card_Jigglypuff_path = "images/card_Jigglypuff.png";
		ImageIcon card_Jigglypuff_icon = new ImageIcon(card_Jigglypuff_path);
		jb[2].setIcon(card_Jigglypuff_icon);
		jb[2].addActionListener(this);
			
		//基拉祈卡牌
		String card_Jirachi_path = "images/card_Jirachi.png";
		ImageIcon card_Jirachi_icon = new ImageIcon(card_Jirachi_path);
		jb[3].setIcon(card_Jirachi_icon);
		jb[3].addActionListener(this);
		
		// 將傳入的參數進行存取
	    w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		ballnum = bn;
				
		// 如果收服到耿鬼
		if(w == 1) {
			String card_Gengar_path = "images/card_Gengar.png";
			ImageIcon card_Gengar_icon = new ImageIcon(card_Gengar_path);
			jb[4].setIcon(card_Gengar_icon);
			jb[4].addActionListener(this);
		}
		
		// 如果收服到妙挖種子
		if(x == 1) {
			String card_Bulbasaur_path = "images/card_Bulbasaur.png";
			ImageIcon card_Bulbasaur_icon = new ImageIcon(card_Bulbasaur_path);
			jb[5].setIcon(card_Bulbasaur_icon);
			jb[5].addActionListener(this);
		}
		
		// 如果收服到可達鴨
		if(y == 1) {
			String card_Psyduck_path = "images/card_Psyduck.png";
			ImageIcon card_Psyduck_icon = new ImageIcon(card_Psyduck_path);
			jb[6].setIcon(card_Psyduck_icon);
			jb[6].addActionListener(this);
		}
		
		// 如果收服到小火龍
		if(z == 1) {
			String card_Charmander_path = "images/card_Charmander.png";
			ImageIcon card_Charmander_icon = new ImageIcon(card_Charmander_path);
			jb[7].setIcon(card_Charmander_icon);
			jb[7].addActionListener(this);
		}
						
		// 放上標題
		JPanel nev_jp = new JPanel();
		JLabel jl = new JLabel("寶可夢卡牌", SwingConstants.CENTER);
		jl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		nev_jp.add(jl);

				
		// 畫片排版
		JPanel lf_jp = new JPanel();
		JPanel ri_jp = new JPanel();
			
		lf_jp.setPreferredSize(new Dimension(30, 500));
		ri_jp.setPreferredSize(new Dimension(30, 500));
			
			
		this.add(lf_jp, BorderLayout.WEST);
		this.add(ri_jp, BorderLayout.EAST);
		this.add(nev_jp, BorderLayout.NORTH);
		this.add(jp, BorderLayout.CENTER);
	    

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 點擊卡牌進行我方角色更換
		if(e.getSource() == jb[0]) {
			update(1, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[1]) {
			update(2, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[2]) {
			update(3, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[3]) {
			update(4, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[4]) {
			update(5, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[5]) {
			update(6, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[6]) {
			update(7, w, x, y, z, n, m ,l, ballnum);
		}else if(e.getSource() == jb[7]) {
			update(8, w, x, y, z, n, m ,l, ballnum);
		}
	}
	// 更換卡牌函式：卡牌視窗消失，更新戰鬥視窗
	public void update(int a,int g,int p,int j,int c, int q, int r, int s,int bn) {
		this.setVisible(false);
		battle_2 program = new battle_2(a, g, p, j, c, n, m ,l, bn);
		program.setVisible(true);
	}
}