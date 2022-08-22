package exception;

public class Exception3 {
	public static void main(String[] args) {
		System.out.println("Welcome");
		String name= null;
		try {
			System.out.println(name.length());
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		System.out.println("Thank you");
	}

}
