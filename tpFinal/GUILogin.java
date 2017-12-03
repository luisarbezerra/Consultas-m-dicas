package tpFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUILogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUILogin frame = new GUILogin();
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
	public GUILogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAgendamentoDeConsultas = new JLabel("Agendamento de consultas");
		lblAgendamentoDeConsultas.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAgendamentoDeConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgendamentoDeConsultas.setBounds(0, 11, 434, 45);
		contentPane.add(lblAgendamentoDeConsultas);
		
		JLabel lblParaAgendarUma = new JLabel("Use o seu CPF para realizar o agendamento de uma consulta ou exame");
		lblParaAgendarUma.setHorizontalAlignment(SwingConstants.CENTER);
		lblParaAgendarUma.setBounds(10, 57, 414, 14);
		contentPane.add(lblParaAgendarUma);
		
		textField = new JTextField();
		textField.setBounds(85, 123, 276, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(85, 98, 518, 14);
		contentPane.add(lblCpf);
		
		JButton btnNewButton = new JButton("Realizar agendamento");
		btnNewButton.setBounds(117, 177, 209, 23);
		contentPane.add(btnNewButton);
	}
}
