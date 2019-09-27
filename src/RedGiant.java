import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class RedGiant extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RedGiant frame = new RedGiant();
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
	public RedGiant() {
		super("Red Giant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 444);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUmaFase = new JLabel("<html><body>\u00C9 uma fase da estrela  </body></html");
		lblUmaFase.setBounds(10, 316,  451, 79);
		contentPane.add(lblUmaFase);
		
		JButton button = new JButton("");
		button.setBackground(Color.BLACK);
		button.setIcon(new ImageIcon("images/arrow1.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NebPlan frame = new NebPlan();
				frame.setVisible(true);
				dispose();
				//System.exit(DISPOSE_ON_CLOSE);
			}
		});
		button.setBounds(471, 316, 79, 79);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("images/RedGiant.gif"));
		label.setBounds(122, 11, 325, 277);
		contentPane.add(label);
	}
}
