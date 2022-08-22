package exception;

class InvalidUserException extends Exception{
	public InvalidUserException(String msg) {
		super(msg);
	}
}
public class TestException {
	static void validateUser(String user) throws InvalidUserException{
		if(user !="admin") {
			throw new InvalidUserException("Invalid User");
		}else {
			System.out.println("Valid User");
		}
	}
	public static void main(String[] args) {
		System.out.println("Begin");
		try {
			validateUser("John");
		}catch(InvalidUserException ex) {
			System.out.println("Exception caught !!!");
		}
		System.out.println("End");
	}
}
