package utilpackage;

import java.util.Enumeration;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.put("a1", "Welcome");
		prop.put("a2", "hai");
		prop.put("a3", "bye");
		prop.put("a4", "hello");
		
		System.out.println(prop);
		
		Enumeration en=prop.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
