package javathreads;

public class Test2 implements Runnable {
	public void run() {
		System.out.println("Thread is running !!!");
	}
	public static void main(String[] args) {
		Test2 obj = new Test2();
		Thread tobj = new Thread(obj);
		tobj.start();
	}

}
