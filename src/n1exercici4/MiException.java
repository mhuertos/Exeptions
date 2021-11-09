package n1exercici4;

public class MiException extends Exception{
	
	private String msj;
	
	public MiException(String msj) {
		this.msj = msj;
	}
	
	public void getMiException() {
		System.out.println(msj);
	}

}
