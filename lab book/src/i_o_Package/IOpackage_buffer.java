package i_o_Package;

import java.io.BufferedInputStream;
import java.net.URL;
import java.net.URLConnection;

public class IOpackage_buffer {

	public static void main(String[] args) throws Exception {
		 URL url=new URL("http://google.com/index.html");
		 
		 URLConnection urlcon=url.openConnection();
		 
		 BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
		 
		 int c=0;
		 byte b[]=new byte[8];
		 while((c=bis.read(b))!=-1);
		  String str=new String(b,0,c);
		  System.out.println(str);

	}

}
