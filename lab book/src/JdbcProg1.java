import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcProg1 {

	public static void main(String[] args)throws Exception {
		/*
		 * 1.load and  register the driver note-this should be done only once.
		 * 2. establish a connection
		 * 3.prepare and execute a statement
		 * 4.process the result*/
		
		//load or register the driver
	     Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Establish a connection
		//DriverManager.getconnection(url,userid,password)//url=protocol:database/ipaddress/dbname
		Connection con=DriverManager.getConnection("Jdbc:mysql://localhost/julyfinal","root","@Rifdhan2");
		
		System.out.println("connection"+con);
		
		String sql="select * from users";
		
		Statement stmt=con.createStatement();
		
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("uid...:"+rs.getInt(1)+":uname..:"+rs.getString(2)+".:city..:"+rs.getString(3));
		}
		System.out.println("......");
		  sql="select * from users where city='chennai'";
			
		  stmt=con.createStatement();
			
		 rs= stmt.executeQuery(sql);
			
			if(rs.next()) {
				System.out.println("uid...:"+rs.getInt(1)+":uname..:"+rs.getString(2)+".:city..:"+rs.getString(3));
		}
			else {
				System.out.println("no records...");
			}
		
	}

}
