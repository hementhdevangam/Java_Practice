package polymarphism;

class Products{
	int p_qty=2;
	
	void calculate(int mrp) {
		int res = p_qty *mrp; 
		System.out.println("Amount is: "+res);
	}
	
}

class Payment extends Products{
	
	void calculate(int mrp) {
		int res = p_qty *mrp; 
		System.out.println("Payment class-Amount is: "+res);
	}
}
public class OverrideParam {
	public static void main(String[] args) {
		Payment p = new Payment();
		p.calculate(200);
	}
}
