package interfacee;

interface Shape{
	abstract void circle();
	void square();
}
interface Line{
	void draw_line();
}
public class InterfaceInherit implements Shape,Line{
	public void circle() {
		System.out.println("Msg from Cricle");
		
	}
	public void square() {
		System.out.println("Msg from square");
	}
	public void draw_line() {
		System.out.println("Msg from line");
	}
	public static void main(String[] args) {
		InterfaceInherit it = new InterfaceInherit();
		it.circle();
		it.square();
		it.draw_line();
	}
}
