package learnig;

public class PassByValue1 {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a and b are:" + a + " " + b);
	}

	public static void main(String[] args) {
		int c = 5;
		int d = 4;

		swap(5, 4);
		System.out.println("Value after Swapping of c and d are:" + c + " " + d);
	}

}
