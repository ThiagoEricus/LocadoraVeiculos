package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;

public class tela_cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_cliente frame = new tela_cliente();
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
	public tela_cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente ");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCliente.setBounds(250, 73, 66, 32);
		contentPane.add(lblCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInsiraSeusDados.setBounds(20, 116, 211, 26);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpf.setBounds(69, 183, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(324, 183, 68, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(tela_cliente.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(157, 0, 239, 75);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 177, 119, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(398, 177, 119, 33);
		contentPane.add(textField_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 102, 562, 1);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(283, 151, 2, 87);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Salvar");
		button.setBounds(157, 319, 110, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar\r\n");
		button_1.setBounds(297, 319, 110, 33);
		contentPane.add(button_1);
	}
}
