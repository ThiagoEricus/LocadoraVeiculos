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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class tela_reservar_veiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_5;
	private JTextField textField;

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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChassis = new JLabel("CPF\r\n");
		lblChassis.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChassis.setBounds(44, 167, 38, 27);
		contentPane.add(lblChassis);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(322, 167, 65, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblDataInicial = new JLabel("Data inicial:");
		lblDataInicial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDataInicial.setBounds(10, 258, 92, 30);
		contentPane.add(lblDataInicial);
		
		JLabel lblDataFinal = new JLabel("Data final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDataFinal.setBounds(300, 258, 117, 30);
		contentPane.add(lblDataFinal);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(123, 258, 24, 30);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(428, 186, 117, 33);
		contentPane.add(textField_3);
		
		JLabel lblParaAlugarO = new JLabel("Para alugar o carro insira os dados do pedido abaixo:");
		lblParaAlugarO.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblParaAlugarO.setBounds(37, 126, 444, 14);
		contentPane.add(lblParaAlugarO);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(tela_reservar_veiculo.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel_1.setBounds(137, 0, 302, 77);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLocandoUmCarro = new JLabel("Reservando um veiculo");
		lblLocandoUmCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblLocandoUmCarro.setBounds(193, 90, 168, 14);
		contentPane.add(lblLocandoUmCarro);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 258, 24, 30);
		contentPane.add(textField_4);
		
		JLabel label = new JLabel(" /");
		label.setBounds(148, 261, 13, 27);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("  /");
		label_1.setBounds(182, 261, 13, 27);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(160, 336, 110, 33);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(428, 258, 24, 30);
		contentPane.add(textField_2);
		
		JLabel label_2 = new JLabel(" /");
		label_2.setBounds(453, 261, 13, 27);
		contentPane.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(465, 258, 24, 30);
		contentPane.add(textField_6);
		
		JLabel label_3 = new JLabel("  /");
		label_3.setBounds(487, 261, 13, 27);
		contentPane.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(499, 258, 45, 30);
		contentPane.add(textField_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(582, 120, -575, -3);
		contentPane.add(separator);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(197, 258, 45, 30);
		contentPane.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 112, 562, 3);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(276, 168, 3, 157);
		contentPane.add(panel_1);
		
		JButton btnCancelar = new JButton("Cancelar\r\n");
		btnCancelar.setBounds(300, 336, 110, 33);
		contentPane.add(btnCancelar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 186, 119, 33);
		contentPane.add(textField);
		
		JLabel lblClientete = new JLabel("do cliente:");
		lblClientete.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblClientete.setBounds(24, 205, 89, 14);
		contentPane.add(lblClientete);
		
		JLabel lblDoVeiculo = new JLabel("do veiculo:");
		lblDoVeiculo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDoVeiculo.setBounds(310, 205, 86, 14);
		contentPane.add(lblDoVeiculo);
	}
}
