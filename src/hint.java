import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// �i���A���_�_�����ܵ���
class hint extends JFrame{
	
	public hint() {
		
		// �����]�m
		super("����!"); 
		setSize(250,110); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("<html><body><p align=\"center\">���HP�Ȥw�C��3<br/>�i�ϥκ��F�y���A�I</p></body></html>");
		label.setSize(200,200);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		label.setLocation(0, 0);
		jp.add(label);
		
		this.add(jp);
	}
}