package n3exercici1;

public class Main {

	public static void main(String[] args) {
		
		try {
			MiExcepcion e = new MiExcepcion("Esto es MiExcepci�n");
		}catch(Capturador c) {
			System.out.println(c.getMessage());
			
		}
		System.out.println("Salio");

	}

}
