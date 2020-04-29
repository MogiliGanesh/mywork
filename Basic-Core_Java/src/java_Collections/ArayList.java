package java_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Ganesh");
		list.add(1, "Naresh");
		System.out.println(list.contains("Ganesh"));
		System.out.println(list.get(1));
		list.indexOf(1);
		list.set(1, "suresh");

		System.out.println("****************");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list.removeAll(list);

		Iterator itr1 = list.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
