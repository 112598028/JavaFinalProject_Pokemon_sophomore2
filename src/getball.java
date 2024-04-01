import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class getball extends JFrame{
	
	// 獲得精靈球圖示
	JButton pic;
	
	// 卡牌參數，w耿鬼、x妙蛙種子、y可達鴨、z小火龍
	int w, x ,y ,z ;
	
	// 寶貝球參數
	int n, m, l, bn;
	
	public getball(int g,int p,int j,int c, int q, int r, int s, int bn) {
		
		// 版面設置
		super("GET BALL!"); 
		setSize(350, 350); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">您獲得了一顆精靈球！</p></body></html>");
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
		
		// 將傳入的參數進行存取
		w = g;
		x = p;
		y = j;
		z = c;
		
		n = q;
		m = r;
		l = s;
		
		// 得到寶貝球數+1
		bn++;
		
		// 更新地圖與背包
		new map(w,x,y,z, q, r, s, bn);
		new backpack_map(bn);
		
		// 將成功取得提示視窗擺在最前方
		this.toFront();
	}

}
