package i_o_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResource2{

	public static void main(String[] args) throws Exception{
		 FileInputStream fis=new FileInputStream("bbbb.txt");
		 FileOutputStream fos=new FileOutputStream("cccc.txt");
		 try(
				fis;fos 
				){
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println(fis.read());
		 }catch (Exception e) {
					e.printStackTrace();
				}
	}

}
