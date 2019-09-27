import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class StarNeu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StarNeu frame = new StarNeu();
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
	public StarNeu() {
		super("Estrela de nêutrons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 407);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("images/neutron-star.gif"));
		label.setBounds(10, 11, 621, 233);
		contentPane.add(label);
		
		JLabel lblUmEstgio = new JLabel("<html><body>\u00C9 um est\u00E1gio na vida de estrelas muito grandes que depois de consumir todo hidrog\u00EAnio em seu n\u00FAcleo e explodir em uma supernova, pode virar um corpo celeste extremamente denso e compacto onde n\u00E3o h\u00E1 mais \u00E1tomos.</body></html>");
		lblUmEstgio.setForeground(Color.WHITE);
		lblUmEstgio.setFont(new Font("Segoe Print", Font.BOLD, 15));
		lblUmEstgio.setBounds(20, 255, 611, 127);
		contentPane.add(lblUmEstgio);
	}

}
