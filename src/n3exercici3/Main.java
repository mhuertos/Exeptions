package n3exercici3;

public class Main {

	public static void main(String[] args) {	
		try {
			FailingConstructor fc = new FailingConstructor("Audi", 2, 5);
		}catch(Exception e) {
			System.out.println(e.getMessage()+". Excepcion de tipo: "+e.getClass());
		}
		
		NovaClase dp = new NovaClase();
		try {
			dp.dispose(12);
			System.out.println("La operación se efectuó correctamente.");
		}catch(Exception e) {
			System.out.println("No has introducido un número correcto");
		}
			
	}
}
