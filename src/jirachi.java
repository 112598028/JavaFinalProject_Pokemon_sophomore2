import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// �����Ԭ褶�е���
class jilachi extends JFrame{
	 public jilachi() {
		super("��Ԭ�");  
		setSize(239, 220); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
		
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label=new JLabel("<html><body><p align=\"center\">��Ԭ�<br/>�ݩʡG�W��O<br/>HP�G6<br/>�����G6<br/>���m�G6<br/>�t�סG6</p></body></html>");
		label.setSize(200,200);
		label.setLocation(0, 0);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		jp.add(label);
		
		this.add(jp);
	 }
}