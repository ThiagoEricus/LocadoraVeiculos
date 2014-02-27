package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;

public class tela_inicial_cliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_inicial_cliente frame = new tela_inicial_cliente();
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
	public tela_inicial_cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBemVindoSr = new JLabel("Bem vindo Sr\u00AA Thiago...\r\n");
		lblBemVindoSr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBemVindoSr.setBounds(10, 11, 214, 19);
		contentPane.add(lblBemVindoSr);
		
		JButton btnNewButton = new JButton("Alugar ve\u00EDculo");
		btnNewButton.setBounds(10, 62, 202, 137);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Reserva ve\u00EDculo");
		button.setBounds(222, 62, 202, 137);
		contentPane.add(button);
		
		JButton btnDevolverVeculo = new JButton("Devolver ve\u00EDculo");
		btnDevolverVeculo.setBounds(10, 210, 414, 41);
		contentPane.add(btnDevolverVeculo);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(244, 0, 180, 23);
		contentPane.add(btnLogout);
		
		JButton btnEditarContedoCadastrais = new JButton("Editar conte\u00FAdo cadastrais");
		btnEditarContedoCadastrais.setBounds(244, 28, 180, 23);
		contentPane.add(btnEditarContedoCadastrais);
	}
}
