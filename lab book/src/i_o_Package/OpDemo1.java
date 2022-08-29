package i_o_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OpDemo1 { //real life copy command  not appened because we doesn't use true here

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis=new FileInputStream("bbbb.txt");
		FileOutputStream fos=new FileOutputStream("cccc.txt");
		
		try(
				fis;fos)
		{
		int c=0;
		byte b[]=new byte[8];
		while((c=fis.read(b))!=-1) {
			fos.write(b,0,c);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		 

	}

}
