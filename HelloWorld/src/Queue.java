import java.util.*;
public class Queue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> a=new ArrayDeque<>();
		a.offerFirst(12);
		a.addFirst(5);
		a.offer(6);
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a);	
			
			
	}

}
