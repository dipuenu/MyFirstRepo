package learnig;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int row = sc.nextInt();
		int coloum = sc.nextInt();
		int a[][] = new int[row][coloum];
		int b[][] = new int[row][coloum];

		System.out.println("Enter element of 1st matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter element of 2nd matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[row][coloum];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
