
public class Test6 {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			String os = System.getProperty("os.name");
			System.out.println(os);
			if(os.contains("Windows 10")) {
				Runtime.getRuntime().exec("cls");
			}else if(os.contains("Ubuntu")) {
				Runtime.getRuntime().exec("clear");
			}else {
				System.out.println("No os match found ");
				System.out.flush();
			}
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
