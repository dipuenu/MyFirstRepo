package learnig;

import java.util.Scanner;

public class Hacker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);

		}

		for (int i = 0; i < s.length(); i++) {
			System.out.println(arr[i]);
		}
	}
}