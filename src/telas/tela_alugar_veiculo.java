package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaSeuVeiculo = new JLabel("Escolha seu veiculo:");
		lblEscolhaSeuVeiculo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		lblEscolhaSeuVeiculo.setBounds(138, 11, 178, 56);
		contentPane.add(lblEscolhaSeuVeiculo);
		
		JButton btnNewButton = new JButton("Carro");
		btnNewButton.setBounds(10, 60, 197, 161);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Motocicleta\r\n");
		button.setBounds(227, 60, 197, 161);
		contentPane.add(button);
	}

}
