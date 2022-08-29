package i_o_Package;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Buffered_Reader { //buffered reader accepts char array

	public static void main(String[] args)throws Exception {
		 URL url=new URL("http://google.com/index.html");
		 
		 URLConnection urlcon=url.openConnection();
		 
		 BufferedReader bis=new BufferedReader(new InputStreamReader(urlcon.getInputStream() ));
		 
		 FileWriter fos=new  FileWriter("google.html");
		 
		 int c=0;
		 char b[]=new char[8];
		 while((c=bis.read(b))!=-1) {
		 String str=new String();
		 System.out.println(str);
		 fos.write(b,0,c);
	}
		 fos.close();
}
}