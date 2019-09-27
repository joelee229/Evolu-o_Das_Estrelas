import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SuperNew extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperNew frame = new SuperNew();
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
	public SuperNew() {
		super("Supernova");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 453);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Estrela n\u00EAutrons");
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StarNeu frame = new StarNeu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(407, 349, 155, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buraco negro");
		btnNewButton_1.setFont(new Font("Segoe Print", Font.BOLD, 13));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Blackhole frame = new Blackhole();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(407, 283, 155, 55);
		contentPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("images/supernova-kepler-solves-mystery.gif"));
		label.setBounds(10, 11, 552, 261);
		contentPane.add(label);
		
		JLabel lblUmCorpo = new JLabel("<html><body>\u00C9 um corpo celeste que teve origem ap\u00F3s a explos\u00E3o de uma estrela cuja a massa \u00E9 aproximadamente 10 vezes maior do que o sol.<br>O brilho causado por essa explos\u00E3o pode demorar semanas ou at\u00E9 meses para desaparecer.</body></html>");
		lblUmCorpo.setForeground(Color.WHITE);
		lblUmCorpo.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblUmCorpo.setBounds(10, 283, 387, 121);
		contentPane.add(lblUmCorpo);
	}

}
