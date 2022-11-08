package ar.com.codoacodo.buscador;

public class Buscador {

	// atributos
	 String claveBusqueda;
	 int cantidad;
	 Articulo[] resultados;

	//metodos
	 void buscar() {
		 //crear dos articulos y ponerlos dentro de
		 //array/vector resultados
		 
		 //crear un array
		 /*int[] array = new Int[2];
		 String[] nombres = new String[2];
		 boolean[] flags = new Boolean[2];
		 Articulo[] otroRes = new Articulo[2];*/
		 
		 //creo el primer resultado Articulo
		 Articulo res1 = new Articulo();
		 Articulo res2 = new Articulo();
		 
		 resultados =  new Articulo[2];
		 //cargar cada resultado en una posicion
		 resultados[0] = res1;
		 resultados[1] = res2;
		 
		 //actualizo la cantidad de resultados en 
		 //base al tamaño del vector
		 cantidad = resultados.length;
	 }
	 
	 void setClaveBusqueda(String claveQueVieneDeAfuera) {
		 claveBusqueda = claveQueVieneDeAfuera;
	 }
	 
	 Articulo[] getResultados() {
		 return resultados;
	 }
	 int getTotal() {
		 return cantidad;
	 }
}
