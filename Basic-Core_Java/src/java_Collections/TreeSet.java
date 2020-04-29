package java_Collections;

public class TreeSet {

	public static void main(String[] args) {
/**  treeSet won't allow null values  */
		
		java.util.TreeSet ts=new java.util.TreeSet();
		ts.add("Ganesh");
		ts.add("Ganee");
		ts.add("Mahesh");
	//	ts.add(null);
		ts.add("Ganesh");
		ts.add("x");
		System.out.println(ts.ceiling("a"));
		System.out.println(ts.first());
		System.out.println(ts.floor("Ganesh"));
		
	}

}
