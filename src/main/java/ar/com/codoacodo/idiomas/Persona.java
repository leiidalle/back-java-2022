package ar.com.codoacodo.idiomas;

public class Persona implements Ihablar {

	//atributos
	private String nombre;
	private String idioma;
	private String[] otrosIdiomas;
	
	//constructor
	public Persona(String nombre, IIdioma idioma2){
		this.nombre = nombre;
		this.idioma = idioma2;
		this.otrosIdiomas = new String[0];
	};
	public void hablar() {
		System.out.println(this.nombre + "sabe hablar: ");
		System.out.println(this.idioma);
	}
	
	public void decir(String palabra, String idioma) {
		if (this.idioma.equalsIgnoreCase(idioma)) {
			System.out.println(this.nombre + "dice:" + palabra);
		}else {
			System.out.println(this.nombre + "no sabe decir" + palabra + "en" + idioma);
		}
	};
	public void aprender(IIdioma ingles) {
		if(!this.idioma.equals(ingles)) {
			
			//ver si existe en el array de otrosIdiomas
			boolean existe = false;
			for(int i=0;i<this.otrosIdiomas.length;i++) {
				if(this.otrosIdiomas[i].equals(ingles)) {
					existe = true;
				}
				if(existe) {
					break;
				}
			}
			if(existe) {
				System.out.println(this.nombre + " ya habla " + ingles.toUpperCase());
			}else {
				System.out.println(this.nombre + " aprende "+ ingles);
				//agregarlo a la lista!!!!
				String[] aux = copiarIdioma(ingles);
				this.otrosIdiomas = aux;
			}
		}else {
			System.out.println(this.nombre + " ya habla " + ingles.toUpperCase());
		}
	}

	private String[] copiarIdioma(String idioma) {
		String [] aux = new String[this.otrosIdiomas.length + 1];//[ ,]
		for(int i=0;i < this.otrosIdiomas.length;i++) {
			aux[i] = this.otrosIdiomas[0];
		}
		//al final de nuevo array aux, agrego  el idioma que aprende
		aux[aux.length - 1] = idioma;
		return aux;
	}
	public void decirAlgoEnTodosLosIdiomas(String algo) {
		this.idioma.decir(algo);
	
		For(int;i=0;i<this.otrosIdiomas.length;i++){
			this.otrosIdiomas[i].decir(algo);
		};
		
	}
	}
