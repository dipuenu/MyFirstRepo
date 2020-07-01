package learnig;

import java.util.Scanner;

public class Abhi2 {
	
	public long fun(int x){
		if(x>1)
			return x*fun(x-1);
		else
			return 1;
	  }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Abhi2 abhi2 = new Abhi2();
		long factorial = abhi2.fun(n);
		System.out.println(factorial);

	}

}
