package accesssmodif;

class A{
	private int number=200;
	
	void display() {    //if we declare private over here we cannot access through other class..
		System.out.println("Value is:"+number);
	}
}

public class Test11 {
	public int num = 200;
	public static void main(String[] args) {
		A obj = new A();
		obj.display();
		
		//System.out.println(obj.number);  Variable number is also private so we cannot access thr
	}

}
