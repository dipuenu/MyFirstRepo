package learnig;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean x = true;
		if (n == 1)
			x = false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				x = false;

		}
		if (x)
			System.out.println("prime number");
		else
			System.out.println("Not prime");
	}

}
