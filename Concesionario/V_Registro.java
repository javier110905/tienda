package Concesionario;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class V_Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFormattedTextField txtHola;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField textField_4;
	private JFormattedTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_Registro frame = new V_Registro();
					frame.setUndecorated(false); 
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
	public V_Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnRegistrarse1 = new JButton("Registrarse");
		btnRegistrarse1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnRegistrarse1.setForeground(Color.WHITE);
		btnRegistrarse1.setBackground(new Color(153, 0, 0)); // Rojo oscuro
		btnRegistrarse1.setBounds(527, 393, 179, 41); // Ajusta la posición y el tamaño según sea necesario
		btnRegistrarse1.setFocusPainted(false);
		btnRegistrarse1.setBorderPainted(false);
		btnRegistrarse1.setContentAreaFilled(false);
		btnRegistrarse1.setOpaque(true);
		btnRegistrarse1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acción al hacer clic en el botón "Registrarse"
			}
		});
		btnRegistrarse1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnRegistrarse1.setBackground(new Color(178, 34, 34)); // Cambia el color cuando el mouse entra
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnRegistrarse1.setBackground(new Color(153, 0, 0)); // Vuelve al color original cuando el mouse sale
			}
		});
		contentPane.add(btnRegistrarse1);

		// Placeholder para DNI
		txtHola = new JFormattedTextField();
		addPlaceholder(txtHola, "DNI");
		txtHola.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		txtHola.setColumns(10);
		txtHola.setBounds(341, 138, 241, 41);
		contentPane.add(txtHola);

		// Placeholder para Nombre
		textField = new JTextField();
		addPlaceholder(textField, "Nombre");
		textField.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(341, 224, 241, 41);
		contentPane.add(textField);

		// Placeholder para Apellido
		textField_1 = new JTextField();
		addPlaceholder(textField_1, "Apellido");
		textField_1.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(341, 312, 241, 41);
		contentPane.add(textField_1);

		// Placeholder para Telefono
		textField_4 = new JTextField();
		addPlaceholder(textField_4, "Telefono");
		textField_4.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(649, 224, 241, 41);
		contentPane.add(textField_4);

		// Placeholder para Año del Carnet
		textField_5 = new JTextField();
		addPlaceholder(textField_5, "Año del Carnet");
		textField_5.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(649, 312, 241, 41);
		contentPane.add(textField_5);

		// Placeholder para Contraseña
		textField_3 = new JFormattedTextField();
		addPlaceholder(textField_3, "Contraseña");
		textField_3.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(649, 138, 241, 41);
		contentPane.add(textField_3);

		JLabel lblNewLabel = new JLabel("Año del Carnet: ");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel.setBounds(649, 278, 179, 23);
		contentPane.add(lblNewLabel);

		JLabel lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblTelefono.setBounds(649, 190, 103, 23);
		contentPane.add(lblTelefono);

		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblDni.setBounds(341, 101, 103, 23);
		contentPane.add(lblDni);

		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(649, 101, 167, 23);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblApellido.setBounds(341, 278, 103, 23);
		contentPane.add(lblApellido);

		JLabel lblNewLabel_1_2 = new JLabel("Nombre: ");
		lblNewLabel_1_2.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(341, 190, 103, 23);
		contentPane.add(lblNewLabel_1_2);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(24, 2, 3));
		panel.setBounds(0, 0, 292, 596);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\dam\\Desktop\\PROG\\proyectos\\Concesionario1\\imagenes\\logo3.png"));
		lblNewLabel_2.setBounds(26, 74, 266, 225);
		panel.add(lblNewLabel_2);

		JButton btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setBackground(new Color(153, 0, 0)); // Rojo oscuro
		btnIniciarSesion.setBounds(62, 293, 179, 41); // Ajusta la posición y el tamaño según sea necesario
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setBorderPainted(false);
		btnIniciarSesion.setContentAreaFilled(false);
		btnIniciarSesion.setOpaque(true);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Oculta la ventana actual
				setVisible(false);

				// Crea una instancia de la ventana de inicio de sesión
				V_IniciarSesion ventanaInicioSesion = new V_IniciarSesion();
				ventanaInicioSesion.setVisible(true);
			}
		});

		btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnIniciarSesion.setBackground(new Color(178, 34, 34)); // Cambia el color cuando el mouse entra
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnIniciarSesion.setBackground(new Color(153, 0, 0)); // Vuelve al color original cuando el mouse sale
			}
		});
		panel.add(btnIniciarSesion);

		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(24, 2, 3));
		panel_1.setBounds(299, 0, 687, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Registro:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 11, 174, 41);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Cascadia Mono", Font.BOLD, 22));

	}

	private void addPlaceholder(JTextField textField, String placeholderText) {
		textField.setText(placeholderText);
		textField.setForeground(Color.GRAY);
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals(placeholderText)) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().isEmpty()) {
					textField.setText(placeholderText);
					textField.setForeground(Color.GRAY);
				}
			}
		});
	}
}
