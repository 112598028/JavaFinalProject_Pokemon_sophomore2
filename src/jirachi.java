import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// 角色基拉祈介紹視窗
class jilachi extends JFrame{
	 public jilachi() {
		super("基拉祈");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">基拉祈<br/>屬性：超能力<br/>HP：6<br/>攻擊：6<br/>防禦：6<br/>速度：6</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}