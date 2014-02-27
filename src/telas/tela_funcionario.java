package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class tela_funcionario extends JFrame {

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
					tela_funcionario frame = new tela_funcionario();
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
	public tela_funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Segoe WP", Font.PLAIN, 17));
		lblFuncionrio.setForeground(new Color(0, 0, 0));
		lblFuncionrio.setBounds(165, 11, 128, 24);
		contentPane.add(lblFuncionrio);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(111, 87, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel label = new JLabel("Senha:\r\n");
		label.setBounds(111, 133, 46, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(182, 84, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 130, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setBounds(79, 46, 214, 30);
		contentPane.add(lblInsiraSeusDados);
	}

}
