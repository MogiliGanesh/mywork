package java_Collections;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet hs1=new java.util.HashSet();
		hs1.add("Ganesh");
		hs1.add("Mahesh");
		hs1.add("Suresh");
		hs1.add("Ganesh");
		
		hs1.add(null);
		hs1.add(null);
		
		Iterator itr = hs1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println(" ");
		}
	}

}
