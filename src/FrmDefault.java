import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrmDefault extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDefault frame = new FrmDefault();
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
	public FrmDefault() {
		setBackground(UIManager.getColor("CheckBox.background"));
		setResizable(false);
		setTitle("Convertidor de Moneda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonedaDeOrigen = new JLabel("Moneda origen:");
		lblMonedaDeOrigen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonedaDeOrigen.setBounds(21, 57, 99, 21);
		contentPane.add(lblMonedaDeOrigen);
		
		JLabel lblMonedaDeDestino = new JLabel("Moneda de destino:");
		lblMonedaDeDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonedaDeDestino.setBounds(239, 60, 125, 14);
		contentPane.add(lblMonedaDeDestino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ARS", "EUR", "USD", "JPY", "KRW", "GBP"}));
		comboBox.setBounds(130, 57, 99, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ARS", "EUR", "USD", "JPY", "KRW", "GBP"}));
		comboBox_1.setBounds(374, 59, 99, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(56, 109, 64, 14);
		contentPane.add(lblCantidad);
		
		textField = new JTextField();
		textField.setBounds(130, 108, 99, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(239, 107, 140, 23);
		contentPane.add(btnConvertir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(389, 107, 84, 23);
		contentPane.add(btnLimpiar);
	}
}
