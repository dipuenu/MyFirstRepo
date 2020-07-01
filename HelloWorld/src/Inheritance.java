
public class Inheritance {

	protected String name;

	public void walk() {
		System.out.println("person "+name + " is walking");
	}

	public void eat() {
		System.out.println(name + " is eating");
	}

	public static void main(String[] args) {

		teacher t=new teacher();
		
		t.name="Abhishek";
		t.walk();
		t.eat();
		t.teach();
		
	}
}

class teacher extends Inheritance {
	public void teach() {
		System.out.println(name + " is teaching");
	}
	public void walk() {
		super.walk();
	}
}
class singer extends Inheritance {
	public void sing() {
		System.out.println(name + " is singing");
	}
}

