
public class NonParameterizedConstructor {

	public static void main(String[] args) {

		vechile v1 = new vechile();
		System.out.println(v1.wheels);
	}

}

class vechile {
	int wheels;

	vechile() {
		wheels = 8;
	}

}