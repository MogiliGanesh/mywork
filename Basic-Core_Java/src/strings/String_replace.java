package strings;

public class String_replace {

	public static void main(String[] args) {
		String s1 = " Ganesh";
		String s2 = new String(" Ganesh");
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace("Ga", "Mogili Ga"));
		System.out.println(s1.trim());

	}

}
