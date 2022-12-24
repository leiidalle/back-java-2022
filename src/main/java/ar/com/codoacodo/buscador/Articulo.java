package ar.com.codoacodo.buscador;

public class Articulo {

	//atributos
	private String img;
	private String titulo;
	private String autor;
	private Double precio;
	
	//constructor
	public Articulo(String img, String titulo, String autor, double precio){
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	};

	//metodos
	//alt+shift+s

	public void detalle() {
		System.out.println("detallando articulo..");
		System.out.println("Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]");
	}
	
}
