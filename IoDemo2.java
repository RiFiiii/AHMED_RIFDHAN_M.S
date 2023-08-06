package advancelabook3;

import java.io.FileReader;
import java.io.FileWriter;

public class IoDemo2 {
public static void main(String[] args)throws Exception {
	
	FileReader fr=new FileReader("abc.txt");
	FileWriter fw=new FileWriter("copy2.txt");
	
	// FIle Write must we need to close if we not close commit is not work
	try(fr;fw){
		
		int c=0;
		char b[]=new char[8];
		while((c=fr.read(b))!=-1) {
			System.out.println(c);
			String str=new String(b,0,c);
			System.out.println(str);
		}
	}
}
}
