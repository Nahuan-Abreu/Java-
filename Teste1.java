import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Teste1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtQtde1;
	private JTextField txtPreco1;
	private JTextField txtQtde2;
	private JTextField txtPreco2;
	private JTextField txtQtde3;
	private JTextField txtPreco3;
	private JTextField txtQtde4;
	private JTextField txtPreco4;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste1 frame = new Teste1();
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
	public Teste1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de sorvete");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qtde");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(113, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sorvete de Frutas");
		lblNewLabel_2.setBounds(10, 33, 87, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chocolate /Frutas");
		lblNewLabel_3.setBounds(10, 58, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bola");
		lblNewLabel_4.setBounds(10, 83, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pre\u00E7o unit\u00E1rio");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(252, 11, 66, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Pote de 2 Litros");
		lblNewLabel_6.setBounds(10, 108, 75, 14);
		contentPane.add(lblNewLabel_6);
		
		txtQtde1 = new JTextField();
		txtQtde1.setBounds(113, 30, 117, 20);
		contentPane.add(txtQtde1);
		txtQtde1.setColumns(10);
		
		txtPreco1 = new JTextField();
		txtPreco1.setColumns(10);
		txtPreco1.setBounds(252, 30, 117, 20);
		contentPane.add(txtPreco1);
		
		txtQtde2 = new JTextField();
		txtQtde2.setColumns(10);
		txtQtde2.setBounds(113, 55, 117, 20);
		contentPane.add(txtQtde2);
		
		txtPreco2 = new JTextField();
		txtPreco2.setColumns(10);
		txtPreco2.setBounds(252, 55, 117, 20);
		contentPane.add(txtPreco2);
		
		txtQtde3 = new JTextField();
		txtQtde3.setColumns(10);
		txtQtde3.setBounds(113, 80, 117, 20);
		contentPane.add(txtQtde3);
		
		txtPreco3 = new JTextField();
		txtPreco3.setColumns(10);
		txtPreco3.setBounds(252, 80, 117, 20);
		contentPane.add(txtPreco3);
		
		txtQtde4 = new JTextField();
		txtQtde4.setColumns(10);
		txtQtde4.setBounds(113, 105, 117, 20);
		contentPane.add(txtQtde4);
		
		txtPreco4 = new JTextField();
		txtPreco4.setColumns(10);
		txtPreco4.setBounds(252, 105, 117, 20);
		contentPane.add(txtPreco4);
		
		JLabel lblNewLabel_7 = new JLabel("Total");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(113, 136, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setColumns(10);
		txtTotal.setBounds(252, 133, 117, 20);
		contentPane.add(txtTotal);
		
		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQtde1.setText(null);
				txtQtde2.setText(null);
				txtQtde3.setText(null);
				txtQtde4.setText(null);
				txtPreco1.setText(null);
				txtPreco2.setText(null);
				txtPreco3.setText(null);
				txtPreco4.setText(null);
				txtTotal.setText(null);
							
				
			}
		});
		btnNewButton.setBounds(280, 164, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int qtd1 = Integer.parseInt(txtQtde1.getText());
				int qtd2 = Integer.parseInt(txtQtde2.getText());
				int qtd3 = Integer.parseInt(txtQtde3.getText());
				int qtd4 = Integer.parseInt(txtQtde4.getText());
				double preco1 = Double.parseDouble(txtPreco1.getText());
				double preco2 = Double.parseDouble(txtPreco2.getText());
				double preco3 = Double.parseDouble(txtPreco3.getText());
				double preco4 = Double.parseDouble(txtPreco4.getText());
				double resultado = (qtd1 * preco1) + (qtd2 * preco2) + (qtd2 * preco2) + (qtd3 * preco3) + (qtd4 * preco4);
				txtTotal.setText(String.valueOf(resultado));
			
				
				
				
			}
		});
		btnNewButton_1.setBounds(181, 164, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
