package ar.com.codoacodo.buscador;

public class Buscador {

	// atributos
	 private String claveBusqueda;
	 private int cantidad;
	 private Articulo[] resultados;
	 
	 public Buscador(){
		 
	 }

	//metodos
	 public void buscar() {
		 //crear dos articulos y ponerlos dentro de
		 //array/vector resultados
		 
		 //crear un array
		 /*int[] array = new Int[2];
		 String[] nombres = new String[2];
		 boolean[] flags = new Boolean[2];
		 Articulo[] otroRes = new Articulo[2];*/
		 
		 //creo el primer resultado Articulo
		 Articulo res1 = new Articulo("http://sitio.com.ar/img/1.jpg",claveBusqueda,"autor 1",2450);
		 Articulo res2 = new Articulo("http://sitio.com.ar/img/2.jpg",claveBusqueda,"autor 2",1850);
		 
		 resultados =  new Articulo[2];
		 //cargar cada resultado en una posicion
		 resultados[0] = res1;
		 resultados[1] = res2;
		 
		 //actualizo la cantidad de resultados en 
		 //base al tamaño del vector
		 cantidad = resultados.length;
	 }
	 
	 public void setClaveBusqueda(String claveQueVieneDeAfuera) {
		 claveBusqueda = claveQueVieneDeAfuera;
	 }
	 
	 public Articulo[] getResultados() {
		 return resultados;
	 }
	 public int getTotal() {
		 return cantidad;
	 }
}
