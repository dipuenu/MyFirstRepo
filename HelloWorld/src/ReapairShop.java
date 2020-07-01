
public class ReapairShop {
	public static void repairCar(Car x) {
		System.out.println(" Car is repaired");
	}
	public static void main(String[] args) {
		
		Wagonr wagonr=new Wagonr();
		Audi audi=new Audi();
		repairCar(wagonr);
		repairCar(audi);
		wagonr.accelerate();
		audi.breaking();

	}

}
