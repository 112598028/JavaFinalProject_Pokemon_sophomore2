import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class notget extends JFrame{
	
	// �����A�ϥ�
	JButton pic;
	
	public notget() {
		
		// �����]�m
		super("ĵ�i�I"); 
		setSize(400, 382); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("<html><body><p align=\"center\">�z�ثe�L�k���A�o���_�i�ڡI</p></body></html>");
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