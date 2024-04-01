import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// 角色小火龍介紹視窗
class charmander extends JFrame{
	 public charmander() {
		super("小火龍");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">小火龍<br/>屬性：火<br/>HP：3<br/>攻擊：4<br/>防禦：3<br/>速度：4</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}