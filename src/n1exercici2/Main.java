package n1exercici2;

public class Main {
	
	String mensaje = "Esto es una excepci�n";

	public String getString() {
		return mensaje;
	}
	
	public static void main(String[] args) {
		Main obj = null;
		try {
			obj.getString();
		}catch(Exception e) {
			System.out.println("Esto es una excepci�n"+e.getMessage());
		}
	}
}
