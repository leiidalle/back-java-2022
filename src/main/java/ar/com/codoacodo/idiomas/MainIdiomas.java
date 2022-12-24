package ar.com.codoacodo.idiomas;

public class MainIdiomas {

	public static void main(String[] args) {
		
		//Interface i = new ClaseQueImplementaN()
		IIdioma idioma = new Espanol();
		
		Persona carlos = new Persona("carlos",IIdioma);
		
		IIdioma ingles = new Ingles();
		carlos.decir("hola", ingles);
		
		idioma = new Ingles();
		
		Persona eduardo = new Persona("eduardo", idioma); 
		eduardo.decir("hola", ingles);
		
		//recrear a carlos 
		carlos = new Persona("carlos", idioma);
		carlos.decir("hola", ingles);
		
		//f3
		eduardo.aprender(ingles);
		eduardo.aprender(new Espanol());//f5
		eduardo.aprender(new Chino());//f5
		
		eduardo.decirAlgoEnTodosLosIdiomas("algo");
	}//f8
}
