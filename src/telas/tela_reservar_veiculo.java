package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;

public class tela_reservar_veiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_reservar_veiculo frame = new tela_reservar_veiculo();
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
	public tela_reservar_veiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChassis = new JLabel("CPF do cliente:\r\n");
		lblChassis.setBounds(68, 140, 92, 14);
		contentPane.add(lblChassis);
		
		JLabel lblNewLabel = new JLabel("Numero do veiculo:");
		lblNewLabel.setBounds(68, 233, 92, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setBounds(68, 171, 92, 14);
		contentPane.add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data final:");
		lblDataFinal.setBounds(68, 202, 92, 14);
		contentPane.add(lblDataFinal);
		
		textField = new JTextField();
		textField.setBounds(197, 137, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 168, 24, 20);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(197, 230, 86, 20);
		contentPane.add(textField_3);
		
		JLabel lblParaAlugarO = new JLabel("Para alugar o carro insira os dados do pedido abaixo:");
		lblParaAlugarO.setBounds(45, 115, 303, 14);
		contentPane.add(lblParaAlugarO);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		lblNewLabel_1.setBounds(46, 0, 302, 77);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLocandoUmCarro = new JLabel("Reservando um veiculo");
		lblLocandoUmCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblLocandoUmCarro.setBounds(117, 88, 168, 14);
		contentPane.add(lblLocandoUmCarro);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(234, 168, 24, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(268, 168, 38, 20);
		contentPane.add(textField_5);
		
		JLabel label = new JLabel(" /");
		label.setBounds(222, 171, 13, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("  /");
		label_1.setBounds(256, 171, 13, 14);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 199, 24, 20);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel(" /");
		label_2.setBounds(222, 202, 13, 14);
		contentPane.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(234, 199, 24, 20);
		contentPane.add(textField_6);
		
		JLabel label_3 = new JLabel("  /");
		label_3.setBounds(256, 202, 13, 14);
		contentPane.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(268, 199, 38, 20);
		contentPane.add(textField_7);
	}
}
