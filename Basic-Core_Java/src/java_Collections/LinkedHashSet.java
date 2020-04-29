package java_Collections;

import java.util.Iterator;


public class LinkedHashSet {

	public static void main(String[] args) {
		java.util.LinkedHashSet<String> set=new java.util.LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}
