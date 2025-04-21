package connection;

import java.util.TreeSet;

public class treesets {
public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(1);
	ts.add(23);
	ts.add(64);
	ts.add(1);
	ts.add(15);
	System.out.println(ts);
	System.out.println(ts.higher(5));
	System.out.println(ts.lower(5));
	System.out.println(ts.headSet(10,true));
	System.out.println(ts.tailSet(10));
	System.out.println(ts.subSet(5,15));
	System.out.println(ts.ceiling(12));
	System.out.println(ts.floor(6));
	System.out.println(ts.descendingSet());
	System.out.println(ts.last());
	System.out.println(ts.first());
	System.out.println(ts.size());
	
	
	
	
	
	
	
	
	

	
}
}
