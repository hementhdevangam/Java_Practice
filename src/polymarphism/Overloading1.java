package polymarphism;

class Calculation1 {
	void addition(int x, int y) {
		int res;
		res = x+y;
		System.out.println("Sum of the numbers:"+res);
		
	}
	void addition(int x , double y) {
		double res;
		res = x+y;
		System.out.println("Sum of numbers:"+res);
		
	}
}
public class Overloading1 {
	public static void main(String[] args) {
		Calculation1 cl = new Calculation1();
		cl.addition(50, 89);
		cl.addition(90,87.09);
	}
}
