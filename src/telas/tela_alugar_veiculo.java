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
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaSeuVeiculo = new JLabel("Escolha seu veiculo:");
		lblEscolhaSeuVeiculo.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 18));
		lblEscolhaSeuVeiculo.setBounds(132, 65, 178, 33);
		contentPane.add(lblEscolhaSeuVeiculo);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\carrinho.png"));
		btnNewButton.setBounds(10, 109, 197, 125);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\moto.png"));
		button.setBounds(227, 109, 197, 125);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ruann\\Desktop\\LocadoraVeiculos-27-02-2014\\Imagens\\Logomarca.png"));
		lblNewLabel.setBounds(69, 0, 306, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblCarro = new JLabel("Carro");
		lblCarro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblCarro.setBounds(86, 236, 46, 14);
		contentPane.add(lblCarro);
		
		JLabel lblMotocicleta = new JLabel("Motocicleta");
		lblMotocicleta.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMotocicleta.setBounds(294, 236, 81, 14);
		contentPane.add(lblMotocicleta);
	}

}
