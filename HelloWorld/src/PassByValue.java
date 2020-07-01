
public class PassByValue {
	static void changeCat(cat x) {
		x.leg = 5;
	}

	public static void main(String[] args) {

		cat c1 = new cat();
		c1.leg = 4;
		changeCat(c1);
		System.out.println(c1.leg);

	}

}

class cat {
	int leg;
}
