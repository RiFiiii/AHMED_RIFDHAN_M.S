package jdbcPrograms;

import java.sql.Connection;

import java.sql.DriverManager;

public class jdbcProg2{
	public static void main(String[] args) throws Exception{
		/*
		 * load or register the driver -note - this should be done only once
		 * Establish a connection
		 * prepare and execute a statement
		 * process the result
		 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//DriverManager.getConnection(url,userid,password)//url=protocol:database://ipaddress/dbname
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","@Rifdhan2");
		
		System.out.println("connection....:"+con);
		
	}
}
