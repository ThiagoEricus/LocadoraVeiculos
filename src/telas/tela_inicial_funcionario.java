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
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class tela_inicial_funcionario extends JFrame {

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
	public tela_inicial_funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBemVindoSr = new JLabel("Bem vindo Sr\u00AA Thiago...\r\n");
		lblBemVindoSr.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblBemVindoSr.setBounds(10, 101, 214, 19);
		contentPane.add(lblBemVindoSr);

		JButton btnNewButton = new JButton("Adicionar Veiculo");
		btnNewButton.setBounds(10, 131, 202, 78);
		contentPane.add(btnNewButton);

		JButton btnAdicionarFuncionario = new JButton("Adicionar Funcionario\r\n");
		btnAdicionarFuncionario.setBounds(222, 131, 202, 78);
		contentPane.add(btnAdicionarFuncionario);

		JButton btnDevolverVeculo = new JButton("Retirar Veiculo\r\n");
		btnDevolverVeculo.setBounds(10, 219, 414, 32);
		contentPane.add(btnDevolverVeculo);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(261, 73, 163, 23);
		contentPane.add(btnLogout);

		JButton btnEditarContedoCadastrais = new JButton(
				"Editar conte\u00FAdo cadastrais");
		btnEditarContedoCadastrais.setBounds(261, 101, 163, 23);
		contentPane.add(btnEditarContedoCadastrais);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(tela_inicial_funcionario.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(76, 0, 248, 78);
		contentPane.add(lblNewLabel);
	}
}
