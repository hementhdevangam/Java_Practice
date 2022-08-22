//Functions....
public class Test2 {
	static void addition() {
		int  num1 = 800;
		int num2 = 40;
		int res;
		res = num1+num2;
		
		System.out.println("Sum of "+num1+" and " +num2+" is: "+res);
	}	
	static void sub() {
		
		int  num1 = 800;
		int num2 = 40;
		int res;
		res = num1 - num2;
		System.out.println("Substraction of two numbers:"+res);
	}
	static void mul() {
		int  num1 = 800;
		int num2 = 40;
		int res;
		res = num1 * num2;
		System.out.println("multiplaction of two numbers:"+res);
	}
	static void division() {
		int  num1 = 800;
		int num2 = 40;
		int res;
		res = num1 / num2;
		System.out.println("Division of two numbers:"+res);
	}
	
	public static void main(String[] args) {
		addition();//calling function..
		sub();
		mul();
		division();
		
	}

}
