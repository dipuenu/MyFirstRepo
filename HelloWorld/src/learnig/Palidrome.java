package learnig;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int item = n;
		int x = 0;
		while (item > 0) {
			int lastDigit = item % 10;
			x = x * 10 + lastDigit;
			item = item / 10;

		}
		if (x == n)
			System.out.println("number is palidrome");
		else
			System.out.println("Number is not palidrome");
	}

}
