package inheritance;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class IoDemo3 {

	public static void main(String[] args)throws Exception{

		FileInputStream fis=new FileInputStream("aaaa");
		FileOutputStream fos=new FileOutputStream("c0py.txt");
		try(
			fis;fos
	){
		int c=0;
		byte b[]=new byte[8];
		 while((c=fis.read(b))!=-1) {
			 fos.write(b,0,c);
		 }
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
