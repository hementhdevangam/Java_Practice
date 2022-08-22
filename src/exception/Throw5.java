package exception;

public class Throw5 {
	static void calculate() {
		try {
			throw new NullPointerException();
		}catch(Exception ex) {
			System.out.println("Exception Handled in calculation()");
			throw ex;
		}
	}
	public static void main(String[] args) {
		try {
			calculate();
		}catch(NullPointerException e) {
			System.out.println("Exception Handle in main");
		}
	}

}
