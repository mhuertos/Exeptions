package n1exercici1;

public class Main {

	public static void main(String[] args) {
	
		try {
			throw new Exception("Esto es una Excepci�n");	
		}catch(Exception e) {
			System.out.println("Se ha producido una excepcion "+e.getMessage());
		}finally {
			System.out.println("final");
		}

	}

}
