import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class card extends JFrame implements ActionListener{

	// �]�m�d�P
	JButton jb[] = new JButton[9];
	
	public card(int g,int p,int j,int c) {
		
		// �]�m����
		this.setSize(426, 503);
		this.setLocation(574, 50);
		this.setVisible(true); 
		this.setTitle("�d�P");
		
		// �]�m��d�����a��
		JPanel jp = new JPanel();
		GridLayout gl = new GridLayout(3,3);
		jp.setLayout(gl);
				
		for(int i=0; i<9; i++) {
			jb[i] = new JButton();
			jb[i].setSize(122, 151);
			jb[i].setBackground(Color.WHITE);
			jp.add(jb[i]);
		}
		
		// �֥d�C�d�P
		String card_pikachu_path = "images/card_pikachu.png";
		ImageIcon card_pikachu_icon = new ImageIcon(card_pikachu_path);
		jb[0].setIcon(card_pikachu_icon);
		jb[0].addActionListener(this);
		
		// �쥬�d�P
		String card_Eevee_path = "images/card_Eevee.png";
		ImageIcon card_Eevee_icon = new ImageIcon(card_Eevee_path);
		jb[1].setIcon(card_Eevee_icon);
		jb[1].addActionListener(this);
		
		// �D�B�d�P
		String card_Jigglypuff_path = "images/card_Jigglypuff.png";
		ImageIcon card_Jigglypuff_icon = new ImageIcon(card_Jigglypuff_path);
		jb[2].setIcon(card_Jigglypuff_icon);
		jb[2].addActionListener(this);
		
		// ��Ԭ�d�P
		String card_Jirachi_path = "images/card_Jirachi.png";
		ImageIcon card_Jirachi_icon = new ImageIcon(card_Jirachi_path);
		jb[3].setIcon(card_Jirachi_icon);
		jb[3].addActionListener(this);
		
		// �p�G���A��հ�
		if(g == 1) {
			String card_Gengar_path = "images/card_Gengar.png";
			ImageIcon card_Gengar_icon = new ImageIcon(card_Gengar_path);
			jb[4].setIcon(card_Gengar_icon);
			jb[4].addActionListener(this);
		}
		
		// �p�G���A�짮���ؤl
		if(p == 1) {
			String card_Bulbasaur_path = "images/card_Bulbasaur.png";
			ImageIcon card_Bulbasaur_icon = new ImageIcon(card_Bulbasaur_path);
			jb[5].setIcon(card_Bulbasaur_icon);
			jb[5].addActionListener(this);
		}
		
		// �p�G���A��i�F�n
		if(j == 1) {
			String card_Psyduck_path = "images/card_Psyduck.png";
			ImageIcon card_Psyduck_icon = new ImageIcon(card_Psyduck_path);
			jb[6].setIcon(card_Psyduck_icon);
			jb[6].addActionListener(this);
		}
		
		// �p�G���A��p���s
		if(c == 1) {
			String card_Charmander_path = "images/card_Charmander.png";
			ImageIcon card_Charmander_icon = new ImageIcon(card_Charmander_path);
			jb[7].setIcon(card_Charmander_icon);
			jb[7].addActionListener(this);
		}
		
		// ��W���D
		JPanel nev_jp = new JPanel();
		JLabel jl = new JLabel("�_�i�ڥd�P", SwingConstants.CENTER);
		jl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 25));
		nev_jp.add(jl);
		
		// �e���ƪ�
		JPanel lf_jp = new JPanel();
		JPanel ri_jp = new JPanel();
			
		lf_jp.setPreferredSize(new Dimension(30, 500));
		ri_jp.setPreferredSize(new Dimension(30, 500));
	
		this.add(lf_jp, BorderLayout.WEST);
		this.add(ri_jp, BorderLayout.EAST);
		this.add(nev_jp, BorderLayout.NORTH);
		this.add(jp, BorderLayout.CENTER);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton source_jb =(JButton)arg0.getSource();
		
		// �I���d�P�d�ݨ䨤��]�w
		if(source_jb == jb[0]) {
			pikachu cc = new pikachu();
		}else if(source_jb == jb[1]) {
			eevee cc = new eevee();
		}else if(source_jb == jb[2]) {
			jigglypuff cc = new jigglypuff();
		}else if(source_jb == jb[3]) {
			jilachi cc = new jilachi();
		}else if(source_jb == jb[4]) {
			gengar cc = new gengar();
		}else if(source_jb == jb[5]) {
			bulbasaur cc = new bulbasaur();
		}else if(source_jb == jb[6]) {
			psyduck cc = new psyduck();
		}else if(source_jb == jb[7]) {
			charmander cc = new charmander();
		}
	}
}