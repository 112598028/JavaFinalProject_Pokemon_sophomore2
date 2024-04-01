import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// ¨¤¦â¯Õ°­¤¶²Ðµøµ¡
class gengar extends JFrame{
	 public gengar() {
		super("¯Õ°­");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">¯Õ°­<br/>ÄÝ©Ê¡G¬r<br/>HP¡G4<br/>§ðÀ»¡G4<br/>¨¾¿m¡G4<br/>³t«×¡G7</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}