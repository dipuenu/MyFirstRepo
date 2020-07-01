package learnig;

import java.util.Scanner;

public class Ankit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {

				for (int j = 1; j <= 13; j++) {
					if (j < i) {
						System.out.print(n + " ");
						n--;
					}
					if (j >= i && j <= 14 - i) {
						System.out.print(n + " ");

					}
					if (j > 14 - i) {
						n++;
						System.out.print(n + " ");

					}
				}
				System.out.println();

			} else {

				for (int j = 1; j <= 13; j++) {

					if (j < 14 - i) {
						System.out.print(n + " ");
						n--;
					}
					if (j >= 14 - i && j <= i) {

						System.out.print(n + " ");

					}
					if (j > i) {
						n++;
						System.out.print(n + " ");
					}

				}
				System.out.println();

			}
		}

	}

}
