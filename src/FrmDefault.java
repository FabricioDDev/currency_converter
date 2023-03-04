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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;

public class FrmDefault extends JFrame {

	private JPanel contentPane;
	private JTextField txtCant;

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
		
		JLabel lblDestinationMoney = new JLabel("Tipo Conversion:");
		lblDestinationMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDestinationMoney.setBounds(56, 60, 108, 14);
		contentPane.add(lblDestinationMoney);
		
		JComboBox cbxOriginMoney = new JComboBox();
		cbxOriginMoney.setModel(new DefaultComboBoxModel(new String[] {"ARS", "USD", "EUR", "JPY", "KRW", "GBP"}));
		cbxOriginMoney.setBounds(174, 59, 53, 20);
		contentPane.add(cbxOriginMoney);
		
		JLabel lblCant = new JLabel("Cantidad:");
		lblCant.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCant.setBounds(56, 109, 64, 14);
		contentPane.add(lblCant);
		
		txtCant = new JTextField();
		txtCant.setBounds(130, 108, 99, 20);
		contentPane.add(txtCant);
		txtCant.setColumns(10);
		
		JComboBox cbxDestinationMoney = new JComboBox();
		cbxDestinationMoney.setModel(new DefaultComboBoxModel(new String[] {"ARS", "USD", "EUR", "JPY", "KRW", "GBP"}));
		cbxDestinationMoney.setBounds(420, 59, 53, 20);
		contentPane.add(cbxDestinationMoney);
		
		JButton btnCleaner = new JButton("Limpiar");
		btnCleaner.setBounds(389, 107, 84, 23);
		contentPane.add(btnCleaner);
		
		JLabel lblWarning = new JLabel("");
		lblWarning.setBounds(111, 11, 46, 14);
		contentPane.add(lblWarning);
		
		JLabel label = new JLabel("Tipo Conversion:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(283, 62, 108, 14);
		contentPane.add(label);
		

		
		
		
		ArrayList<Money> MoneyList = new ArrayList<Money>();
		MoneyList.add(new Money("ARS", 1.00, 0.00508, 0.00479, 0.69283, 6.63601, 0.00423));
		MoneyList.add(new Money("USD", 197.68, 2.00, 0.94154, 136.611, 1311.88, 0.83531));
		MoneyList.add(new Money("EUR", 209.924, 1.06194, 1.00, 145.082, 1393.13, 0.88711));
		MoneyList.add(new Money("JPY", 1.44683, 0.00732, 0.00689, 1.00, 9.60171, 0.00611));
		MoneyList.add(new Money("KRW", 0.15054, 0.00076, 0.00072, 0.10403, 1.00, 0.00064));
		MoneyList.add(new Money("GBP", 236.608, 1.19692, 01.12702, 163.522, 1570.22, 1.00));
		
	
		JButton btnConvert = new JButton("Convertir");
		btnConvert.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
				Money OriginMoney = new Money();
				for(Money money : MoneyList) {
					if(money.Name == cbxOriginMoney.getSelectedItem()) {
						OriginMoney = money;
						break;
					}
				}
				String val = (String)cbxDestinationMoney.getSelectedItem();
				String t = txtCant.getText();
				if(OriginMoney != null) {
					Converter convert1 = new Converter(Double.parseDouble(txtCant.getText()),OriginMoney.Equivalents.get(val));
					Double Valor = convert1.convert();
					txtCant.setText(Valor.toString());
				}
			}  
		});
		btnConvert.setBounds(239, 107, 140, 23);
		contentPane.add(btnConvert);	
	}
}
