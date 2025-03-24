package biblioteca.demo.run;

public class BibliotecaController {

 private Biblioteca model;
 private Biblioteca view;
 
 public void  setVistaMODEL(BibliotecaView v, Bibliotecamodel m) {
	 this.model = m;
	 this.view= v;
	 // inicializar la vista//
	 this.view.getFrame().setVisible(true);
 }
 }
