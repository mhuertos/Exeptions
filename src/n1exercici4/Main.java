package n1exercici4;
import java .util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		try {
			int num = sc.nextInt();
		}catch(Exception e) { 
			MiException mi_excepcion = new MiException("Esto no es un entero");
			mi_excepcion.getMiException();
		}
		sc.close();
	}

}
