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
import java.awt.Color;

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
		lblBemVindoSr.setBounds(22, 77, 214, 19);
		contentPane.add(lblBemVindoSr);

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(404, 23, 149, 23);
		contentPane.add(btnLogout);

		JButton btnEditarContedoCadastrais = new JButton(
				"Editar conte\u00FAdo cadastrais");
		btnEditarContedoCadastrais.setBounds(404, 46, 149, 23);
		contentPane.add(btnEditarContedoCadastrais);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(tela_inicial_funcionario.class.getResource("/telas/Imagens/Logomarca.png")));
		lblNewLabel.setBounds(154, 0, 230, 78);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("Adicionar Veiculo");
		button.setBounds(209, 122, 163, 78);
		contentPane.add(button);
		
		JButton btnAdicionarCliente = new JButton("Adicionar Cliente");
		btnAdicionarCliente.setBounds(22, 122, 163, 78);
		contentPane.add(btnAdicionarCliente);
		
		JButton btnListarVeiculosAlugados = new JButton("Listar veiculos alugados");
		btnListarVeiculosAlugados.setBounds(209, 300, 163, 78);
		contentPane.add(btnListarVeiculosAlugados);
		
		JButton btnAdicionarFuncionario = new JButton("Adicionar funcion\u00E1rio\r\n");
		btnAdicionarFuncionario.setBounds(394, 122, 163, 78);
		contentPane.add(btnAdicionarFuncionario);
		
		JButton btnListarTodosOs = new JButton("Listar todos os veiculos\r\n");
		btnListarTodosOs.setBounds(209, 211, 163, 78);
		contentPane.add(btnListarTodosOs);
		
		JButton btnAdicionarIndisponiveis = new JButton("Listar veiculos indisponiveis");
		btnAdicionarIndisponiveis.setBounds(22, 300, 163, 78);
		contentPane.add(btnAdicionarIndisponiveis);
		
		JButton btnListarClientes = new JButton("Listar clientes");
		btnListarClientes.setBounds(22, 211, 163, 78);
		contentPane.add(btnListarClientes);
		
		JButton btnListarFuncionrios = new JButton("Listar funcion\u00E1rios");
		btnListarFuncionrios.setBounds(394, 211, 163, 78);
		contentPane.add(btnListarFuncionrios);
		
		JButton btnRetirarVeiculo = new JButton("Retirar veiculo");
		btnRetirarVeiculo.setBounds(394, 300, 163, 78);
		contentPane.add(btnRetirarVeiculo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 400, 562, 1);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 97, 562, 1);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 97, 1, 304);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(571, 97, 1, 304);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(198, 97, 1, 304);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(383, 97, 1, 304);
		contentPane.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(383, 11, 189, 1);
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(383, 11, 1, 67);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(570, 11, 1, 67);
		contentPane.add(panel_9);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(383, 77, 189, 1);
		contentPane.add(panel_6);
	}
}
