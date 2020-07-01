package learnig;

import java.util.Scanner;

public class Abhi1 {

	public static void main(String[] args) {

		/*
		 * Scanner sc=new Scanner(System.in); int a=sc.nextInt(); int b=sc.nextInt();
		 */

		int a = 9;
		int b = 16;
		System.out.println("Values of a and b " + a + " " + b);
		// write your logic here
		b=b-a;
		a=a+b;
		b=a-b;
		System.out.println("Values are swaped a and b " + a + " " + b);
	}

}
