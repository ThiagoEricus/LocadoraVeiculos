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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setIcon(new ImageIcon(tela1.class.getResource("/telas/Imagens/funcionario.png")));
		button.setBounds(362, 161, 173, 109);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setIcon(new ImageIcon(tela1.class.getResource("/telas/Imagens/icone_clientes.png")));
		button_1.setBounds(65, 161, 173, 109);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(tela1.class.getResource("/telas/Imagens/cliente_pequeno.png")));
		btnNewButton.setBounds(123, 346, 361, 43);
		contentPane.add(btnNewButton);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCliente.setBounds(123, 119, 70, 14);
		contentPane.add(lblCliente);
		
		JLabel lblFuncionrio = new JLabel("Funcion\u00E1rio");
		lblFuncionrio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblFuncionrio.setBounds(392, 119, 116, 14);
		contentPane.add(lblFuncionrio);
		
		JLabel lblNovoCliente = new JLabel("Novo cliente");
		lblNovoCliente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNovoCliente.setBounds(243, 319, 116, 14);
		contentPane.add(lblNovoCliente);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(tela1.class.getResource("/telas/Imagens/Logomarca.png")));
		label.setBounds(162, 0, 242, 70);
		contentPane.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 307, 562, 1);
		contentPane.add(panel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(10, 400, 562, 1);
		contentPane.add(panel_6);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 97, 562, 1);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(299, 97, 1, 211);
		contentPane.add(panel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(10, 97, 1, 211);
		contentPane.add(panel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(571, 97, 1, 211);
		contentPane.add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(571, 190, 1, 211);
		contentPane.add(panel_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.LIGHT_GRAY);
		panel_7.setBounds(10, 190, 1, 211);
		contentPane.add(panel_7);
	}
}
