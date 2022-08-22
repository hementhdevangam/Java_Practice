package javathreads;

public class Test3 extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException ex) {
				System.out.println(ex);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
		
		ob1.start();
		ob2.start();//Parallel execution Happened...
	}

}
