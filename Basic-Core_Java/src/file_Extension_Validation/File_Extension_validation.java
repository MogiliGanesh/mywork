package file_Extension_Validation;

import java.io.File;

public class File_Extension_validation {

	public static void main(String[] args) {
		File file = new File("D:\\");
		File[] fileLList = file.listFiles();
		for (File f : fileLList) {
			String fileName = f.getName().toUpperCase();
			  if(fileName.endsWith(".PDF")) 
				  System.out.println("photo file");
				  
			  
		}
	}

}
