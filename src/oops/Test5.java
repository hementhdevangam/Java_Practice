package oops;

class User{
	String name;
	String password;
	
	User(String name, String password){
		this.name=name;
		this.password=password;
	}
	void get_user_info() {
		System.out.println(this.name + " "+this.password);
	}	
}

public class Test5 {
	public static void main(String[] args) {
		
		User obj = new User("John","john123");
		obj.get_user_info();
		
		User obj1 = new User("Jimmy","jimmy123");
		obj1.get_user_info();
		
	}

}

