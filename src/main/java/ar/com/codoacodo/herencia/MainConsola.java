package ar.com.codoacodo.herencia;

public class MainConsola {

	public static void main(String[] args) {
		
		//como obtengo la lista de consola
		//invocar un metodo estatico
		Consola[] listado = Vendedor.listado(0);

		//recorro el listado
		for(Consola c: listado) {
			System.out.println(c.getClass().getName());
		}
		
	}
}
