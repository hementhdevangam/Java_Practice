package abstraction;

abstract class Bike{
	abstract void running();//Funcrion without body or implementation or defination
	
	void display() {
		System.out.println("Display method from Bike class");
		
	}
}
public class Abstract1 extends Bike {
	@Override
	void running() {
		System.out.println("Message from running function");
	}
	public static void main(String[] args) {
		Abstract1 ab = new Abstract1();
		ab.display();
		ab.running();
	}
	
}
