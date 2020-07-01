import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		
		Stack<Integer> s=new Stack();
		s.push(8);
		s.push(5);
		s.push(2);
		s.push(6);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
	}

}
