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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Clientes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(29, 46, 186, 139);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Funcion\u00E1rios");
		button.setBounds(222, 46, 186, 139);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("Novo Cliente\r\n");
		btnNewButton_1.setBounds(29, 196, 379, 55);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("                              Locadora de carros tal\r\n");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Square721 Cn BT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(29, 0, 379, 35);
		contentPane.add(lblNewLabel);
	}
}
