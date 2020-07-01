package learnig;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Example1 {
	
	static String timeConversion(String s) {
		
		String[] arr = s.split(":");
		int x;
		boolean y;
		if (s.contains("12:00:00AM")) {

			arr[0] = "00";
		}
		if (s.contains("12:00:00PM")) {
			arr[0] = "12";
		}
		if (s.contains("PM")) {
			x = Integer.parseInt(arr[0]) + 12;
			arr[0] = Integer.toString(x);
		}
		s="";
		for (int i = 0; i < 2; i++) {
			s.concat("arr[i]:");
		}
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in 12 Hour format:");
		String s = sc.nextLine();
		String[] arr = s.split(":");
		// String[] arr = new String[s.length()];
timeConversion(s);
		System.out.println(s);
		

	}

}
