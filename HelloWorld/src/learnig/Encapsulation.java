package learnig;

public class Encapsulation {

	public static void main(String[] args) {

		Abhi8 abhi = new Abhi8();
		abhi.setAge(14);
		System.out.println(abhi.getAge());

		abhi.setSalary(550);
		System.out.println(abhi.getSalary());

	}

}

class Abhi8 {
	private int age;
	private int salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}