package interfacee;

interface I1{
	void show();
	void display();
}
public class Interface1 implements I1 {
	public void show() {
		System.out.println("Message from show()");
	}
	public void display() {
		System.out.println("Message from Display()");
	}
	public static void main(String[] args) {
		Interface1 obj = new Interface1();
		obj.display();
		obj.show();
	}
	}

