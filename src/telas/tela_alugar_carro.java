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
import javax.swing.JSeparator;
import java.awt.Color;

public class tela_alugar_carro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 584, 412);
		contentPane.add(panel);
		
		JLabel label = new JLabel("CPF\r\n");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(44, 167, 38, 27);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Numero");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(322, 167, 65, 27);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Data inicial:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(10, 258, 92, 30);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Data final:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(300, 258, 117, 30);
		panel.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(123, 258, 24, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(428, 186, 117, 33);
		panel.add(textField_1);
		
		JLabel label_4 = new JLabel("Para alugar o carro insira os dados do pedido abaixo:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(37, 126, 444, 30);
		panel.add(label_4);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 258, 24, 30);
		panel.add(textField_2);
		
		JLabel label_6 = new JLabel(" /");
		label_6.setBounds(148, 261, 13, 27);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("  /");
		label_7.setBounds(182, 261, 13, 27);
		panel.add(label_7);
		
		JButton button = new JButton("Salvar");
		button.setBounds(160, 336, 110, 33);
		panel.add(button);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(428, 258, 24, 30);
		panel.add(textField_3);
		
		JLabel label_8 = new JLabel(" /");
		label_8.setBounds(453, 261, 13, 27);
		panel.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(465, 258, 24, 30);
		panel.add(textField_4);
		
		JLabel label_9 = new JLabel("  /");
		label_9.setBounds(487, 261, 13, 27);
		panel.add(label_9);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(499, 258, 45, 30);
		panel.add(textField_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(582, 120, -575, -3);
		panel.add(separator);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(197, 258, 45, 30);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 112, 562, 3);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(276, 168, 3, 157);
		panel.add(panel_2);
		
		JButton button_1 = new JButton("Cancelar\r\n");
		button_1.setBounds(300, 336, 110, 33);
		panel.add(button_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(123, 186, 119, 33);
		panel.add(textField_7);
		
		JLabel label_10 = new JLabel("do cliente:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_10.setBounds(24, 205, 89, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("do veiculo:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_11.setBounds(310, 205, 86, 14);
		panel.add(label_11);
		
		JLabel lblAlugandoUmCarro = new JLabel("Alugando um carro");
		lblAlugandoUmCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAlugandoUmCarro.setBounds(182, 76, 186, 30);
		panel.add(lblAlugandoUmCarro);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(148, 0, 258, 77);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(tela_alugar_carro.class.getResource("/telas/Imagens/Logomarca.png")));
	}
}
