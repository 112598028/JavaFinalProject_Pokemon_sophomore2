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

public class card extends JFrame implements ActionListener{

	// 設置卡牌
	JButton jb[] = new JButton[9];
	
	public card(int g,int p,int j,int c) {
		
		// 設置版型
		this.setSize(426, 503);
		this.setLocation(574, 50);
		this.setVisible(true); 
		this.setTitle("卡牌");
		
		// 設置放卡片的地方
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
		
		// 基拉祈卡牌
		String card_Jirachi_path = "images/card_Jirachi.png";
		ImageIcon card_Jirachi_icon = new ImageIcon(card_Jirachi_path);
		jb[3].setIcon(card_Jirachi_icon);
		jb[3].addActionListener(this);
		
		// 如果收服到耿鬼
		if(g == 1) {
			String card_Gengar_path = "images/card_Gengar.png";
			ImageIcon card_Gengar_icon = new ImageIcon(card_Gengar_path);
			jb[4].setIcon(card_Gengar_icon);
			jb[4].addActionListener(this);
		}
		
		// 如果收服到妙挖種子
		if(p == 1) {
			String card_Bulbasaur_path = "images/card_Bulbasaur.png";
			ImageIcon card_Bulbasaur_icon = new ImageIcon(card_Bulbasaur_path);
			jb[5].setIcon(card_Bulbasaur_icon);
			jb[5].addActionListener(this);
		}
		
		// 如果收服到可達鴨
		if(j == 1) {
			String card_Psyduck_path = "images/card_Psyduck.png";
			ImageIcon card_Psyduck_icon = new ImageIcon(card_Psyduck_path);
			jb[6].setIcon(card_Psyduck_icon);
			jb[6].addActionListener(this);
		}
		
		// 如果收服到小火龍
		if(c == 1) {
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
	public void actionPerformed(ActionEvent arg0) {
		
		JButton source_jb =(JButton)arg0.getSource();
		
		// 點擊卡牌查看其角色設定
		if(source_jb == jb[0]) {
			pikachu cc = new pikachu();
		}else if(source_jb == jb[1]) {
			eevee cc = new eevee();
		}else if(source_jb == jb[2]) {
			jigglypuff cc = new jigglypuff();
		}else if(source_jb == jb[3]) {
			jilachi cc = new jilachi();
		}else if(source_jb == jb[4]) {
			gengar cc = new gengar();
		}else if(source_jb == jb[5]) {
			bulbasaur cc = new bulbasaur();
		}else if(source_jb == jb[6]) {
			psyduck cc = new psyduck();
		}else if(source_jb == jb[7]) {
			charmander cc = new charmander();
		}
	}
}