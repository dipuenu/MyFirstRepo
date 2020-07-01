
public class Exception {

	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;

			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " occured,Please check");
		} catch (IllegalArgumentException e) {
			System.out.println("check your casting carefully");
		} finally {
			System.out.println("Sorry for the inconvenience");
		}
		System.out.println("very important code");
		System.out.println("Need to run");
	}

}
