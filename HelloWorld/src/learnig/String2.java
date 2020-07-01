package learnig;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");

		String s = sc.nextLine();
		if (s.isEmpty()) {
			System.out.println("Please enter some character:");

		}
		String arr[] = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i].charAt(0) + " ");
			}

		}

	}

}
