package connection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
	Queue<String> q = new LinkedList<String>();
	q.add("list");
	q.add("priority");
	q.offer("linkedlist");
	
	System.out.println(q);
	
	}
}
