package learnig;

import java.util.Scanner;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		char arr[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {

			arr[i] = s.charAt(i);
		}
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {

			char x = arr[i];
			arr[i] = arr[j];
			arr[j] = x;
			i++;
			j--;
		}
		System.out.println(arr);
	}

}
