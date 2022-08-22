package javathreads;

public class Test1 extends Thread{
	public void run() {
		System.out.println("My Thread is running....");
	}
	public static void main(String[] args) {
		Test1 ob = new Test1();
		ob.start();
	}
}
