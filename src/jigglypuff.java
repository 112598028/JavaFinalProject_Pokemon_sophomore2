import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// ¨¤¦â­D¤B¤¶²Ðµøµ¡
class jigglypuff extends JFrame{
	 public jigglypuff() {
		super("­D¤B");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">­D¤B<br/>ÄÝ©Ê¡G§¯ºë<br/>HP¡G5<br/>§ðÀ»¡G2<br/>¨¾¿m¡G1<br/>³t«×¡G1</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}