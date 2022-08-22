package exception;

public class Exception4 {
	public static void main(String[] args) {
		int number[] = {10,20,30,40,50};
		System.out.println(number[4]);
		try {
			System.out.println(number[6]);
		}catch(Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
			System.out.println(number[3]);
		}
		System.out.println(number[2]);
	}
}
