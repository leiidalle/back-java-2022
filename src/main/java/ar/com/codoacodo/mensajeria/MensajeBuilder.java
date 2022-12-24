package ar.com.codoacodo.mensajeria;

public class MensajeBuilder {

	public IMensaje buildMensaje(String destino) {
		
		public void enviar(String args){
			
			String mensajeAEnviar = "aprendiendo interfaces"; 
			
			String destino = "D"; 
			
			IMensaje msj;
			
			switch (destino) {
				case "A":
				msj = new SMS();
				break;
				case "B":
				msj = new DB();
				break;
				case "C":
				msj = new Mail();
				break;
				case "D":
				msj = new DD();
				break;
			default:
				msj = null;
				System.out.println("No existe implementacion para:" + destino);
			};
			return msj;
		};
	};
}
