package polymarphism;

class RBI{
	void rate_of_interest() {
		System.out.println("Rate of interest is 7%");
	}
}
class SBI extends RBI{
	void rate_of_interest() {
		System.out.println("Rate o interest is 8%");
	}
}
class HDFC extends RBI{
	void rate_of_interest() {
		System.out.println("Rate o interest is 10%");
	}
}
class ICICI extends RBI{
	void rate_of_interest() {
		System.out.println("Rate o interest is 12%");
		}
}

public class Override2 {
	public static void main(String[] args) {
		SBI obj = new SBI();
		obj.rate_of_interest();
	}
}


