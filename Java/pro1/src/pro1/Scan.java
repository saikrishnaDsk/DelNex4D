package pro1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner; 

public class Scan 
{ 
	public static void main(String[] args) throws Exception 
	{ 
		File file = 
				new File("C:\\Users\\admin\\Documents\\GitHub\\DelNex4D\\Java\\pro1\\src\\data.txt"); 
		Scanner sc = new Scanner(file); 
		File f1 = new File("C:\\\\Users\\\\admin\\\\Documents\\\\GitHub\\\\DelNex4D\\\\Java\\\\pro1\\\\src\\\\newdata.txt");
		FileWriter w = new FileWriter(f1);

		while (sc.hasNextLine()) {
			String a = (sc.nextLine()+"\n").replace(',','\t');
			w.write(a);
		}
		sc.close();
		w.flush();
		w.close();
	}
}