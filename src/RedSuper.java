import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class RedSuper extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedSuper frame = new RedSuper();
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
	public RedSuper() {
		super("Red Super");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 558);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("images/arrow1.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuperNew frame = new SuperNew();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(522, 430, 79, 79);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("images/SuperGiant.gif"));
		label.setBounds(50, 11, 531, 302);
		contentPane.add(label);
		
		JLabel lblelasPodemTer = new JLabel("<html><body>Elas podem ter massas de 8 a 70 massas solares e, brilho de 30000 a centenas de milhares de vezes a luminosidade do sol.<br>Possuem um ciclo de vida de somente 10 a 50 milh\u00F5es de anos.</body></html>");
		lblelasPodemTer.setFont(new Font("Segoe Print", Font.BOLD, 18));
		lblelasPodemTer.setForeground(Color.WHITE);
		lblelasPodemTer.setBounds(10, 324, 502, 185);
		contentPane.add(lblelasPodemTer);
	}

}
