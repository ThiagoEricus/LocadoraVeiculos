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

public class tela_adicionar_veiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField_7;
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
					tela_adicionar_veiculo frame = new tela_adicionar_veiculo();
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
	public tela_adicionar_veiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoCliente = new JLabel("Novo Veiculo");
		lblNovoCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNovoCliente.setBounds(230, 66, 131, 30);
		contentPane.add(lblNovoCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira os dados abaixo:");
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInsiraSeusDados.setBounds(19, 103, 211, 14);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("Chassis:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCpf.setBounds(28, 152, 71, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Cor:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSenha.setBounds(28, 239, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNome = new JLabel("Marca:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(302, 152, 59, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("KM:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDataDeNascimento.setBounds(28, 192, 36, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEstadoCivil = new JLabel("Placa:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEstadoCivil.setBounds(302, 192, 51, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblRenda = new JLabel("Modelo:");
		lblRenda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRenda.setBounds(302, 239, 71, 14);
		contentPane.add(lblRenda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(tela_adicionar_veiculo.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(159, 0, 256, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblValor.setBounds(28, 294, 46, 14);
		contentPane.add(lblValor);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(109, 142, 119, 33);
		contentPane.add(textField_7);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(109, 186, 119, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 233, 119, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 288, 119, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(418, 142, 119, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(418, 186, 119, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(418, 233, 119, 33);
		contentPane.add(textField_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 94, 562, 1);
		contentPane.add(panel);
		
		JButton button = new JButton("Salvar");
		button.setBounds(150, 357, 110, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar\r\n");
		button_1.setBounds(290, 357, 110, 33);
		contentPane.add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(272, 120, 1, 211);
		contentPane.add(panel_1);
	}
}
