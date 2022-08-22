package javathreads;

public class Test7 extends Thread {
	public void run() {
		System.out.println("running....");
	}
	public static void main(String[] args) {
		Test7 tob1 = new Test7();
		Test7 tob2 = new Test7();
		Test7 tob3 = new Test7();
		Test7 tob4 = new Test7();
		Test7 tob5 = new Test7();
		
		System.out.println(tob1.getPriority());
		System.out.println(tob2.getPriority());
		System.out.println(tob3.getPriority());
		
		tob1.setPriority(6);
		tob2.setPriority(7);
		tob3.setPriority(8);
		tob4.setPriority(MAX_PRIORITY);
		tob5.setPriority(MIN_PRIORITY);
		
		System.out.println("==========");
		System.out.println(tob1.getPriority());
		System.out.println(tob2.getPriority());
		System.out.println(tob3.getPriority());
		System.out.println(tob4.getPriority());
		System.out.println(tob5.getPriority());


	}

}
