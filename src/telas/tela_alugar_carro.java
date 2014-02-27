package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class tela_alugar_carro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_alugar_carro frame = new tela_alugar_carro();
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
	public tela_alugar_carro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChassis = new JLabel("CPF do cliente:\r\n");
		lblChassis.setBounds(46, 63, 92, 14);
		contentPane.add(lblChassis);
		
		JLabel lblNewLabel = new JLabel("Numero do veiculo:");
		lblNewLabel.setBounds(46, 185, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setBounds(46, 100, 92, 14);
		contentPane.add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data final:");
		lblDataFinal.setBounds(46, 137, 92, 14);
		contentPane.add(lblDataFinal);
		
		textField = new JTextField();
		textField.setBounds(148, 60, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 97, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 134, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 182, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblParaAlugarO = new JLabel("Para alugar o carro insira os dados do pedido abaixo:");
		lblParaAlugarO.setBounds(46, 11, 303, 14);
		contentPane.add(lblParaAlugarO);
	}

}
