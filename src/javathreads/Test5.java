package javathreads;

class Test5 extends Test4{
	public static void main(String[] args) {
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		ob1.start();
		try {
			ob1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		ob2.start();
	}

}
