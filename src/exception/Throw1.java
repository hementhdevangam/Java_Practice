package exception;

public class Throw1 {
	static void calculate() {
		try {
			throw new NullPointerException();
		}catch(Exception ex){
		ex.printStackTrace();
		System.out.println("Exception Handled in calculaton:");
		throw ex;
		}
	}
	public static void main(String[] args) {
		try {
			calculate();
		}catch(NullPointerException e) {
			System.out.println("Exception handled in mains");
		}
	}

}
