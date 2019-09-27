import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Fase1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fase1 frame = new Fase1();
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
	public Fase1() {
		super("Evolução");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icon = new ImageIcon("images/NuvemGas.gif");
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(114, 30, 400, 380);
		contentPane.add(lblNewLabel);
		
		JLabel lblNuvemInterestelar = new JLabel("<html><body>Nuvem interestelar \u00E9 um nome dado a um acumulo de g\u00E1s, plasma e poeira da nossa e de outras gal\u00E1xias e dá origem às estrelas.");
		lblNuvemInterestelar.setForeground(Color.WHITE);
		lblNuvemInterestelar.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNuvemInterestelar.setBounds(114, 421, 456, 111);
		contentPane.add(lblNuvemInterestelar);
		ImageIcon next = new ImageIcon("images/next-2.png");
		JButton button = new JButton(new ImageIcon("images/arrow1.png"));
		button.setBackground(Color.BLACK);
		button.setBounds(580, 467, 79, 79);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaseInter frame = new FaseInter();
				frame.setVisible(true);
				dispose();
				//System.exit(DISPOSE_ON_CLOSE);
			}
		});
		contentPane.add(button);
	}

}
