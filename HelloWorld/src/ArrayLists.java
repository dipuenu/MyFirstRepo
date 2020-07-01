import java.util.ArrayList;
public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList fruits=new ArrayList();
		fruits.add("apple");
		fruits.add(23);
		
		fruits.add(45);
		fruits.add(6);
		System.out.println(fruits);
		System.out.println(fruits.remove(0));
		fruits.add("abhi");
		fruits.add(13);
		System.out.println(fruits);
		
		ArrayList aa=new ArrayList();
		aa.add(12);
		aa.add(5);
		aa.add(78);
		fruits.addAll(aa);

		System.out.println(fruits);
		System.out.println(aa.get(2));
		aa.set(2,23);
		System.out.println(aa);
	    System.out.println(aa.remove(2));
	   fruits.removeAll(aa);
	   
	  
	    fruits.remove(3);
	   System.out.println(fruits);
	   int x[]=new int[fruits.size()];
	   fruits.toArray(); 
	   for(int y:x) {
		   System.out.println(y);
		   
	   }
	   
	}
	
	
	

}
