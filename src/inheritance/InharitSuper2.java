package inheritance;

class Vehicle1{
	int speed = 100;
	Vehicle1(){
		System.out.println("Vehicle - Constructor !!!" );
	}
	
	void running() {
		System.out.println("Vehicle running at : "+speed+"/hr");
	}
}
class Bike1 extends Vehicle1{
	Bike1(){
		super();
		System.out.println(super.speed);
		super.running();
	}
}
public class InharitSuper2 {
	public static void main(String[] args) {
		new Bike1();
	}
}
