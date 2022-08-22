package interfacee;

abstract class Task9{
	abstract void counting();	
}
public class Test6 {
	public static void main(String[] args) {
		Task9 obj = new Task9() {
			public void counting() {
				System.out.println("Counting completed...");
			}
		};
		obj.counting();
	}
}
