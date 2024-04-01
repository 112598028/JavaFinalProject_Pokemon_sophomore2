import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class backpack_map extends JFrame{
	
	JButton jb[] = new JButton[9]; //寶貝球按鈕
	int ballnum;
	
	public backpack_map(int bn) {
		this.setSize(350, 350);
		this.setLocation(536, 50);
		this.setVisible(true); 
		this.setTitle("背包");
		
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
			if(i < (3+bn)) {
				jb[i].setIcon(ball_icon);
			}
		}
		
		// 設置標題
		JPanel nev_jp = new JPanel();
		//nev_jp.setBackground(Color.WHITE);
		nev_jp.setSize(650, 80);
		JLabel jl = new JLabel("精靈球", SwingConstants.CENTER);
		jl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));;
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
		
	}


}