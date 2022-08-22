package inheritance;

class A11{
	int x = 20;
	int y = 30;
	
}
class B11 extends A11{
	
	int res;
	
	void product() {
		res = x*y;
		System.out.println(res);
	}	
}
class C11 extends A11{
	
	int res;
	void addition() {
		res = x+y;
		System.out.println(res);
	}
	C11(){
		
		System.out.println(res);
		System.out.println(super.x);
		System.out.println(super.y);
		//System.out.println(super.res); if C11 extends B11 thin in is possible..
		}
	}


public class InheritDiamondSuper {
	public static void main(String[] args) {
		new C11();
		C11 c = new C11();
		c.addition();
		B11 b = new B11();
		
		b.product();

}
}