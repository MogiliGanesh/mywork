package java_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	int Sr_No, Age;
	String Name;
	Student(int Sr_No, String Name, int Age){
		this.Sr_No=Sr_No;
		this.Name=Name;
		this.Age=Age;
	}
}


class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.Age==s2.Age)  
			return 0;  
			else if(s1.Age>s2.Age)  
			return 1;  
			else  
			return -1;
	}
	
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		return s1.Name.compareTo(s2.Name);
		
	}
	
}




class Comparator_sorting {

	public static void main(String[] args) {

		
		Student s1=new Student(1, "Ganesh", 40);
		Student s2=new Student(2, "Manesh", 10);
		Student s3=new Student(3, "Suresh", 40);
		
		
		
		ArrayList list=new ArrayList();
		list.add(s1);
		list.add(s3);
		list.add(s2);
		
		Collections.sort(list,new NameComparator());
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		Student st=(Student)itr.next();
		System.out.println(st.Sr_No+"  "+st.Name+"  "+st.Age);
		}
	}
	

}
