package exception;

public class Throw3 {
	static void validation (int value) {
		if (value==0) {
			throw new ArithmeticException("My exception thrown");
		}
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		int res;
		try {
			validation(num2);
			res = num1/num2;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
}
}
