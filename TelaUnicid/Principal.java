import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAluno;
	private JMenu mnNotasEFaltas;
	private JMenu mnAjuda;
	private JMenuItem mniSalvar;
	private JMenuItem mniSair;
	private JMenuItem mniAlterar;
	private JMenuItem mniConsultar;
	private JMenuItem mniExcluir;
	private JMenuItem mniNewMenuItem;
	private JMenuItem mniNewMenuItem_1;
	private JMenuItem mniNewMenuItem_2;
	private JMenuItem mniNewMenuItem_3;
	private JMenuItem mniSobre;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textField;
	private JLabel lblRgm;
	private JLabel lblDataDeNascimento;
	private JTextField textField_1;
	private JLabel lblEmail;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblEnde;
	private JLabel lblMunicipio;
	private JTextField textField_4;
	private JLabel lblUf;
	private JLabel lblNome;
	private JTextField textField_5;
	private JLabel lblCpf;
	private JTextField textField_6;
	private JLabel lblCelular;
	private JTextField textField_7;
	private JLabel lblCurso;
	private JLabel lblCampus;
	private JLabel lblPeriodo;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JRadioButton rdbNewRadioButton;
	private JRadioButton rdbVespertino;
	private JRadioButton rdbNoturno;
	private JLabel lblNewLabel;
	private JLabel lblCadaAnalistaDevera;
	private JLabel lblNotasEFaltas;
	private JLabel lblRgm_1;
	private JTextField textField_8;
	private JTextField txtDeverMostrarO;
	private JTextField txtDeverMostrarO_1;
	private JLabel lblDisciplina;
	private JComboBox comboBox_3;
	private JLabel lblSemestre;
	private JComboBox comboBox_4;
	private JLabel lblNota;
	private JComboBox comboBox_5;
	private JLabel lblFaltas;
	private JTextField textField_11;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton btnNewButton;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		contentPane.add(menuBar);

		mnAluno = new JMenu("Aluno");
		menuBar.add(mnAluno);

		mniSalvar = new JMenuItem("Salvar");
		mniSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnAluno.add(mniSalvar);

		mniAlterar = new JMenuItem("Alterar");
		mnAluno.add(mniAlterar);

		mniConsultar = new JMenuItem("Consultar");
		mnAluno.add(mniConsultar);

		mniExcluir = new JMenuItem("Excluir");
		mnAluno.add(mniExcluir);

		JSeparator separator = new JSeparator();
		mnAluno.add(separator);

		mniSair = new JMenuItem("Sair");
		mniSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_MASK));
		mnAluno.add(mniSair);

		mnNotasEFaltas = new JMenu("Notas e Faltas");
		menuBar.add(mnNotasEFaltas);

		mniNewMenuItem = new JMenuItem("Salvar");
		mnNotasEFaltas.add(mniNewMenuItem);

		mniNewMenuItem_1 = new JMenuItem("Alterar");
		mniNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mnNotasEFaltas.add(mniNewMenuItem_1);

		mniNewMenuItem_2 = new JMenuItem("Excluir");
		mnNotasEFaltas.add(mniNewMenuItem_2);

		mniNewMenuItem_3 = new JMenuItem("Consultar");
		mnNotasEFaltas.add(mniNewMenuItem_3);

		mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);

		mniSobre = new JMenuItem("Sobre");
		mnAjuda.add(mniSobre);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 53, 414, 197);
		contentPane.add(tabbedPane);

		panel = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(39, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);

		lblRgm = new JLabel("RGM");
		lblRgm.setBounds(10, 14, 31, 14);
		panel.add(lblRgm);

		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(10, 42, 96, 14);
		panel.add(lblDataDeNascimento);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(116, 39, 86, 20);
		panel.add(textField_1);

		lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 66, 31, 14);
		panel.add(lblEmail);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(39, 63, 360, 20);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(39, 91, 360, 20);
		panel.add(textField_3);

		lblEnde = new JLabel("End.");
		lblEnde.setBounds(10, 94, 31, 14);
		panel.add(lblEnde);

		lblMunicipio = new JLabel("Município");
		lblMunicipio.setBounds(10, 119, 52, 14);
		panel.add(lblMunicipio);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(59, 116, 86, 20);
		panel.add(textField_4);

		lblUf = new JLabel("UF");
		lblUf.setBounds(155, 119, 21, 14);
		panel.add(lblUf);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(171, 116, 38, 20);
		panel.add(comboBox);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(145, 14, 38, 14);
		panel.add(lblNome);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(186, 11, 213, 20);
		panel.add(textField_5);

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(238, 39, 31, 14);
		panel.add(lblCpf);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(262, 36, 137, 20);
		panel.add(textField_6);

		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(212, 119, 49, 14);
		panel.add(lblCelular);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(253, 116, 146, 20);
		panel.add(textField_7);

		panel_1 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_1, null);
		panel_1.setLayout(null);

		lblCurso = new JLabel("Curso");
		lblCurso.setBounds(10, 11, 46, 14);
		panel_1.add(lblCurso);

		lblCampus = new JLabel("Campus");
		lblCampus.setBounds(10, 36, 57, 14);
		panel_1.add(lblCampus);

		lblPeriodo = new JLabel("Período");
		lblPeriodo.setBounds(10, 61, 46, 14);
		panel_1.add(lblPeriodo);

		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(66, 8, 333, 20);
		panel_1.add(comboBox_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(66, 33, 333, 20);
		panel_1.add(comboBox_2);

		rdbNewRadioButton = new JRadioButton("Matutino");
		buttonGroup.add(rdbNewRadioButton);
		rdbNewRadioButton.setSelected(true);
		rdbNewRadioButton.setBounds(66, 57, 97, 23);
		panel_1.add(rdbNewRadioButton);

		rdbVespertino = new JRadioButton("Vespertino");
		buttonGroup.add(rdbVespertino);
		rdbVespertino.setBounds(179, 57, 109, 23);
		panel_1.add(rdbVespertino);

		rdbNoturno = new JRadioButton("Noturno");
		buttonGroup.add(rdbNoturno);
		rdbNoturno.setBounds(290, 57, 109, 23);
		panel_1.add(rdbNoturno);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(10, 94, 67, 64);
		panel_1.add(btnNewButton_1);

		button = new JButton("");
		button.setBounds(87, 94, 67, 64);
		panel_1.add(button);

		button_1 = new JButton("");
		button_1.setBounds(164, 94, 67, 64);
		panel_1.add(button_1);

		button_2 = new JButton("");
		button_2.setBounds(241, 94, 67, 64);
		panel_1.add(button_2);

		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(318, 94, 67, 64);
		panel_1.add(button_3);

		panel_2 = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel_2, null);
		panel_2.setLayout(null);

		lblRgm_1 = new JLabel("RGM");
		lblRgm_1.setBounds(10, 11, 46, 14);
		panel_2.add(lblRgm_1);

		textField_8 = new JTextField();
		textField_8.setBounds(55, 8, 86, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);

		txtDeverMostrarO = new JTextField();
		txtDeverMostrarO.setEditable(false);
		txtDeverMostrarO.setText("Deverá mostrar o nome do aluno");
		txtDeverMostrarO.setBounds(151, 8, 248, 20);
		panel_2.add(txtDeverMostrarO);
		txtDeverMostrarO.setColumns(10);

		txtDeverMostrarO_1 = new JTextField();
		txtDeverMostrarO_1.setEditable(false);
		txtDeverMostrarO_1.setText("Deverá mostrar o nome do curso");
		txtDeverMostrarO_1.setColumns(10);
		txtDeverMostrarO_1.setBounds(10, 38, 389, 20);
		panel_2.add(txtDeverMostrarO_1);

		lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setBounds(10, 69, 66, 14);
		panel_2.add(lblDisciplina);

		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(76, 66, 323, 20);
		panel_2.add(comboBox_3);

		lblSemestre = new JLabel("Semestre");
		lblSemestre.setBounds(10, 94, 66, 14);
		panel_2.add(lblSemestre);

		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(76, 91, 65, 20);
		panel_2.add(comboBox_4);

		lblNota = new JLabel("Nota");
		lblNota.setBounds(151, 94, 37, 14);
		panel_2.add(lblNota);

		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(187, 91, 46, 20);
		panel_2.add(comboBox_5);

		lblFaltas = new JLabel("Faltas");
		lblFaltas.setBounds(270, 94, 46, 14);
		panel_2.add(lblFaltas);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(313, 91, 86, 20);
		panel_2.add(textField_11);

		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 119, 66, 39);
		panel_2.add(btnNewButton);

		button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(86, 119, 66, 39);
		panel_2.add(button_4);

		button_5 = new JButton("");
		button_5.setBounds(161, 119, 66, 39);
		panel_2.add(button_5);

		button_6 = new JButton("");
		button_6.setBounds(237, 119, 66, 39);
		panel_2.add(button_6);

		button_7 = new JButton("");
		button_7.setBounds(313, 119, 66, 39);
		panel_2.add(button_7);

		panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);

		lblNewLabel = new JLabel("Esta tela devera apresentrar o RGM, Nome, Curso, diciplinas,  ");
		lblNewLabel.setBounds(10, 11, 389, 36);
		panel_3.add(lblNewLabel);

		lblCadaAnalistaDevera = new JLabel("Cada analista devera ter a sua tela");
		lblCadaAnalistaDevera.setBounds(10, 112, 218, 14);
		panel_3.add(lblCadaAnalistaDevera);

		lblNotasEFaltas = new JLabel("notas e faltas");
		lblNotasEFaltas.setBounds(10, 37, 389, 36);
		panel_3.add(lblNotasEFaltas);
	}
}
