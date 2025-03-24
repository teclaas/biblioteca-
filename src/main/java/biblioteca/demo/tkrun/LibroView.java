package biblioteca.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LibroView {
	
	JFrame frame;
	private JTextField txtHistoria_1;
	private JTextField txtCiencias;
	private JTextField txtHistoria;
	private JTable table;
	private JTable table_1;
	
	public LibroView() {
		inicializar ();
		
	}
	
	private void inicializar() {
		
		frame=new JFrame ();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.getContentPane().setLayout(new MigLayout("", "[grow][grow][][grow][]", "[grow][][grow][][][grow][][][grow][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Lista de libros");
		frame.getContentPane().add(lblNewLabel, "cell 0 2");
		
		JPanel panel = new JPanel();
		panel.setToolTipText("categorias de libros");
		frame.getContentPane().add(panel, "cell 2 2 2 1,grow");
		
		txtHistoria = new JTextField();
		txtHistoria.setText("historia\r\n");
		panel.add(txtHistoria);
		txtHistoria.setColumns(10);
		
		txtCiencias = new JTextField();
		txtCiencias.setText("ciencias\r\n");
		panel.add(txtCiencias);
		txtCiencias.setColumns(10);
		
		txtHistoria_1 = new JTextField();
		txtHistoria_1.setText("comics\r\n");
		panel.add(txtHistoria_1);
		txtHistoria_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("secciones de libro");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(lblNewLabel_1, "cell 0 4");
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, "cell 3 5,grow");
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setViewportView(scrollBar);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setRowHeaderView(table);
		
		table_1 = new JTable();
		table_1.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(table_1);
		
		frame.setVisible(true);
		
	}

}
