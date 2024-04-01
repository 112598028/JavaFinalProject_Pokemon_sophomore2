import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

// 可收服神奇寶貝提示視窗
class hint extends JFrame{
	
	public hint() {
		
		// 版面設置
		super("提示!"); 
		setSize(250,110); 
		setLocation(200, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		setVisible(true);
			
		JPanel jp = new JPanel();
		jp.setBackground(Color.WHITE);
		
		jp.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("<html><body><p align=\"center\">對方HP值已低於3<br/>可使用精靈球收服！</p></body></html>");
		label.setSize(200,200);
		label.setFont(new java.awt.Font("Microsoft JhengHei", 1, 20));
		label.setLocation(0, 0);
		jp.add(label);
		
		this.add(jp);
	}
}