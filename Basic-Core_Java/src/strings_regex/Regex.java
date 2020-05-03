package strings_regex;

public class Regex {

	public static void main(String[] args) {
		String s = "ganesh123";
		String s1 = s.replaceAll("[^a-z]", "");
		System.out.println(s1);
	}

}
