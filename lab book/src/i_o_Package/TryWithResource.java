package i_o_Package;

import java.io.FileInputStream;

public class TryWithResource { //try with resourece intro in jdk.8

	public static void main(String[] args) throws Exception {
		 try(FileInputStream fis=new FileInputStream("bbbb.txt")){
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
