package i_o_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OpDemo2_UsingTrue {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("bbbb.txt");
		FileOutputStream fos=new FileOutputStream("cccc.txt",true);
		
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
