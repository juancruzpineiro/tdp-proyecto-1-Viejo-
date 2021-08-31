package gui;



import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField numeroLU;
	private JLabel labelLU;
	private JTextField cajaApellido;
	private JLabel labelApellido;
	private JLabel labelNombre;
	private JLabel labelEmail;
	private JLabel labelGitHub;
	private JTextField fieldNombre;
	private JTextField fieldEmail;
	private JTextField fieldGitHub;
	private JLabel labelFechaHora;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 285));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	/**
	 * devuelve un String con la hora actual en formato hh:mm:ss
	 * @return hora en formato hh:mm:ss.
	 */
	private String horaActual() {
		LocalTime hora= LocalTime.now();
		
		DateTimeFormatter formatoFechayHora = DateTimeFormatter.ofPattern("HH:mm:ss");

	   return hora.format(formatoFechayHora);
	}
	
	/**
	 * devuelve un String con la fecha en formato  dd/mm/yyyy
	 * @return fecha actual
	 */
	private String fechaActual() {
		LocalDate fecha= LocalDate.now();
		
		DateTimeFormatter formatoFechayHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    return fecha.format(formatoFechayHora);
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
		tabInformation = new JPanel();
		tabInformation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		numeroLU = new JTextField();
		numeroLU.setEditable(false);
		numeroLU.setColumns(10);
		numeroLU.setText(studentData.getId() + "");
		
		labelLU = new JLabel("LU:");
		labelLU.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		cajaApellido = new JTextField();
		cajaApellido.setEditable(false);
		cajaApellido.setText("0");
		cajaApellido.setColumns(10);
		cajaApellido.setText(studentData.getLastName());
		
		labelApellido = new JLabel("Apellido:");
		labelApellido.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		labelEmail = new JLabel("E-Mail:");
		labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		labelGitHub = new JLabel("GitHub URL:");
		labelGitHub.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		fieldNombre = new JTextField();
		fieldNombre.setEditable(false);
		fieldNombre.setText("0");
		fieldNombre.setColumns(10);
		fieldNombre.setText(studentData.getFirstName());
		
		fieldEmail = new JTextField();
		fieldEmail.setEditable(false);
		fieldEmail.setText("0");
		fieldEmail.setColumns(10);
		fieldEmail.setText(studentData.getMail());
		
		fieldGitHub = new JTextField();
		fieldGitHub.setEditable(false);
		fieldGitHub.setText("0");
		fieldGitHub.setColumns(10);
		fieldGitHub.setText(studentData.getGithubURL());
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(labelLU)
								.addComponent(labelApellido, GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE))
							.addGap(12))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 873, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 873, GroupLayout.PREFERRED_SIZE))
						.addComponent(labelGitHub, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
							.addComponent(numeroLU, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addComponent(cajaApellido, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addComponent(fieldNombre, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
						.addComponent(fieldGitHub, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelLU, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelApellido, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(cajaApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
								.addComponent(labelGitHub, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(fieldGitHub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(numeroLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(1188, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		labelFechaHora = new JLabel("Esta ventana fue generada el " + fechaActual() + " a las " + horaActual());
		
		JLabel labelFoto = new JLabel("");
		labelFoto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/fotoalumno.jpg")));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(labelFoto))
						.addComponent(labelFechaHora))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(labelFechaHora))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(labelFoto)))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
