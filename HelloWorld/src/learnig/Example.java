package learnig;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Example {
	static void bigSorting(int[] unsorted) {
		for (int i = 0; i < unsorted.length - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < unsorted.length; j++) {
				if (unsorted[j] < unsorted[min_index]) {
					min_index = j;
				}
			}
			int temp = unsorted[min_index];
			unsorted[min_index] = unsorted[i];
			unsorted[i] = temp;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element of array:");
		int n = sc.nextInt();
		System.out.println("Enter elements of array:");
		int[] unsorted = new int[n];
		for (int i = 0; i < n; i++) {
			unsorted[i] = sc.nextInt();
		}
		bigSorting(unsorted);
		for (int i = 0; i < n; i++) {
			System.out.println(unsorted[i]);
		}
	}

}
