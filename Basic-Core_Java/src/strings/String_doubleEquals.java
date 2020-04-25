package strings;

public class String_doubleEquals {

	public static void main(String[] args) {
		String s1 = "Ganesh";
		String s2 = new String("Ganesh");
		System.out.println(s1 == s2);// true (because both refer to same instance) 
	}

}
