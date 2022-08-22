package oops;

class  Employee{
	int emp_id;
	String emp_name;
	Employee(){
		System.out.println("Default constructor gets executed");
		emp_id=101;
		emp_name="Hemanth";
	}
	
		void dispaly() {
			System.out.println(emp_id+" "+emp_name);
		}
	
}
public class Test4 {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.dispaly();
		
	}

}
