package accesssmodif;

class A12{
	private int number=200;
	
	void display() {    //if we declare private over here we cannot access through other class..
		System.out.println("Value is:"+number);
	}
}

public class Test12 {
	public int num = 200;
	public static void main(String[] args) {
		A12 obj = new A12();
		obj.display();
		
		//System.out.println(obj.number);  Variable number is also private so we cannot access thr
	}

}