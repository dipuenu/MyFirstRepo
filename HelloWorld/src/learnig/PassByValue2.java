package learnig;

public class PassByValue2 {
	public static void swap(temp x, temp y) {
		temp d = x;
		x = y;
		y = d;
		System.out.println("x and y are;" + x.leg + " " + y.leg);
	}

	public static void main(String[] args) {
		temp ob = new temp();
		ob.leg = 5;

		temp ob1 = new temp();
		ob1.leg = 7;
		swap(ob, ob1);
		System.out.println("Swapped item are:" + ob.leg + " " + ob1.leg);
	}

}

class temp {
	int leg;
}
