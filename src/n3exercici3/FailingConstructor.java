package n3exercici3;

public class FailingConstructor {
	
	private String nombre;
	private int ancho;
	private int largo;

	public FailingConstructor(String nombre, int ancho, int largo) throws Exception{
		this.nombre = nombre;
		this.ancho = ancho;
		if(largo >= 3) {
			throw new Exception("El largo tiene que ser menor que 3");
		}else {
			this.largo = largo;
		}
	}
}
