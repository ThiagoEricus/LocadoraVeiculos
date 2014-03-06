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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 584, 412);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Bem vindo Sr\u00AA Thiago...\r\n");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(22, 77, 214, 19);
		panel.add(label);
		
		JButton button = new JButton("Logout");
		button.setBounds(404, 23, 149, 23);
		panel.add(button);
		
		JButton btnEditarContedoCadastrais = new JButton("Editar Conte\u00FAdo Cadastrais");
		btnEditarContedoCadastrais.setBounds(404, 46, 149, 23);
		panel.add(btnEditarContedoCadastrais);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(154, 0, 230, 78);
		panel.add(label_1);
		
		JButton button_2 = new JButton("Adicionar Veiculo");
		button_2.setBounds(209, 122, 163, 78);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Adicionar Cliente");
		button_3.setBounds(22, 122, 163, 78);
		panel.add(button_3);
		
		JButton btnListarVeiculosAlugados = new JButton("Listar Veiculos Alugados");
		btnListarVeiculosAlugados.setBounds(209, 300, 163, 78);
		panel.add(btnListarVeiculosAlugados);
		
		JButton btnAdicionarFuncionrio = new JButton("Adicionar Funcion\u00E1rio\r\n");
		btnAdicionarFuncionrio.setBounds(394, 122, 163, 78);
		panel.add(btnAdicionarFuncionrio);
		
		JButton btnListarTodosVeiculos = new JButton("Listar Todos Veiculos\r\n");
		btnListarTodosVeiculos.setBounds(209, 211, 163, 78);
		panel.add(btnListarTodosVeiculos);
		
		JButton btnListarVeiculosDisponiveis = new JButton("Listar Veiculos Disponiveis\r\n");
		btnListarVeiculosDisponiveis.setBounds(22, 300, 163, 78);
		panel.add(btnListarVeiculosDisponiveis);
		
		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.setBounds(22, 211, 163, 78);
		panel.add(btnListarClientes);
		
		JButton btnListarFuncionrios = new JButton("Listar Funcion\u00E1rios");
		btnListarFuncionrios.setBounds(394, 211, 163, 78);
		panel.add(btnListarFuncionrios);
		
		JButton btnRetirarVeiculo = new JButton("Retirar Veiculo");
		btnRetirarVeiculo.setBounds(394, 300, 163, 78);
		panel.add(btnRetirarVeiculo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 400, 562, 1);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 97, 562, 1);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 97, 1, 304);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(571, 97, 1, 304);
		panel.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(198, 97, 1, 304);
		panel.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(383, 97, 1, 304);
		panel.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(383, 11, 189, 1);
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.LIGHT_GRAY);
		panel_8.setBounds(383, 11, 1, 67);
		panel.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.LIGHT_GRAY);
		panel_9.setBounds(570, 11, 1, 67);
		panel.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.LIGHT_GRAY);
		panel_10.setBounds(383, 77, 189, 1);
		panel.add(panel_10);
	}
}
