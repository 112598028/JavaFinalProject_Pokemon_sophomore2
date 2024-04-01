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
	
	// 設置寶貝球按鈕
	JButton jb[] = new JButton[9]; 
	
	// 設置欲收服的卡牌參數
	int card_number;
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	public int w, x, y, z;
	
	// 寶貝球參數
	int n, m, l, ballnum;
	
	public backpack(int a, int n_1,int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		// 版面設置
		this.setSize(350, 350);
		this.setLocation(650, 50);
		this.setVisible(true); 
		this.setTitle("背包");
		
		// 將傳入的參數進行存取
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		ballnum = bn;
		
		// 設置寶貝球
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
			// 透過傳入的總寶貝球bn數進行視窗呈現的顆數
			if(i < (3+bn)) {
				jb[i].setIcon(ball_icon);
			}
		}
		
		// 收服判斷值為0，可收服
		if(a == 0) {
			for(int i=0; i<jb.length; i++) {
				jb[i].addActionListener(this);
			}
		}
		// 收服判斷值為1，跳出無法收服提示視窗
		else {
			notget cc = new notget();
			this.toFront();
			this.setVisible(false);
		}
		
		// 設置標題
		JPanel nev_jp = new JPanel();
		nev_jp.setSize(650, 80);
		JLabel jl = new JLabel("精靈球", SwingConstants.CENTER);
		jl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		nev_jp.add(jl);
		
		// 畫片排版
		JPanel lf_jp = new JPanel();
		JPanel ri_jp = new JPanel();
					
		lf_jp.setPreferredSize(new Dimension(25, 350));
		ri_jp.setPreferredSize(new Dimension(25, 350));
					
		this.add(lf_jp, BorderLayout.WEST);
		this.add(ri_jp, BorderLayout.EAST);
		this.add(nev_jp, BorderLayout.NORTH);
		this.add(jp, BorderLayout.CENTER);
		
		// 傳輸值收服卡片的值
		card_number = n_1;	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// 傳值呼叫get，開啟收服成功提示視窗，與卡牌最新結果視窗
		get cc = new get(card_number, w, x, y, z,n, m, l, ballnum);
		this.setVisible(false);
	}

}