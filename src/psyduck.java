import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// ����i�F�n���е���
class psyduck extends JFrame{
	 public psyduck() {
		super("�i�F�n");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">�i�F�n<br/>�ݩʡG��<br/>HP�G3<br/>�����G4<br/>���m�G3<br/>�t�סG4</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}