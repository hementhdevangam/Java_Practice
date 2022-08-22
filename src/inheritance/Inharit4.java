package inheritance;

class A1{
	int x = 20;
	int y = 30;
}
class B1 extends A1{
	
	int res;
	
	void product() {
		res = x*y;
		System.out.println(res);
	}	
}
class C1 extends A1{
	
	int res;
	void addition() {
		res = x+y;
		System.out.println(res);
	}
}
class D1 extends B1{
	void display() {
		System.out.println("Message from Display");
		
	}
}
public class Inharit4 {
	public static void main(String[] args) {
		D1 obj = new D1();
		obj.display();
		obj.product();
		System.out.println("X value is "+obj.x);
		System.out.println("Y value is "+obj.y);
		
		//obj.addition();
		
		C1 obj1 = new C1();
		obj1.addition();
	}

}
