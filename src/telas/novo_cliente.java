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

public class novo_cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		lblNovoCliente.setFont(new Font("Simplified Arabic", Font.BOLD | Font.ITALIC, 17));
		lblNovoCliente.setBounds(148, 61, 131, 30);
		contentPane.add(lblNovoCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblInsiraSeusDados.setBounds(68, 87, 211, 14);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(68, 112, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(68, 212, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(68, 137, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setBounds(68, 162, 117, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setBounds(68, 187, 96, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblRenda = new JLabel("Renda:");
		lblRenda.setBounds(68, 237, 46, 14);
		contentPane.add(lblRenda);
		
		textField = new JTextField();
		textField.setBounds(193, 110, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 136, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 160, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(193, 184, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(193, 209, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(193, 234, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(novo_cliente.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(63, 0, 305, 70);
		contentPane.add(lblNewLabel);
	}

}
