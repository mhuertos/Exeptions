package n1exercici5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean numCorrecto = false;
		int num;
		
		while(!numCorrecto) {
			try {
				System.out.print("Introduce un n�mero: ");
				num = sc.nextInt();
				sc.nextLine();
				System.out.println("El n�mero introducido �s: "+num);
				numCorrecto = true;
				
			}catch(Exception e) {
				e.getMessage();
				System.out.println("No se ha introducido un entero");
				sc.nextLine();
			}
		}
		sc.close();

	}

}
