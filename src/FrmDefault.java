import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmDefault extends JFrame {

	private JPanel contentPane;
	private JTextField txtInputValue;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Conversor de Moneda");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitle.setBounds(10, 11, 171, 32);
		contentPane.add(lblTitle);
		
		JLabel lblInputValue = new JLabel(" Peso Argentino: $");
		lblInputValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInputValue.setBounds(10, 86, 125, 20);
		contentPane.add(lblInputValue);
		
		txtInputValue = new JTextField();
		txtInputValue.setBounds(132, 88, 86, 20);
		contentPane.add(txtInputValue);
		txtInputValue.setColumns(10);
		
		JLabel lblMoneyTypeList = new JLabel("Convertir a:");
		lblMoneyTypeList.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMoneyTypeList.setBounds(37, 139, 89, 20);
		contentPane.add(lblMoneyTypeList);
		
		JButton btnConvert = new JButton("Convertir");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnConvert.setBounds(132, 209, 86, 23);
		contentPane.add(btnConvert);
		
		JComboBox cbxMoneyTypeList = new JComboBox();
		cbxMoneyTypeList.setEditable(true);
		cbxMoneyTypeList.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbxMoneyTypeList.setModel(new DefaultComboBoxModel(new String[] {"Dolar", "Euro", "Yen"}));
		cbxMoneyTypeList.setBounds(132, 141, 86, 20);
		contentPane.add(cbxMoneyTypeList);
	}
}
