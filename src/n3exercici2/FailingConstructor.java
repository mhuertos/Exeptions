package n3exercici2;

import java.util.Scanner;

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
	
	public static void main(String[] args) {	
		try {
			FailingConstructor fc = new FailingConstructor("Audi", 2, 4);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
