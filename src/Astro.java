import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;

public class Astro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Astro frame = new Astro();
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
	public Astro() {
		super("Astrofísica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907	, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon back = new ImageIcon("images/nebulous-1.jpg");
		
		JLabel frase = new JLabel("<html><body>Bem vind@ ao mundo da astrof\u00EDsica,<br/> nessa jornada voc\u00EA ir\u00E1 ver a evolu\u00E7\u00E3o de uma estrela. <br/>E desmentir algumas proposi\u00E7\u00F5es.</body></html>");
		frase.setForeground(Color.WHITE);
		frase.setHorizontalAlignment(SwingConstants.LEFT);
		frase.setFont(new Font("Segoe Print", Font.BOLD, 40));
		frase.setBounds(47, 0, 750, 309);
		contentPane.add(frase);
		
		JButton btnCliqueAqui = new JButton("Clique aqui");
		btnCliqueAqui.setBackground(SystemColor.activeCaption);
		btnCliqueAqui.setForeground(new Color(0, 0, 0));
		btnCliqueAqui.setFont(new Font("Segoe Print", Font.BOLD, 18));
		btnCliqueAqui.setBounds(285, 339, 267, 83);
		btnCliqueAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fase1 lin = new Fase1();
				lin.setVisible(true);
				dispose();
				//System.exit(DISPOSE_ON_CLOSE);
			}
		});
		contentPane.add(btnCliqueAqui);
		JLabel lblNewLabel = new JLabel(back);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 47));
		lblNewLabel.setBounds(0, 0, 891, 461);
		contentPane.add(lblNewLabel);
		
	}
}
