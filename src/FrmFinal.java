import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class FrmFinal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmFinal frame = new FrmFinal();
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
	public FrmFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblxxxxxPesosX = new JLabel("$xxxxx pesos x equivalent a $yyyyy pesos x");
		lblxxxxxPesosX.setBounds(120, 44, 237, 14);
		contentPane.add(lblxxxxxPesosX);
		
		JButton btnVolverAlConvertidor = new JButton("Volver al Convertidor");
		btnVolverAlConvertidor.setBounds(159, 81, 141, 23);
		contentPane.add(btnVolverAlConvertidor);
	}
}
