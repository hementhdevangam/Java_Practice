package polymarphism;

class One{
	int res;
	void addition(int x , int y) {
		res = x+y;
		System.out.println("Sum of the two numbers are: "+res);
	}
	void addition(int x,int y,int z)
	{
		
		res=x+y+z;
		System.out.println("Sum of three numbers are: "+res);
	}
}
public class Overloading {
	public static void main(String[] args) {
		One obj = new One();
		obj.addition(10,20);
		obj.addition(20,23,45);
	}

}
