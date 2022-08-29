package i_o_Package;

import java.io.FileInputStream;

public class IODemo1 {

	public static void main(String[] args) throws Exception {
		 FileInputStream fis=null;
		 try {
		 fis=new FileInputStream("bbbb.txt");
		 }catch(Exception e) {
		 }finally {
			 try {
			 fis.close();
			 }catch (Exception ee) {
			ee.printStackTrace();
		}

	}
	}
}
