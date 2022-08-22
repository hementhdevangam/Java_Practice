package exception;

public class Exception5 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.charAt(1));
		
		try {
			System.out.println(str.charAt(9));
		}catch(Exception ex) {
			System.out.println(ex);
		}
		System.out.println(str.charAt(4));
	}

}
