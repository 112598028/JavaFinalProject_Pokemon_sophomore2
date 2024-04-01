import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// ¨¤¦â¥ì¥¬¤¶²Ðµøµ¡
class eevee extends JFrame{
	 public eevee() {
		super("¥ì¥¬");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">¥ì¥¬<br/>ÄÝ©Ê¡G¤@¯ë<br/>HP¡G4<br/>§ðÀ»¡G4<br/>¨¾¿m¡G3<br/>³t«×¡G4</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}
