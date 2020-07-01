package learnig;

import java.util.Scanner;

public class Ankit2 {
	public static void display(int b[][], int x, int y) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(b[i][j] + " ");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number row and coloum:");
		int row = sc.nextInt();
		int coloum = sc.nextInt();
		int a[][] = new int[row][coloum];

		System.out.println("Enter element of 1st matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloum; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		display(a, row, coloum);
		
	
	}

}
