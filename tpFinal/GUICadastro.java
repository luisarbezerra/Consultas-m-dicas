package tpFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUICadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICadastro frame = new GUICadastro();
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
	public GUICadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroCliente = new JLabel("Cadastro Cliente");
		lblCadastroCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroCliente.setBounds(0, 0, 434, 45);
		contentPane.add(lblCadastroCliente);
		
		textField = new JTextField();
		textField.setBounds(10, 66, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 49, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdentidade = new JLabel("Identidade");
		lblIdentidade.setBounds(10, 97, 89, 14);
		contentPane.add(lblIdentidade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 114, 414, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 162, 414, 20);
		contentPane.add(textField_2);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 145, 89, 14);
		contentPane.add(lblCpf);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 210, 414, 20);
		contentPane.add(textField_3);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 193, 89, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 241, 89, 14);
		contentPane.add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 258, 414, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 306, 414, 20);
		contentPane.add(textField_5);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento ( dd-mm-aaaa)");
		lblDataDeNascimento.setBounds(10, 289, 198, 14);
		contentPane.add(lblDataDeNascimento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(125, 347, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Cadastrar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmar.setBounds(224, 347, 89, 23);
		contentPane.add(btnConfirmar);
	}

}
