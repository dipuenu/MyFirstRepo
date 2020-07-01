import learnig.Student;

public class Person implements Student,Youtube {
	public void student() {
		System.out.println("Students are studying");
	}
	public void youtube() {
		System.out.println("Youtuber making youtube vedio");
	}

	public static void main(String[] args) {
		
		Person obj=new Person();
		obj.youtube();
		obj.student();
	}

}
