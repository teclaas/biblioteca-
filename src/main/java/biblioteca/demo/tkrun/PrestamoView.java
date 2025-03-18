package biblioteca.demo.tkrun;



import java.awt.EventQueue;
import javax.swing.JFrame;

import biblioteca.demo.tkrun.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.tkrun.*;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;

public class PrestamoView {
	
	private JFrame frmPrestamo ;
	private JTextField textField;
	private JTextField textField_1;
	
	public PrestamoView() {
		inicializar();
	}

	private void inicializar() {
		// TODO Auto-generated method stub
		frmPrestamo = new JFrame();
		frmPrestamo.getContentPane().setLayout(new MigLayout("", "[][grow]", "[][][][][][][]"));
		frmPrestamo.setBounds(0,0,550,180); //para ponerle tamaño a la ventana
		
		JLabel lblNewLabel = new JLabel("numero de socio\r\n");
		frmPrestamo.getContentPane().add(lblNewLabel, "flowy,cell 0 0,alignx trailing");
		
		textField = new JTextField();
		frmPrestamo.getContentPane().add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("isbn");
		frmPrestamo.getContentPane().add(lblNewLabel_1, "cell 0 2,alignx trailing");
		
		textField_1 = new JTextField();
		frmPrestamo.getContentPane().add(textField_1, "cell 1 2,growx");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Baja prestamo\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmPrestamo.getContentPane().add(btnNewButton, "flowx,cell 1 6");
		
		JButton btnNewButton_1 = new JButton("Alta Prestamo");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmPrestamo.getContentPane().add(btnNewButton_1, "cell 1 6");
		frmPrestamo.setVisible(true);
		
	}
	
}