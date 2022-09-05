package Servlet;

import java.net.URL;
import java.net.URLConnection;

public class ConnectToServlet {

	public static void main(String[] args)throws Exception{
		
		URL url=new URL("http://localhost:2612/gtweb3online/HelloServlet1");
		 
		//("protocol://localhost:portnum/foldername/servletName");
		
		URLConnection urlcon=url.openConnection();
		
		urlcon.getInputStream();

	}

}
