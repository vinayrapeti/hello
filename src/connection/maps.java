package connection;
import java.util.HashMap;
import java.util.Map;

public class maps {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(2, "two");
		m.put(3,"three");
		m.put(4,"four");
		m.put(5,"five");
		System.out.println(m);
		System.out.println(m.get(3));
		System.out.println(m.containsKey(3));
		System.out.println(m.containsValue("three"));
		m.remove(2);
		System.out.println(m);
		
	}
}
