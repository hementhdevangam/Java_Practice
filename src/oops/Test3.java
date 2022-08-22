package oops;

class Product{
	int p_id = 101;
	String p_name= "Laptop";
	int p_qt=10;
	
	void get_product_details() {
		System.out.println(p_id+" "+p_name+" "+p_qt);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.get_product_details();
	}
}
