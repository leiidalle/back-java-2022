package ar.com.codoacodo.mensajeria;

public class MainMensajeria {

	public void enviar(String args) {
		
		String mensajeAEnviar = "aprendiendo interfaces"; 
		
		String destino = "D"; 
		
		MensajeBuilder msjBuilder = new MensajeBuilder();
		
		IMensaje msj = msjBuilder.buildMensaje(destino);
		
		if (msj != null) {
			msj.enviar(mensajeAEnviar);
		}else {
			System.out.println("Error enviando msj");
		}
	}
}
