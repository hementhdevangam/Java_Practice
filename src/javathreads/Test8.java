package javathreads;

public class Test8 extends Test7 {
	public static void main(String[] args) {
		Test7 tob1 = new Test7();
		Test7 tob2 = new Test7();
		Test7 tob3 = new Test7();
		Test7 tob4 = new Test7();

		
		tob1.setPriority(MIN_PRIORITY);
		tob2.setPriority(MAX_PRIORITY);
		tob3.setPriority(NORM_PRIORITY);
		
		tob4.run();//Test 7 method is calling here run() 

		System.out.println(tob1.getPriority());
		System.out.println(tob2.getPriority());
		System.out.println(tob3.getPriority());
		
	}

}
