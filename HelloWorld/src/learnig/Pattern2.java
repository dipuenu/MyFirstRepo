package learnig;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {

		System.out.println("enter number of term:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
