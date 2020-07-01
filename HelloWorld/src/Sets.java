import java.util.*;
public class Sets {

	public static void main(String[] args) {
		Set<Integer> g=new HashSet<>();
		Set<String> f=new LinkedHashSet<>();
		Set<Integer> s=new HashSet<>();
		Set<Integer> j=new LinkedHashSet<>();
		s.add(2);
		s.add(5);
		s.add(3);
		s.add(4);
		g.add(3);
		g.add(6);
		g.add(5);
		g.add(8);
		g.add(45);
		System.out.println(s.add(3));
		System.out.println(s);
		System.out.println(g);
		System.out.println(s.addAll(g));
		System.out.println(s);
		//s.retainAll(g);
		System.out.println(s);
		System.out.println(s.containsAll(g));
		f.add("apple");
		f.add("banana");
		f.add("kiwi");
		f.add("aurum");
		System.out.println(f);
		//f.clear();
		System.out.println(f);
		System.out.println(f.isEmpty());
		String []d=new String[f.size()];
		f.toArray(d);
		for(String x:d) {
			System.out.println(x);
		}
		
		
		
		
		
	}

}
