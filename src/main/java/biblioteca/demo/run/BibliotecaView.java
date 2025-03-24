package biblioteca.demo.run;

import javax.swing.JFrame;  // importa la clase Jframe de Swing, para crear ventana
     
     public class BibliotecaView { // es la clase principal define la vista de la biblioteca
    
	
	protected JFrame frmbiblioteca; // es un campo protegido de la ventana principal
	private BibliotecaController controlador;
	public BibliotecaView (BibliotecaController controlador) {// Es el contructor, que llama al método initialize()
     private void initialize (BibliotecaController controlador) { // Es el metodo para configurar la ventana y sus componentes
    	
    	 
    	 	frmBiblioteca = new JFrame();
    	 	frmBiblioteca.getCONTENTPANE().setlayout(new Miglayout)("", "[grow]", "[][][grow][][grow]"));
    	 	frmBiblioteca.getContentPane.setBounds (0,0,500,500);
    	 	this.controlador= controlador; //aqui ya tengo vinculada la vista con el controlador que creo en el SwingMain
            
    	 	JButton btnNeWButton = new JButton( "Bienvenido a la Biblioteca");
    	 	btnNewButton.AddActionListener(new ActionListener() {
    	 		public void actionPerformed(ActionEvent e) {
    	 		Biblioteca.setVistaModel(new Bibliotecaview(controller), new BibliotecaModel());
    	 		
    	 		}
    	 	}
    	 	);
    	 	
    	 frame.getContentpane().add(btnNewButton, BorderLayout.CENTER);
