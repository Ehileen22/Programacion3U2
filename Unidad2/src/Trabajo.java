import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Trabajo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trabajo frame = new Trabajo();
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
	public Trabajo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(71, 255, 45));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(10, 31, 371, 349);
		contentPane.add(panel);
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_11_1 = new JLabel("                     ");
		GridBagConstraints gbc_lblNewLabel_11_1 = new GridBagConstraints();
		gbc_lblNewLabel_11_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11_1.gridx = 1;
		gbc_lblNewLabel_11_1.gridy = 6;
		panel.add(lblNewLabel_11_1, gbc_lblNewLabel_11_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Datos Ganerales");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 12));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_1.gridx = 1;
		gbc_lblNewLabel_2_1.gridy = 7;
		panel.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		JLabel lblNewLabel_11 = new JLabel("                     ");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 1;
		gbc_lblNewLabel_11.gridy = 8;
		panel.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 9;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 9;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 1;
		gbc_lblNewLabel_10.gridy = 10;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("        ");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 11;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno: ");
		lblNewLabel_3.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 11;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_8 = new JLabel("        ");
		lblNewLabel_8.setBackground(new Color(255, 128, 128));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.gridx = 2;
		gbc_lblNewLabel_8.gridy = 11;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 11;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_10_1 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10_1.gridx = 1;
		gbc_lblNewLabel_10_1.gridy = 12;
		panel.add(lblNewLabel_10_1, gbc_lblNewLabel_10_1);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno: ");
		lblNewLabel_4.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 13;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 13;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10_1_1.gridx = 1;
		gbc_lblNewLabel_10_1_1.gridy = 14;
		panel.add(lblNewLabel_10_1_1, gbc_lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha De Nacimiento:");
		lblNewLabel_5.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 1;
		gbc_lblNewLabel_5.gridy = 15;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 15;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10_1_1_1.gridx = 1;
		gbc_lblNewLabel_10_1_1_1.gridy = 16;
		panel.add(lblNewLabel_10_1_1_1, gbc_lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 17;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setOpaque(false);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 3;
		gbc_rdbtnNewRadioButton.gridy = 17;
		panel.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setOpaque(false);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 3;
		gbc_rdbtnNewRadioButton_1.gridy = 18;
		panel.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		
		
		JLabel lblNewLabel_10_1_1_1_1 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10_1_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_10_1_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10_1_1_1_1.gridx = 1;
		gbc_lblNewLabel_10_1_1_1_1.gridy = 19;
		panel.add(lblNewLabel_10_1_1_1_1, gbc_lblNewLabel_10_1_1_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad:");
		lblNewLabel_7.setFont(new Font("Marker felt",Font.BOLD ,15));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 20;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		String elements[]= {"Estados Unidos", "Mexico", "Colombia"};
		JComboBox comboBox = new JComboBox(elements);
		comboBox.setOpaque(true);
		comboBox.setBackground(Color.white);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 20;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel_10_1_1_1_2 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_10_1_1_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_10_1_1_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_10_1_1_1_2.gridx = 1;
		gbc_lblNewLabel_10_1_1_1_2.gridy = 21;
		panel.add(lblNewLabel_10_1_1_1_2, gbc_lblNewLabel_10_1_1_1_2);
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Marker felt",Font.BOLD ,20));
		lblNewLabel.setBounds(10, 0, 302, 29);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(391, 31, 233, 342);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Perfil Del Usuario");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(10, 11, 126, 16);
		panel_1.add(lblNewLabel_2_1_1);
				
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto De Perfil");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(21, 238, 162, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha De Nacimiento");
		chckbxNewCheckBox_1.setOpaque(false);
		chckbxNewCheckBox_1.setBounds(21, 275, 206, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel logo=new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("ima.png")));
		logo.setBounds(40, 50, 156, 156);
		panel_1.add(logo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 128));
		panel_2.setBounds(10, 394, 371, 156);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		/*String elementos[]= {"Cantar", "Escuchar Música", "Leer", "Deportes", "Otro"};
		JComboBox comboBox2 = new JComboBox(elementos);
		comboBox2.setOpaque(true);
		comboBox2.setBackground(Color.white);
		JScrollPane scrollPane2 = new JScrollPane(comboBox2);
		scrollPane2.setBounds(200, 50, 100, 100);
		panel_2.add(scrollPane2);*/
		
		JTextArea textArea = new JTextArea("Hola amigos de youtube,\n gracias por \n compartir mis\n videos\n cada que subo video,\n que amables son");
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(60, 50, 100, 100);
		panel_2.add(scrollPane);
		
		JTextArea textArea2 = new JTextArea("				\n				\n				\n				\n				\n");
		JScrollPane scrollPane2 = new JScrollPane(textArea2);
		scrollPane2.setBounds(205, 50, 100, 100);
		panel_2.add(scrollPane2);
		
		JLabel lblNewLabel_6_1 = new JLabel("Preferencias:");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(208, 27, 98, 20);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Datos Opcionales");
		lblNewLabel_6_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_6_1_1.setBounds(20, 5, 157, 20);
		panel_2.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Descripcion:");
		lblNewLabel_6_1_2.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_6_1_2.setBounds(60, 27, 98, 20);
		panel_2.add(lblNewLabel_6_1_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 255, 255));
		panel_3.setBounds(391, 389, 233, 161);
		contentPane.add(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("                     ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 0;
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("                        ");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_2.gridx = 3;
		gbc_lblNewLabel_1_2.gridy = 1;
		panel_3.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton(" Nuevo  ");
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 2;
		panel_3.add(btnNewButton, gbc_btnNewButton);
		
		/*JLabel nuevo=new JLabel();
		nuevo.setIcon(new ImageIcon(getClass().getResource("nuevo.png")));
		nuevo.setBounds(0, 0, 25, 25);
		btnNewButton.add(nuevo);*/
		
		JLabel lblNewLabel_1_1_1 = new JLabel("                        ");
		GridBagConstraints gbc_lblNewLabel_1_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1_1.gridx = 1;
		gbc_lblNewLabel_1_1_1.gridy = 3;
		panel_3.add(lblNewLabel_1_1_1, gbc_lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 3;
		gbc_btnNewButton_1.gridy = 3;
		panel_3.add(btnNewButton_1, gbc_btnNewButton_1);
		
		
		/*JLabel guar=new JLabel();
		guar.setIcon(new ImageIcon(getClass().getResource("guardar.png")));
		guar.setBounds(0, 0, 25, 25);
		btnNewButton_1.add(guar);*/
		
		JButton btnNewButton_2 = new JButton("  Salir    ");
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		/*JLabel salir=new JLabel();
		salir.setIcon(new ImageIcon(getClass().getResource("salir.png")));
		salir.setBounds(0, 0, 25, 25);
		btnNewButton_2.add(salir);*/
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 4;
		panel_3.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("                       ");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1.gridx = 3;
		gbc_lblNewLabel_1_1.gridy = 5;
		panel_3.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("           ");
		GridBagConstraints gbc_lblNewLabel_1_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_2_1.gridx = 3;
		gbc_lblNewLabel_1_2_1.gridy = 6;
		panel_3.add(lblNewLabel_1_2_1, gbc_lblNewLabel_1_2_1);
		
		
	}
}
