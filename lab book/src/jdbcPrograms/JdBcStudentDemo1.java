package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 

public class JdBcStudentDemo1 {
	public static void main(String[] args)throws Exception {
		
 
		/*
		 * 1.LOAD or REGISTER the Driver - note- this should be done only once.
		 * 
		 * 2.Establish a connection
		 * 
		 * 3.preapare and execute a statement
		 * 
		 * 4.process the result.*/
		
		//load or register a connection
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Establish a connection
		
		//DriverManager.getConnection("url","userid","password"); server need url and protocol  ,the protocol of jdbc is always jdbc
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","@Rifdhan2");
	
		//url("protocol:database://ip address//database name",)
		
		
		System.out.println("connection....:"+con);
		
		String sql="insert into student values(5005,'sachi','MCA','1997',4)"; 
		
		Statement stmt=con.createStatement();
		
		int no=stmt.executeUpdate(sql);
		
		System.out.println("Number of record updated.."+no);
		
	}
}
