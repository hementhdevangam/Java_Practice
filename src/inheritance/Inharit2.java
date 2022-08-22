package inheritance;

class Company{
	String company_name="Axis";
}
class Employee extends Company{
	int emp_id;
	String emp_name;
	Employee(int emp_id,String emp_name){
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		
	}
	void get_info() {
		System.out.println(this.emp_id+" "+this.emp_name+" "+this.company_name);
		
	}
}
public class Inharit2{
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"John");
		e1.get_info();
		Employee e2 = new Employee(102,"Jimmy");
		e2.get_info();
	}
}