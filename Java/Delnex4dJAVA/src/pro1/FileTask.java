package pro1;

import java.io.FileReader;
import java.io.FileWriter;

public class FileTask {

	public static void main(String[] args)throws Exception {
		FileReader reader = new FileReader("data.txt");
		FileWriter writer = new FileWriter("newdata.txt");
		
		/*
		 * String p=""; int i; while ((i=reader.read()) != -1) { if((char)i==',') {
		 * p=p+"\t"; } else { p=p+(char)i; } }
		 */
		int i;
		while ((i=reader.read()) != -1) {
			
		}
	}
	

}
