package biblioteca.demo.tkrun;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.ScrollPane;
import java.awt.Point;
import java.awt.Label;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
public class BibliotecaView {

		protected JFrame frmBiblioteca;
		private JEditorPane texto;
		/**
		 * @wbp.nonvisual location=963,659
		 */
		private final Label label = new Label("New label");
		private JLabel textfield;
		private JTable table;
		private JScrollPane scrollPane;
		private JPasswordField passwordField;
		
		public BibliotecaView() {
			initialize();
			
		}
		
		private void initialize() {
			
			frmBiblioteca= new JFrame();
			frmBiblioteca.getContentPane().setForeground(new Color(204, 153, 153));
			frmBiblioteca.setType(Type.POPUP);
			frmBiblioteca.getContentPane().setLayout(null);
			
			
			JButton Boton = new JButton("ADOPTA UN LIBRO\r\n");
			Boton.setBounds(27, 480, 740, 137);
			Boton.setForeground(new Color(51, 0, 204));
			Boton.setToolTipText("SOCIOS\r\n");
			Boton.setHorizontalAlignment(SwingConstants.LEFT);
			Boton.setFont(new Font("Venus Rising", Font.BOLD | Font.ITALIC, 51));
			Boton.setBackground(new Color(255, 153, 102));
			frmBiblioteca.getContentPane().add(Boton);
			
			texto = new JEditorPane();
			texto.setBounds(30, 0, 424, 56);
			texto.setFont(new Font("Venus Rising", Font.PLAIN, 46));
			texto.setForeground(new Color(102, 255, 51));
			texto.setToolTipText("NUMERO DE SOCIO\r\n");
			texto.setText("BIBLIOTECA");
			frmBiblioteca.getContentPane().add(texto);
			
			textfield = new JLabel("NUMERO SOCIO");
			textfield.setBackground(new Color(51, 255, 51));
			textfield.setHorizontalAlignment(SwingConstants.LEFT);
			textfield.setFont(new Font("Venus Rising", Font.ITALIC, 21));
			textfield.setForeground(new Color(51, 51, 255));
			textfield.setToolTipText("NUMERO SOCIO");
			textfield.setBounds(24, 78, 319, 42);
			frmBiblioteca.getContentPane().add(textfield);
			
			scrollPane = new JScrollPane();
			scrollPane.addAncestorListener(new AncestorListener() {
				public void ancestorAdded(AncestorEvent event) {
				}
				public void ancestorMoved(AncestorEvent event) {
				}
				public void ancestorRemoved(AncestorEvent event) {
				}
			});
			scrollPane.setViewportBorder(new CompoundBorder());
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setToolTipText("LISTA DE LIBROS\r\n\r\n- HISTORIA\r\n-CIENCIA FICCIÓN\r\n-NOVELAS");
			scrollPane.setBounds(27, 163, 499, 217);
			frmBiblioteca.getContentPane().add(scrollPane);
			
			table = new JTable();
			table.setFont(new Font("Venus Rising", Font.PLAIN, 13));
			table.setToolTipText("El numero de los prestamos ");
			table.setForeground(new Color(0, 0, 255));
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{"isbn libro", "prestamo", "N\u00BA Socio", "lista"},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"isbn", "libros", "nºsocio", "lista de libros"
				}
			));
			scrollPane.setViewportView(table);
			
			passwordField = new JPasswordField();
			passwordField.setBackground(Color.GREEN);
			passwordField.setForeground(Color.MAGENTA);
			passwordField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			passwordField.setToolTipText("Log in\r\n\r\nusuario :********************\r\ncontraseña:******************\r\n\r\n\r\n¿olvidaste la contraseña?");
			passwordField.setHorizontalAlignment(SwingConstants.TRAILING);
			passwordField.setBounds(575, 78, 351, 85);
			frmBiblioteca.getContentPane().add(passwordField);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("REGISTRATE\r\n");
			chckbxNewCheckBox.setBounds(589, 35, 112, 24);
			frmBiblioteca.getContentPane().add(chckbxNewCheckBox);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setBounds(112, 454, 78, -58);
			frmBiblioteca.getContentPane().add(progressBar);
			frmBiblioteca.setVisible(true);
			
		}
}
