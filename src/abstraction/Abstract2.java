package abstraction;
abstract class Buyer{
	int p_qty=2;
	int p_cost=3000;
	
	void payment() {
		int amount;
		amount=p_qty*p_cost;
		System.out.println("Payment amount is:"+ amount);
	}
	abstract void margin();
}
public class Abstract2 extends Buyer{
	void margin() {
		int total_cost;
		total_cost=p_qty*p_cost+1000;
		System.out.println("Total cost including margin: "+total_cost);
		
	}
	public static void main(String[] args) {
		Abstract2 obj = new Abstract2();
		obj.payment();
		obj.margin();
	}

}
