package learnig;

public class Example5 {

	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		while(n>0) {
			return (n*fact(n-1));
		}
		return n;
	}
	public static void main(String[] args) {
		
		int x=5;
		int sum=fact(x);
		
		System.out.println(sum);
	}

}
