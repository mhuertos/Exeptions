package n2exercici1;

public class Exercici1 extends Exception{
	
	
	public static void f() throws ArrayIndexOutOfBoundsException {
		try {
			g();
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			throw new ArrayIndexOutOfBoundsException("Esto es una excepcion ArrayIndexOutOfBoundsException");
		}
	}
	
	public static void g() throws NullPointerException {
		throw new NullPointerException("Esto es una excepción de tipo: NullPointerException");
	}
	
	public static void main(String[] args) {
		try{
			f();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
