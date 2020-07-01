package learnig;

import java.util.Scanner;

public class StrongNumbers {
	public static long fun(int x) {
		if (x >= 1) {
			return x * fun(x - 1);
		} else {
			return 1;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");

		int n = sc.nextInt();
		float sum = 0;
		float y = 0;
		int item = n;

		while (item > 0) {

			int lastDigit = item % 10;
			y = fun(lastDigit);
			sum = sum + y;
			item = item / 10;

		}
		if (sum == n)
			System.out.println("Strong number");
		else
			System.out.println("Not strong number");
	}
}
