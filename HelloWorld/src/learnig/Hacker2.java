package learnig;

public class Hacker2 {
	
	private double marks;
	private double rollNo;
	
	public Hacker2(double marks, double rollNo)
	{
		this.marks=marks;
		this.rollNo=rollNo;
		System.out.println("1st");
	}
	public Hacker2(int marks, int rollNo)
	{
		this.marks=marks;
		this.rollNo=rollNo;
		System.out.println("2nd");
	}
	
	public void fyi(int a)
	{
		System.out.println("int wala"+a);
	}
	
	public void fyi(double a)
	{
		System.out.println("double wala"+a);
	}
	
	

	public double getMarks() {
		return marks;
	}



	public void setMarks(double marks) {
		this.marks = marks;
	}



	public double getRollNo() {
		return rollNo;
	}



	public void setRollNo(double rollNo) {
		this.rollNo = rollNo;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hacker2 hacker2 = new Hacker2(30.25, 5);
		System.out.println(hacker2.marks);
		System.out.println(hacker2.rollNo);
		hacker2.marks=45.0;
		//hacker2.setMarks(45);
		System.out.println(hacker2.marks);

	}

}
