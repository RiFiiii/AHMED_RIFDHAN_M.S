package i_o_Package;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Iopackage_buffer_using_File {

	public static void main(String[] args) throws Exception{
		URL url=new URL("http://google.com/index.html");
		
		URLConnection urlcon=url.openConnection();
		
		BufferedInputStream bis=new BufferedInputStream(urlcon.getInputStream());
		
		FileOutputStream fos=new FileOutputStream("google.html");
		
		int c=0;
		byte b[]=new byte[8];
		while((c=bis.read(b))!=-1);
		String str=new String();
		System.out.println(str);
	}
}
