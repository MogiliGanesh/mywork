package strings;

public class String_Split {

	public static void main(String[] args) {
		String s1="java string split method";  
		String[] words=s1.split("\\s");  // split base on space
		for(String w:words){  
		System.out.println(w);  
	}
	}
}

