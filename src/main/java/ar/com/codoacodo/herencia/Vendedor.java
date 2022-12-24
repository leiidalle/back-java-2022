package ar.com.codoacodo.herencia;

public class Vendedor {

	public static Consola[] listado(int version) {
		//Crear consolas
		//Consola c = new Consola();
		
		Playstation p1 = new Playstation(version);
		var nw = new NintendoSwitch();
		var sg = new SegaGenesis();
		var xbox360 = new XBox360();
		
		Consola[] listado = new Consola[] {p1,nw,sg,xbox360};
		
		return listado;
	}
}
