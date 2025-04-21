package connection;

import java.util.Iterator;
import java.util.ArrayList;

public class LIT {
public static void main(String[] args) {
	ArrayList<Integer> li = new ArrayList<Integer>();
	li.add(23);
	li.add(21);
	li.add(43);
	li.add(65);
	li.add(72);
	li.add(10);
	li.add(32);
	li.add(46);
	li.add(15);
	ArrayList<String> li1 = new ArrayList<>();
	li1  .add("fifty seven");
	li1.add("tweleve");
	li1.add("seventy two");
	li1.add("sixty");
	li1.add("sixty two");
	li1.add("fifty one");
	System.out.println(li);
	Iterator<Integer> i = li.iterator();
	while(i.hasNext()) {
		Integer i1 = i.next();
		System.out.println(i1);
		if(i1==46) {
			System.out.println("Removing an element 46");
			i.remove();
		}
	}
	System.out.println(li);
	
	Iterator<String> s= li1.iterator();
	while(s.hasNext()) {
		String s1 = s.next();
		if(s1.equals(" sixty")) {
		System.out.println("removing sixty");
	}
	}
}
}
