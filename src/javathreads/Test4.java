package javathreads;

public class Test4 extends Thread {
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
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		ob1.start();
		try {
			ob1.join();//permits one thread to wait until the other thread to finish its execution..
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ob2.start();
	}

}
