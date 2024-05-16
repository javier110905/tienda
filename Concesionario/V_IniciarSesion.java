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

public class V_IniciarSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFormattedTextField txtHola;
	private JFormattedTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_IniciarSesion frame = new V_IniciarSesion();
					frame.setUndecorated(true); // Añadir esto para quitar la barra de título y los botones
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
	public V_IniciarSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 969, 522);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(217, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Placeholder para DNI
		txtHola = new JFormattedTextField();
		addPlaceholder(txtHola, "DNI");
		txtHola.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		txtHola.setColumns(10);
		txtHola.setBounds(555, 158, 241, 41);
		contentPane.add(txtHola);

		// Placeholder para Contraseña
		textField_3 = new JFormattedTextField();
		addPlaceholder(textField_3, "Contraseña");
		textField_3.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(555, 275, 241, 41);
		contentPane.add(textField_3);

		JLabel lblDni = new JLabel("DNI: ");
		lblDni.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblDni.setBounds(555, 124, 103, 23);
		contentPane.add(lblDni);

		JLabel lblNewLabel_1_1 = new JLabel("Contraseña: ");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(555, 241, 167, 23);
		contentPane.add(lblNewLabel_1_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setForeground(new Color(255, 128, 64));
		panel.setBounds(0, 0, 382, 596);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\javie\\OneDrive\\Escritorio\\proyectos JAVA\\Concesionario\\imagenes\\logo.png"));
		lblNewLabel_2.setBounds(116, 117, 150, 185);
		panel.add(lblNewLabel_2);

		JLabel TextoDebajoLogo = new JLabel("Inicia sesion y arranca");
		TextoDebajoLogo.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		TextoDebajoLogo.setBounds(116, 281, 170, 58);
		panel.add(TextoDebajoLogo);

		JLabel TextoDebajoLogo1 = new JLabel(" tu próxima aventura.");
		TextoDebajoLogo1.setFont(new Font("Segoe UI Black", Font.BOLD, 14));
		TextoDebajoLogo1.setBounds(116, 324, 196, 51);
		panel.add(TextoDebajoLogo1);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(104, 386, 179, 41);
		panel.add(btnRegistrarse);
		btnRegistrarse.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setBackground(new Color(153, 0, 0));
		btnRegistrarse.setFocusPainted(false);
		btnRegistrarse.setBorderPainted(false);
		btnRegistrarse.setContentAreaFilled(false);
		btnRegistrarse.setOpaque(true);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Oculta la ventana actual
				setVisible(false);

				// Crea una instancia de la ventana de registro
				V_Registro ventanaRegistro = new V_Registro();
				ventanaRegistro.setUndecorated(false); // Añadir esto para quitar la barra de título y los botones
				ventanaRegistro.setVisible(true);
			}
		});

		btnRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnRegistrarse.setBackground(new Color(178, 34, 34)); // Cambia el color cuando el mouse entra
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnRegistrarse.setBackground(new Color(153, 0, 0)); // Vuelve al color original cuando el mouse sale
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(392, 0, 594, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Iniciar Sesion");
		lblNewLabel_1.setBounds(31, 11, 174, 41);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 22));

		// Botón de cerrar personalizado
		JButton closeButton = new JButton("X");
		closeButton.setBounds(505, 11, 49, 34);
		panel_1.add(closeButton);
		closeButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		closeButton.setForeground(Color.WHITE);
		closeButton.setBackground(Color.RED);
		closeButton.setFocusPainted(false);
		closeButton.setBorderPainted(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setOpaque(true);
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				closeButton.setBackground(Color.RED.darker()); // Cambia el color cuando el mouse entra
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				closeButton.setBackground(Color.RED); // Vuelve al color original cuando el mouse sale
			}
		});

		JButton btnIniciarSesion = new JButton("Iniciar sesión");
		btnIniciarSesion.setBounds(591, 392, 179, 41);
		contentPane.add(btnIniciarSesion);
		btnIniciarSesion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setBackground(new Color(153, 0, 0));
		btnIniciarSesion.setFocusPainted(false);
		btnIniciarSesion.setBorderPainted(false);
		btnIniciarSesion.setContentAreaFilled(false);
		btnIniciarSesion.setOpaque(true);
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acción al hacer clic en el botón "Registrarse"
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
