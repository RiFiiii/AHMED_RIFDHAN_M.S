package i_o_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoDemo5 {

	public static void main(String[] args)throws Exception {
		 FileInputStream fis=new FileInputStream("bbbb.txt");
		 FileOutputStream fos=new FileOutputStream("cccc.txt");
		 try(
				 fis;fos
				 ){
			 int c=0; 
			 System.out.println("the size of the file is...:"+fis.available());
			 byte b[]=new byte[8];  //1 cluster =8
			 while((c=fis.read(b))!=-1) {
				 System.out.println("the number of character..:"+c);
				 String str=new String(b);
				 System.out.println(str);
			 }
				
			 }
		 }
	} 
