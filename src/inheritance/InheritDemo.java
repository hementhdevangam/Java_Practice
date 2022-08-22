package inheritance;

class Parent{
	int num = 20;
}
class Child extends Parent{
	int res;
	void Calculate() {
		res = num+10;
		System.out.println("Result is:"+res);
		
	}
}
public class InheritDemo {
public static void main(String[] args) {
	Child obj = new Child();
	obj.Calculate();
}
}
