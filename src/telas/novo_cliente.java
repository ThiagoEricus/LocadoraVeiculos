package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JButton;

public class novo_cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField TxCpf;
	private JTextField txDtNascimento;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					novo_cliente frame = new novo_cliente();
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
	public novo_cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoCliente = new JLabel("Novo Cliente");
		lblNovoCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNovoCliente.setBounds(227, 66, 131, 30);
		contentPane.add(lblNovoCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInsiraSeusDados.setBounds(25, 107, 211, 14);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpf.setBounds(53, 143, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(53, 243, 60, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(313, 143, 60, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDataDeNascimento.setBounds(53, 192, 74, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEstadoCivil.setBounds(313, 192, 96, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblRenda = new JLabel("Renda:");
		lblRenda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRenda.setBounds(313, 242, 66, 14);
		contentPane.add(lblRenda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(novo_cliente.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(153, 0, 269, 70);
		contentPane.add(lblNewLabel);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(421, 137, 119, 33);
		contentPane.add(textField_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(421, 186, 119, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(421, 236, 119, 33);
		contentPane.add(textField_1);
		
		JLabel lblNascimento = new JLabel("nascimento:");
		lblNascimento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNascimento.setBounds(36, 205, 95, 14);
		contentPane.add(lblNascimento);
		
		TxCpf = new JTextField();
		TxCpf.setColumns(10);
		TxCpf.setBounds(153, 137, 119, 33);
		contentPane.add(TxCpf);
		
		txDtNascimento = new JTextField();
		txDtNascimento.setColumns(10);
		txDtNascimento.setBounds(153, 187, 119, 33);
		contentPane.add(txDtNascimento);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 237, 119, 33);
		contentPane.add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 97, 562, 1);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(297, 97, 1, 211);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 307, 562, 1);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(571, 97, 1, 211);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(10, 97, 1, 211);
		contentPane.add(panel_4);
		
		JButton button = new JButton("Salvar");
		button.setBounds(172, 337, 110, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar\r\n");
		button_1.setBounds(312, 337, 110, 33);
		contentPane.add(button_1);
	}

}
