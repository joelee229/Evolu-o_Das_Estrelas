import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Blackhole extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Blackhole frame = new Blackhole();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Blackhole() {
		super("Black hole");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/BlackHole.gif"));
		lblNewLabel.setBounds(10, 11, 463, 243);
		contentPane.add(lblNewLabel);
		
		JLabel lblUmFenomno = new JLabel("<html><body>\u00C9 um fenom\u00EAno espacial de propor\u00E7\u00F5es elevad\u00EDssimas e com  massa extremamente compacta que resulta em um campo gracitacional t\u00E3o forte que nenhum tipo de particula ou radia\u00E7\u00E3o consegue sair.<br>Os astronomos e os cientistas afirmam que um buraco negro consegue ser observ\u00E1vel por conta da sua emiss\u00E3o de luz.</body></html>");
		lblUmFenomno.setForeground(Color.WHITE);
		lblUmFenomno.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblUmFenomno.setBounds(10, 265, 463, 212);
		contentPane.add(lblUmFenomno);
	}

}
