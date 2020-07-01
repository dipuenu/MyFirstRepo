package learnig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int sum = 0;
		

		for (int i = 1; i <= n / 2; i++) {

			if (n % i == 0) {

				sum = sum + i;

			}
		}
		if (sum == n) {
			System.out.println("Number is perfect");
		} else {
			System.out.println("number is not perfect");
		}

	}

}