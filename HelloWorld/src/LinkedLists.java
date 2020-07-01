import java.util.*;
public class LinkedLists {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<>();
		ll.add(12);
		ll.add(18);
		ll.add(5);
		System.out.println(ll);
		
		ll.remove(1);
		System.out.println(ll);
		System.out.println(ll.isEmpty());
		
	}

}
