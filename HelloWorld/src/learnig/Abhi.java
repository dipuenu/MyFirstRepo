package learnig;

import java.math.BigInteger;
import java.util.Scanner;

public class Abhi {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of term in fabonacci series");
		int n = in.nextInt();
		int a = 0;
		int b = 1;

		System.out.print(a + " " + b);
		for (int i = 0; i < n - 2; i++) {
			int c=a+b;
			a = b;
			b = c;
			System.out.print(" " + c + " ");

		}
	}
}
