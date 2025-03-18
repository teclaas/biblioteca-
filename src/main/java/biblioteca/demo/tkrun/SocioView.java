package biblioteca.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.Scrollbar;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class SocioView {

		JFrame frmSocioView;
		private JTable table;
		private JTextField txtNombre;
		private JTextField txtNumeroDeSocio;
		
		public SocioView() {
			inicializar();
		}

		private void inicializar() {
			frmSocioView = new JFrame();
			frmSocioView.getContentPane().setForeground(new Color(255, 51, 102));
			frmSocioView.getContentPane().setFont(new Font("Venus Rising", Font.PLAIN, 16));
			frmSocioView.getContentPane().setBackground(new Color(0, 255, 0));
			frmSocioView.getContentPane().setLayout(new MigLayout("", "[grow][]", "[][grow][][][][][][]"));
			
			JLabel lblNewLabel = new JLabel("SOCIOS Y SUS PRESTAMOS\r\n");
			frmSocioView.getContentPane().add(lblNewLabel, "cell 0 0");
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setViewportBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.CENTER, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
			scrollPane.setToolTipText("LIBROS Y SUS CATEGORIAS");
			frmSocioView.getContentPane().add(scrollPane, "cell 0 1,growx,aligny bottom");
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
				},
				new String[] {
					"ISBN", "NUMERO DE SOCIOS"
				}
			));
			scrollPane.setViewportView(table);
			
			txtNombre = new JTextField();
			txtNombre.setText("Nombre");
			frmSocioView.getContentPane().add(txtNombre, "cell 0 2,growx");
			txtNombre.setColumns(10);
			
			txtNumeroDeSocio = new JTextField();
			txtNumeroDeSocio.setText("Numero de socio");
			frmSocioView.getContentPane().add(txtNumeroDeSocio, "cell 0 3,growx");
			txtNumeroDeSocio.setColumns(10);
			
			JButton btnNewButton = new JButton("Alta");
			frmSocioView.getContentPane().add(btnNewButton, "flowx,cell 0 5");
			
			JButton btnNewButton_1 = new JButton("BAJA");
			frmSocioView.getContentPane().add(btnNewButton_1, "cell 0 5");
			
			JButton btnNewButton_2 = new JButton("MODIFICACION DE LIBROS\r\n");
			frmSocioView.getContentPane().add(btnNewButton_2, "cell 0 5");
			
			
			
		}
		
		
		
}
