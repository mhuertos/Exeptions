package n3exercici3;

public class NovaClase {
	
	public void dispose(int numero) throws Exception{
		if(numero > 10) {
			throw new Exception("Necesitas poner un número menor que 10.");
		}
	}
}
