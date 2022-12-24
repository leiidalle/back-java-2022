package ar.com.codoacodo.interfaces;

import ar.com.codoacodo.idiomas.Perro;
import ar.com.codoacodo.idiomas.Persona;

public class MainInterfaces {

	public static void main(String[] args) {
		//creo una persona y un perro
		
		Persona p = new Persona("Pilar", "ingles");
		Perro patan = new Perro("patan");
		
		//por implementar IhHablar las dos instancias entienden el metodo hablar()
		
		p.hablar();
		patan.hablar();
		
		IHablar[] pers = new IHablar[2];
		pers[0] = p;
		pers[1] = patan;
	}
}
