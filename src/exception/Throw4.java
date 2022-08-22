package exception;

public class Throw4 {
	static void validation1 (int value,String name) throws ArithmeticException {
		if (value==0) {
			throw new ArithmeticException("My exception thrown");
		}
		if (name.equals(null)) {
			throw new NullPointerException("Name error");
		}
	}
	public static void main(String[] args) {
		int num1=10;
		int num2=2; // if it is 0 ther it will throw arithmeticException..
		int res;
		String name = null;
		try {
			validation1(num2,name);
			res = num1/num2;
			System.out.println(res);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}catch(NullPointerException e){
			System.out.println(e);
		}
		System.out.println(19);
}
}
