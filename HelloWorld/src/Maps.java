import java.util.*;


public class Maps {

	public static void main(String[] args) {
		Map<Integer,String> f=new HashMap<>();
		
		f.put(1,"dipu");
		f.put(2, "ritika");
		f.put(3,"huhh");
	//	System.out.println(f);
	System.out.println(f.get(2));
		System.out.println(f);
		System.out.println(f.containsKey(6));
		System.out.println(f.values());
		System.out.println(f.remove(2));
		System.out.println(f);
		System.out.println(f.containsValue(6));;
		

	}

}
