package advancelabook3;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionDemo2 {

	public static void main(String[] args) throws Exception{
		System.out.println("Before Exception..");
		
		try {
			URL url=new URL("www.aaa.com");
			
			System.out.println(url.getContent());
		}catch(MalformedURLException e) {
			System.out.println(e);
		}catch(Exception eee) {
			eee.printStackTrace();
		}finally{
			System.out.println("This will always get executed irrespectve of whether an exception arises or not or handled or not");
		}
		System.out.println("after exception");
	}
}
