package exception;

public class Exception2 {
	public static void main(String[] args) {
		int number = 20;
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(number/0);
			System.out.println(3);
		}catch(Exception ex){
			System.out.println(4);
			System.out.println("Exception occured");
		}
	}
}
