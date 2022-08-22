package exception;

public class Throw2 {
	
	static void calculation() throws ArithmeticException{
		throw new ArithmeticException();
	}
	public static void main(String[] args)  {
		System.out.println(1);
		try {
			calculation();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(3);
	}
}
