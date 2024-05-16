package Concesionario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class V_inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_inicio frame = new V_inicio();
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
	public V_inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1413, 793);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(0, 0, 1397, 754);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(151, 0, 0));
		panel_1.setBounds(0, 0, 317, 773);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 209, 317, 10);
		panel_1.add(panel_3);

		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(
				"C:\\Users\\javie\\OneDrive\\Escritorio\\proyectos JAVA\\Concesionario\\imagenes\\logo1.png"));
		lblLogo.setBounds(98, 11, 153, 179);
		panel_1.add(lblLogo);

		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(0, 275, 317, 10);
		panel_1.add(panel_3_1);

		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBounds(0, 341, 317, 10);
		panel_1.add(panel_3_1_1);

		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBounds(0, 409, 317, 10);
		panel_1.add(panel_3_1_1_1);

		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBounds(0, 478, 317, 10);
		panel_1.add(panel_3_1_1_1_1);

		JButton btnVerCatalogo = new JButton("Ver Catalogo");
		btnVerCatalogo.setForeground(Color.WHITE);
		btnVerCatalogo.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnVerCatalogo.setBackground(new Color(151, 0, 0));
		btnVerCatalogo.setBounds(0, 286, 317, 56);
		panel_1.add(btnVerCatalogo);

		JButton btnAlquilar = new JButton("Alquilar");
		btnAlquilar.setForeground(Color.WHITE);
		btnAlquilar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnAlquilar.setBackground(new Color(151, 0, 0));
		btnAlquilar.setBounds(0, 352, 317, 56);
		panel_1.add(btnAlquilar);

		JButton btnComprar = new JButton("Comprar");
		btnComprar.setForeground(Color.WHITE);
		btnComprar.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnComprar.setBackground(new Color(151, 0, 0));
		btnComprar.setBounds(0, 421, 317, 56);
		panel_1.add(btnComprar);

		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setBounds(0, 547, 317, 10);
		panel_1.add(panel_3_1_1_1_1_1);

		JButton btnMiInformacion = new JButton("Mi información");
		btnMiInformacion.setForeground(Color.WHITE);
		btnMiInformacion.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnMiInformacion.setBackground(new Color(151, 0, 0));
		btnMiInformacion.setBounds(0, 490, 317, 56);
		panel_1.add(btnMiInformacion);

		JButton btnInicio = new JButton("Inicio");
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnInicio.setBackground(new Color(202, 0, 0));
		btnInicio.setBounds(0, 219, 317, 56);
		panel_1.add(btnInicio);

		JPanel panel_3_1_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1_1.setBounds(0, 615, 317, 10);
		panel_1.add(panel_3_1_1_1_1_1_1);

		JButton btnCambiarCuenta = new JButton("Cambiar de cuenta");
		btnCambiarCuenta.setForeground(Color.WHITE);
		btnCambiarCuenta.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		btnCambiarCuenta.setBackground(new Color(151, 0, 0));
		btnCambiarCuenta.setBounds(0, 558, 317, 56);
		panel_1.add(btnCambiarCuenta);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(151, 0, 0));
		panel_2.setBounds(317, 0, 1144, 61);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton closeButton = new JButton("X");
		closeButton.setBounds(987, 0, 66, 61);
		panel_2.add(closeButton);
		closeButton.setOpaque(true);
		closeButton.setForeground(new Color(255, 255, 255));
		closeButton.setFont(new Font("Segoe UI", Font.BOLD, 25));
		closeButton.setFocusPainted(false);
		closeButton.setContentAreaFilled(false);
		closeButton.setBorderPainted(false);
		closeButton.setBackground(new Color(0, 0, 0)); // Fondo negro por defecto
		closeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				closeButton.setBackground(new Color(255, 128, 128)); // Cambia el color cuando el mouse entra
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				closeButton.setBackground(new Color(0, 0, 0)); // Vuelve al color original cuando el mouse sale
			}
		});

		JLabel lblNewLabel = new JLabel("Bienbenido/a " + Cliente.getNombre());
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(418, 65, 381, 61);
		panel.add(lblNewLabel);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(151, 0, 0));
		panel_4.setBounds(398, 127, 999, 78);
		panel.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Acceso concedido como:        Cliente");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(22, 0, 335, 75);
		panel_4.add(lblNewLabel_1);

		LocalDateTime fecha = LocalDateTime.now();

		JLabel lblFecha = new JLabel("" + fecha.toLocalDate());
		lblFecha.setForeground(new Color(255, 255, 255));
		lblFecha.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 18));
		lblFecha.setBounds(812, 21, 154, 41);
		panel_4.add(lblFecha);

		JTextArea txttextointroduccion = new JTextArea();
		txttextointroduccion.setEditable(false);
		txttextointroduccion.setText(
				"¡Bienvenido/a!\n\nNos alegra tenerte aquí en nuestro concesionario.\n\nAquí encontrarás una amplia selección de vehículos para satisfacer tus necesidades y gustos.\n\nNo dudes en explorar nuestro catálogo y descubrir las últimas novedades en automóviles.\n\nSi necesitas ayuda o tienes alguna pregunta, nuestro equipo estará encantado de asistirte.\n\n¡Que tengas una excelente experiencia en nuestro concesionario!\n\nEstamos aquí para hacer que tu búsqueda de vehículos sea emocionante y sin complicaciones. 😊");
		txttextointroduccion.setForeground(Color.WHITE);
		txttextointroduccion.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 16));
		txttextointroduccion.setBackground(new Color(128, 128, 128));
		txttextointroduccion.setBounds(430, 277, 868, 388);
		panel.add(txttextointroduccion);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(388, 238, 946, 462);
		panel.add(panel_5);
		panel_5.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 128, 128));
		panel_6.setBounds(10, 11, 926, 440);
		panel_5.add(panel_6);

	}
}
