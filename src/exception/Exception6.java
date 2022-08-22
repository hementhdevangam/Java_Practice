package exception;

public class Exception6 {
	public static void main(String[] args) {
		int num=20;
		String name=null;
		try {
			System.out.println(num);
			System.out.println(name.length());
			System.out.println(num/0);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}catch(NullPointerException ex) {
			System.out.println(ex);
			}
		
	}

}
