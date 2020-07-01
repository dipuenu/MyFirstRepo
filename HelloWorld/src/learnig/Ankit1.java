package learnig;

import java.util.*;

public class Ankit1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two string:");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		char[] a = new char[s1.length()];
		char[] b = new char[s2.length()];
		for (int i = 0; i < s1.length(); i++) {

			a[i] = s1.charAt(i);
		}
		for (int i = 0; i < s2.length(); i++) {

			b[i] = s2.charAt(i);
		}

		Arrays.sort(a);
		Arrays.sort(b);
		boolean isAnagram = true;
		for (int i = 0; i < b.length; i++) {

			if (a.length != b.length) {
				isAnagram = false;
				break;
			} else {
				if (a[i] != b[i]) {
					isAnagram = false;
					break;
				} else {
					isAnagram = true;
				}
			}

		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}

	}

}