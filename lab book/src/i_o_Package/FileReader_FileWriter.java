package i_o_Package;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_FileWriter { //character stream

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("bbbb.txt");
		FileWriter fw=new FileWriter("cccc.txt");
		
		try(
				fr;fw
				){
			int c=0;
			char b[]= new char[8];  //this method doesnt read byte it only read character
			  while((c=fr.read(b))!=-1) {
				  fw.write(b,0,c);
			  }
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
