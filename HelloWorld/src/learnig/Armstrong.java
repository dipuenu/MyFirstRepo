package learnig;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int item = n;
		double sum = 0;
		while (item > 0) {
			int x = item % 10;
			double y = Math.pow(x, 3);
			System.out.println(y);
			sum = sum + y;
			item = item / 10;

		}
		if (sum == n) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not armstrong number");
		}
	}

}
