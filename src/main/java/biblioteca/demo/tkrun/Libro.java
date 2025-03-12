package biblioteca.demo.tkrun;

public class Libro {



	private int isbn;//asociada a clave primaria en la tabla de DB
	private String titulo;
	private String autor;
	private int edicion;
	
	public void darAltainvertario(int i) {
	//metodo utilizado para meter libro en inventario//
   //como argumentos le tengo que pasar todos los datos del libro
    
}

	public void darBajaInventario (int i) {
		//metodo utilizado para dar de baja un libro en  el inventario//
		//como argumento le paso e isbn que es el identificador del libro DB//
}

	public int getIsbn() { 
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {//el nombre de la funcion y el nombre de la funcion string y sino tengo que escribirlos igual
							// el stributo lo devuelve como autor get autor y debvuelve el atributo.y asi con todos los get.
		return autor;
	}

	public void setAutor(String autor) {// le asigna un metodo al atributo metodo string.(nola miraremos)
		this.autor = autor;
	}

	public int getEdicion() {// el  metodo get devuelve el valor del atributo edicion de la clase Libro 
								//al ser publico, se puede invocar o llamar desde fuera de la clase
								// al defini el metodo me tiene que devolver un tipo int, porque el atributo edicion esta edicion esta definido como entero.

								//el cursor indica que el atributo esta en mayuscula
		return edicion;
	}

	public void setEdicion(int edicion) {// al poner tipo void no me hace falta poner la sentencia return
		this.edicion = edicion; //asigna al atributo edición, el valor que le pasda como argumentos la llamada al metodo.
	}

}

