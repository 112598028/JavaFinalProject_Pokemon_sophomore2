import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// 角色皮卡丘介紹視窗
class pikachu extends JFrame{
	
	 public pikachu() {
		super("皮卡丘");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">皮卡丘<br/>屬性：電<br/>HP：3<br/>攻擊：4<br/>防禦：3<br/>速度：6</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}