package n1exercici3;

public class Main {
	

	public static void main(String[] args) {
		
		double[] numeros = new double[10];

		try {
			añadeValorArray(numeros);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			MisExcepciones mi_excepcion = new MisExcepciones("No se pueden devolver los valores");
			mi_excepcion.getException();
		}
		
		System.out.println("El error ha sido superado.");
	}
	
	public static double[] añadeValorArray(double[] array) {
		for(int i = 0; i <= 11; i++) {
			array[i] = Math.random() * 7;
		}
		return array;
		
	}
	

}

class MisExcepciones{
	private String msj;
	
	public MisExcepciones(String mensaje) {
		msj = mensaje;
		
	}
	
	public void getException() {
		System.out.println(msj);
	}
}
