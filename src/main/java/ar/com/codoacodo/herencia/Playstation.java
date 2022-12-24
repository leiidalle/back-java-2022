package ar.com.codoacodo.herencia;

public class Playstation extends Consola{

	private int version;
	
	public Playstation(int version) {
		//invocar al constructor del padre
		super(1024, "PlayStation");
		this.version = version;
	}
		public int getVersion() {
			return this.version;
		}
}
