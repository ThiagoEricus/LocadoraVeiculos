package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class tela_alugar_veiculo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_alugar_veiculo frame = new tela_alugar_veiculo();
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
	public tela_alugar_veiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaSeuVeiculo = new JLabel("Escolha seu veiculo:");
		lblEscolhaSeuVeiculo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblEscolhaSeuVeiculo.setBounds(215, 68, 189, 33);
		contentPane.add(lblEscolhaSeuVeiculo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(tela_alugar_veiculo.class.getResource("/telas/Imagens/carrinho.png")));
		btnNewButton.setBounds(62, 164, 197, 125);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(tela_alugar_veiculo.class.getResource("/telas/Imagens/moto.png")));
		button.setBounds(349, 164, 197, 125);
		contentPane.add(button);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCarro.setBounds(135, 139, 60, 14);
		contentPane.add(lblCarro);
		
		JLabel lblMotocicleta = new JLabel("Motocicleta");
		lblMotocicleta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblMotocicleta.setBounds(390, 139, 111, 14);
		contentPane.add(lblMotocicleta);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(tela_alugar_veiculo.class.getResource("/telas/Imagens/Logomarca.png")));
		label.setBounds(176, 0, 242, 70);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 319, 562, 1);
		contentPane.add(panel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 109, 562, 1);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(301, 109, 1, 211);
		contentPane.add(panel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(571, 109, 1, 211);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 109, 1, 211);
		contentPane.add(panel_2);
	}

}
