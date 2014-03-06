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
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.DropMode;
import javax.swing.JButton;

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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(tela_funcionario.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(134, 0, 258, 79);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(125, 180, 119, 33);
		contentPane.add(textField);
		
		JLabel label = new JLabel("CPF:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(69, 186, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Insira seus dados abaixo:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(20, 119, 211, 26);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Senha:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(324, 186, 68, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(398, 180, 119, 33);
		contentPane.add(textField_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(283, 154, 2, 87);
		contentPane.add(panel);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFuncionrio.setBounds(236, 74, 90, 32);
		contentPane.add(lblFuncionrio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 105, 562, 1);
		contentPane.add(panel_1);
		
		JButton button = new JButton("Salvar");
		button.setBounds(157, 322, 110, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar\r\n");
		button_1.setBounds(297, 322, 110, 33);
		contentPane.add(button_1);
	}

}
