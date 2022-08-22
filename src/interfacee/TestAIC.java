package interfacee;

interface Task{
	void counting(); 
		
}
public class TestAIC {
	public static void main(String[] args) {
		Task obj = new Task() {
			public void counting() {
				System.out.println("Counting completed...");
			}
		};
		obj.counting();
	}
}
