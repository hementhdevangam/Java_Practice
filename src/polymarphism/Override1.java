package polymarphism;

class Vehicle{
	int speed=100;
	void running() {
		
		System.out.println("Vehicle is running: "+speed);
	}
	
}
class Bike  extends Vehicle{
	int speed=200;
	void running() {
		
		System.out.println("Bike is running: "+super.speed);//use of override....
		
	}
}
public class Override1{
	public static void main(String[] args) {
		Bike b = new Bike();
		b.running();
		Vehicle v = new Vehicle();
		v.running();
	
	}
}