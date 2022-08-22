package javathreads;

public class Test6 extends Thread {
	public void run() {
		System.out.println("Running...");
	}
	Test6(){
		
	}
	
	Test6(String tname){
		super(tname);
	}
	public static void main(String[] args) {
		Test6 ob1=new Test6();
		Test6 ob2=new Test6();
		Test6 ob3=new Test6("Counting....");
		Test6 ob4=new Test6();
		
		System.out.println(ob1.getName());
		System.out.println(ob2.getName());
		
		ob1.setName("Scanning...");
		ob2.setName("Printing...");
		
		System.out.println(ob1.getName());
		System.out.println(ob2.getName());
		System.out.println(ob3.getName());
		ob4.run();
	}

}
