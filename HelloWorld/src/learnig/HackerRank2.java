package learnig;

public class HackerRank2 {

	public static void main(String[] args) {

		int n = 5;
		int d = 4;
		int[] a = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < d; i++) {
			int temp = a[i];
			int j = d;
			a[i] = a[j];
			for (int z = d; z < n-1; z++) {
				a[z] = a[z + 1];
			}
			a[n - 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
