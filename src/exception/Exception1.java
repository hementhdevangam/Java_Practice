package exception;

public class Exception1 {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);
		try {
		
			System.out.println(50/0);
		}
		catch(Exception ex) {
			System.out.println("Exception occured!!");
		}
		System.out.println(60);
		System.out.println(70);
		System.out.println(80);
		System.out.println(90);
		System.out.println(100);
}
}
