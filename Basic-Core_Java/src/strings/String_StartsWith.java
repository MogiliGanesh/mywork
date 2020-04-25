package strings;

public class String_StartsWith {

	public static void main(String[] args) {
		String str = "GaneshM";  
        System.out.println(str.startsWith("G")); // True  
        System.out.println(str.startsWith("a")); // False  
        System.out.println(str.startsWith("a",1)); // True
	}

}
