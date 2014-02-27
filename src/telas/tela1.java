package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class tela1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela1 frame = new tela1();
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
	public tela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\funcionario.png"));
		button.setBounds(225, 71, 173, 109);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\icone_clientes.png"));
		button_1.setBounds(37, 71, 173, 109);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\adicionar_pessoa_fisica_pequena.png"));
		btnNewButton.setBounds(37, 196, 361, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblCliente.setBounds(100, 182, 53, 14);
		contentPane.add(lblCliente);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblFuncionrio.setBounds(278, 183, 79, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNovoCliente = new JLabel("Novo cliente");
		lblNovoCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNovoCliente.setBounds(183, 236, 85, 14);
		contentPane.add(lblNovoCliente);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		label.setBounds(76, 0, 260, 70);
		contentPane.add(label);
	}
}
