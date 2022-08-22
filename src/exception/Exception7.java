package exception;

public class Exception7 {
	public static void main(String[] args) {
		int num=20;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(num/0);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Finally block stmt");
		}
		System.out.println(3);
	}

}
