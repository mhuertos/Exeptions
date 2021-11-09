package n2exercici2;

public class Exercici2 extends Exception{
	
	
	public static void f() throws ArrayIndexOutOfBoundsException {
		try {
			g();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			throw new ArrayIndexOutOfBoundsException("Esto es una excepcion ArrayIndexOutOfBoundsException");
		}
	}
	
	public static void g() throws RuntimeException {
		throw new RuntimeException("Esto es una excepción de tipo: RuntimeException");
	}
	
	public static void main(String[] args) {
		try{
			f();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
