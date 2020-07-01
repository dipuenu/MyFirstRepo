package learnig;

import java.util.Scanner;

public class HackerRank {

	static int[] matchingStrings(String[] strings, String[] queries) {
		int arr[] = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int sum = 0;
			for (int j = 0; j < strings.length; j++) {
				if (strings[j].equals(queries[i])) {
					sum = sum + 1;
				}
			}
			arr[i] = sum;

		}
		return arr;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element of 1st string");
		int n = sc.nextInt();
		sc.nextLine();
		String[] strings = new String[n];

		for (int i = 0; i < n; i++) {
			strings[i] = sc.nextLine();
		}
		System.out.println("Enter element of 2nd string");
		int a = sc.nextInt();
		sc.nextLine();
		String[] queries = new String[a];
		for (int i = 0; i < a; i++) {
			queries[i] = sc.nextLine();
		}

		int[] z = matchingStrings(strings, queries);
		for (int i = 0; i < queries.length; i++) {
			System.out.print(z[i] + " ");

		}

	}
}