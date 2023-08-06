package advancelabook3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoDemo1 {
public static void main(String[] args) throws Exception{
	FileInputStream fis=new FileInputStream("abc.txt");
	FileOutputStream fos=new FileOutputStream("copy.txt"); //("copy.txt",true)
	try (fis;fos){
		
//	System.out.println((char)fis.read());
//	System.out.println((char)fis.read());
//	System.out.println((char)fis.read());
//	System.out.println((char)fis.read());
//	System.out.println((char)fis.read());
//	System.out.println((char)fis.read()); // End of the File always represent n-1
//	System.out.println((char)fis.read());

		// Instead of reading previous one
		
		int c=0;
		byte b[]=new byte[8];//[fis.available()];
		while((c=fis.read(b))!=-1) {
			System.out.println(c);
			String str=new String(b ,0,c);
			System.out.println(str);
			
//			  fos.write(b,0,c); 
		}
		
	
}catch (Exception e) {
	e.printStackTrace();
}
}
}