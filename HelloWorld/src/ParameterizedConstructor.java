
public class ParameterizedConstructor {

	public static void main(String[] args) {

		vechiles v1 = new vechiles(4);
		vechiles v2 = new vechiles(6);
		vechiles v3 = new vechiles(4, 6, "red");
		System.out.println(v1.wheels);
		System.out.println(v2.wheels);
		System.out.println(v3.color + " " + v3.wheels + " " + v3.headlight);
	}

}

class vechiles {
	int wheels;
	int headlight;
	String color;

	vechiles(int Wheels) {
		this.wheels = Wheels;
		headlight = 4;

	}

	vechiles(int wheels, int headlight, String color) {
		this.wheels = wheels;
		this.headlight = headlight;
		this.color = color;
	}
}
