import java.util.ArrayList;
public class Pair<X,Y> {
	
	X x;
	Y y;
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
		
		
	}public void getDiscription() {
		System.out.println(x+" and "+y);
	}
	
	
	public static void main(String[] args) {
		Pair<String,Integer> p1=new Pair("bhhfg",2);
		p1.getDiscription();
		

	}

}