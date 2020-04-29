package java_Collections;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList al = new java.util.LinkedList();

		al.add("Ganesh");
		al.add("Mahesh");
		al.add("Suresh");
		al.add("Ganesh");
		al.add(null);
		al.add(null);
		al.add(null);
		al.addFirst(null);
		al.addLast(null);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" ");
		}

	}

}
