package inheritance;

class Vehicle{
	public int a=10;
}
class Bike extends Vehicle{
	public int b=20;
	void display() {
		System.out.println(b+a);
		System.out.println(super.a);
		//System.out.println(super.b);
	}
}
public class InharitSuper {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();
}
}
