package java_Collections;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		
	/**	Points to remember
		Java HashMap class contains values based on the key.
		Java HashMap class contains only unique keys.
		Java HashMap class may have one null key and multiple null values.
		Java HashMap class is non synchronized.
		Java HashMap class maintains no order.
	*/	
		Map<Integer, String> map = new HashMap();
		map.put(100, "Ganesh");
		map.put(101, "Mahesh");
		map.put(102, "Suresh");
		map.put(103, "abc");
		map.putIfAbsent(null, "xyz");
		map.putIfAbsent(104, null);

//		Set s = map.entrySet(); // Converting to Set so that we can traverse
//
//		Iterator itr = s.iterator();
//
//		while (itr.hasNext()) {
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//			
//			System.out.println("  end*****************");
//		}
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}

	}

}


class Book {  
	
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    



class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Integer,Book> map=new HashMap<Integer,Book>();    
    //Creating Books    
    Book b1=new Book(101,"Book1","a","b",8);    
    Book b2=new Book(102,"Book2","m","n",4);    
    Book b3=new Book(103," Book3","x","y",6);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);  
      
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }
}
}
