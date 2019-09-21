import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaseInter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaseInter frame = new FaseInter();
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
	public FaseInter() {
		super("Fase intermediária");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 448);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon sol = new ImageIcon("images/Sol.gif");
		JButton btnNewButton = new JButton(sol);
		btnNewButton.setBounds(34, 45, 256, 256);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fase2Sol frame = new Fase2Sol();
				frame.setVisible(true);
				dispose();
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblEstrelaComoSol = new JLabel("Estrela como Sol");
		lblEstrelaComoSol.setForeground(Color.WHITE);
		lblEstrelaComoSol.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblEstrelaComoSol.setBounds(34, 312, 256, 37);
		contentPane.add(lblEstrelaComoSol);
		ImageIcon solMass = new ImageIcon("images/EstrelaMassiva-1.jpg");
		JButton btnNewButton_1 = new JButton(solMass);
		btnNewButton_1.setBounds(379, 80, 256, 198);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fase2Mass frame = new Fase2Mass();
				frame.setVisible(true);
				dispose();
				//System.exit(DISPOSE_ON_CLOSE);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Estrela massiva");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 20));
		lblNewLabel.setBounds(379, 289, 256, 29);
		contentPane.add(lblNewLabel);
	}

}
