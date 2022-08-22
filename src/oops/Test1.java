package oops;


	class Person{
		String pName = "Hemanth";
		String pEmail= "Hd@gmail.com";
		String pHone= "8464972340";
		void info() {
			System.out.println(pName +" "+pEmail +" "+pHone);
		}
	}
	public class Test1 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.pName);
		System.out.println("=======");
		p.info();
		
	
		
	}

}
