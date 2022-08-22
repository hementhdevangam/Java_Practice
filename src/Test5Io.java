import java.util.Scanner;
public class Test5Io {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println("Enter Branch");
		String branch = sc.next();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Percentage");
		double per = sc.nextDouble();
		
		System.out.println("Name is: "+name);
		System.out.println("Branch is: "+branch);
		System.out.println("Age is: "+age);
		System.out.println("Percentage is: "+per);

	}
}