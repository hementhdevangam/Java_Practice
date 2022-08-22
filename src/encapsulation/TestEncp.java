package encapsulation;

public class TestEncp {
	public static void main(String[] args) {
		User user_obj = new User();
		user_obj.setEmail("Hemanth@gmail.com");
		user_obj.setPassword("hello123");
		System.out.println(user_obj.getEmail()+" "+user_obj.getPassword());
		
		User user_obj1 = new User();
		user_obj1.setEmail("Hemanthdevangam@gmail.com");
		user_obj1.setPassword("Welcome123");
		System.out.println(user_obj1.getEmail()+" "+user_obj1.getPassword());
		
		Employee emp = new Employee();
		emp.setEmp_id(100);
		emp.setEmp_name("Rajesh");
		System.out.println(emp.getEmp_id()+" "+emp.getEmp_name());
	}

}
