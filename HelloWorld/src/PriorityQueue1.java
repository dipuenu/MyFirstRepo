import java.util.*;
public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("kiwi");
		pq.add("banana");
		pq.add("apple");
		System.out.println(pq);
				System.out.println(pq.remove());
				System.out.println(pq.remove());
				System.out.println(pq.remove());
				//System.out.println(pq.remove());
				

	}

}
