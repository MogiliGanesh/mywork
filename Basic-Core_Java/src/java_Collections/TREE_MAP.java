package java_Collections;

import java.util.Map;
import java.util.TreeMap;

class Friends{
	int srNo, phNo;
	String name; 
	public Friends(int srNo, String name, int phNo) {
		this.srNo=srNo;
		this.name=name;
		this.phNo=phNo;
	}
}
class TREE_MAP {

	public static void main(String[] args) {

		Map<Integer, Friends> map=  new TreeMap();
		Friends f1=new Friends(1,"Ganesh",100);
		Friends f2=new Friends(2,"suresh",200);
		Friends f3=new Friends(3,"mahesh",300);
		map.put(1, f1);
		map.put(2, f2);
		map.put(3, f3);
		// map.putIfAbsent(null,f2);   *** TreeMaps does not allow null keys
		for(Map.Entry<Integer, Friends> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Friends f=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(f.srNo+" "+f.name+" "+f.phNo);   
	    }    
	}

}
