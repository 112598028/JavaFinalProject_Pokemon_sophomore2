import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class notget extends JFrame{
	
	// 未收服圖示
	JButton pic;
	
	public notget() {
		
		// 版面設置
		super("警告！"); 
		setSize(400, 382); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">您目前無法收服這隻寶可夢！</p></body></html>");
		label.setSize(200, 200);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		jp.add(label);
		
		ImageIcon a = new ImageIcon("images\\chopper.gif");
		pic = new JButton(a); 
		pic.setSize(340, 300); 
		pic.setBackground(Color.WHITE);
		pic.setVisible(true);
	    jp.add(pic);
		
		this.add(jp);
	}
}