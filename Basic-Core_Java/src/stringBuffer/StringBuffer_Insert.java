package stringBuffer;

public class StringBuffer_Insert {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Ganesh ");  
		sb.insert(0,"M ");//now original string is changed  
		System.out.println(sb);
	}

}
