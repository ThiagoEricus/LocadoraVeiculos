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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(177, 177, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente ");
		lblCliente.setFont(new Font("Schadow BT", Font.BOLD | Font.ITALIC, 15));
		lblCliente.setBounds(181, 97, 175, 32);
		contentPane.add(lblCliente);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setBounds(83, 140, 211, 26);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(99, 180, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(99, 211, 46, 14);
		contentPane.add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(177, 208, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		lblNewLabel.setBounds(80, 0, 239, 75);
		contentPane.add(lblNewLabel);
	}
}
