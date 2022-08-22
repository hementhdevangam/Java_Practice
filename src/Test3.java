
public class Test3 {
	static void addition(int num1, int num2) {//function with parameters
		int res;
		res = num1+num2;
		
		System.out.println("Sum of "+num1+" and " +num2+" is: "+res);
	}
	static void sub(int num1,int num2,int num3) {
		int res;
		res = num1 - num2-num3;
		
		System.out.println("Substraction of three numbers:"+res);
	}
	public static void main(String[] args) {
		addition(50,50);
		sub(600,50,70);
	}

}
