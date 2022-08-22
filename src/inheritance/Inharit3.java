package inheritance;

class A{
	int x=20;
	
}
class B extends A{
	int y = 30;
}
class C extends B{
	int z = 50;
	int res;
	
	void add() {
		res = x+y+z;
		System.out.println("Sum is:"+res);
	}
}
public class Inharit3 {
public static void main(String[] args) {
	C obj = new C();
	obj.add();
}
}
