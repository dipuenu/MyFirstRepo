package learnig;

public class Ritika {

	public static void main(String[] args) {

		Fun fun1 = new Fun();
		fun1.leg = 2;
		fun1.eyes = 2;
		fun1.hand = 2;
		fun1.ear = 2;
		fun1.cute = true;
		fun1.color = "Pure Black";
		fun1.kundali();
	}

}

class Fun {
	 int leg, eyes, hand, ear;
	boolean cute; 
	String color;
	public void kundali() {
		System.out.println(" Ritika has " + leg + " legs," + eyes + " eyes," + hand + " hand and" + ear + " ear");
		System.out.println("Is Ritika is cute? " + cute);
		System.out.println(" Ritika is " + color);
	}
}