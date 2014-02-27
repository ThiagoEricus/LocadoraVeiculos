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

public class tela_adicionar_veiculo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoCliente = new JLabel("Novo Veiculo");
		lblNovoCliente.setFont(new Font("Simplified Arabic", Font.BOLD | Font.ITALIC, 17));
		lblNovoCliente.setBounds(148, 61, 131, 30);
		contentPane.add(lblNovoCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira os dados abaixo:");
		lblInsiraSeusDados.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblInsiraSeusDados.setBounds(10, 87, 211, 14);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("Charssis:");
		lblCpf.setBounds(34, 112, 71, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Cor:");
		lblSenha.setBounds(34, 212, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNome = new JLabel("Marca:");
		lblNome.setBounds(34, 137, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("KM:");
		lblDataDeNascimento.setBounds(34, 162, 117, 14);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEstadoCivil = new JLabel("Placa:");
		lblEstadoCivil.setBounds(34, 187, 96, 14);
		contentPane.add(lblEstadoCivil);
		
		JLabel lblRenda = new JLabel("Modelo:");
		lblRenda.setBounds(34, 237, 46, 14);
		contentPane.add(lblRenda);
		
		textField = new JTextField();
		textField.setBounds(134, 109, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 134, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 159, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 184, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 209, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(134, 234, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		lblNewLabel.setBounds(64, 0, 305, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("| Valor:");
		lblValor.setBounds(246, 112, 46, 14);
		contentPane.add(lblValor);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(313, 109, 86, 20);
		contentPane.add(textField_6);
	}
}
