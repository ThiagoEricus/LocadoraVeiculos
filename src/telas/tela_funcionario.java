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

public class tela_funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtXxxxxxxxxxx;
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
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Segoe WP", Font.PLAIN, 17));
		lblFuncionrio.setForeground(new Color(0, 0, 0));
		lblFuncionrio.setBounds(165, 90, 128, 24);
		contentPane.add(lblFuncionrio);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(111, 162, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel label = new JLabel("Senha:\r\n");
		label.setBounds(111, 204, 46, 14);
		contentPane.add(label);
		
		txtXxxxxxxxxxx = new JTextField();
		txtXxxxxxxxxxx.setToolTipText("");
		txtXxxxxxxxxxx.setBounds(182, 159, 86, 20);
		contentPane.add(txtXxxxxxxxxxx);
		txtXxxxxxxxxxx.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(182, 201, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblInsiraSeusDados = new JLabel("Insira seus dados abaixo:");
		lblInsiraSeusDados.setBounds(95, 125, 214, 30);
		contentPane.add(lblInsiraSeusDados);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		lblNewLabel.setBounds(72, 0, 311, 79);
		contentPane.add(lblNewLabel);
	}

}
