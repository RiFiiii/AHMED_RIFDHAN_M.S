package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcStud2 {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/julyfinal","root","@Rifdhan2");
		
		System.out.println(con);
		
		//create a table in mysql using eclipse through jdbc
		
		String sql="create table department(Did int(6),Dname varchar(60)"; 
		
		String sql1="insert into department values(1,'B.tech IT')";
		
		String sql2="insert into department values(2,'B.tech mech')";
		
		String sql3="insert into department values(3,'B.tech arch')";
		
		String sql4="insert into department values(4,'B.tech cs')";
		
		Statement stmt=con.createStatement();
		
		int no=stmt.executeUpdate(sql);
		
		int no1=stmt.executeUpdate(sql1);
		int no2=stmt.executeUpdate(sql2);
		int no3=stmt.executeUpdate(sql3);
		int no4=stmt.executeUpdate(sql4);
		
		System.out.println("Create a table  :"+no);
		
		System.out.println("Insert values :"+no1);
		
		System.out.println("Insert values :"+no2);
		
		System.out.println("Insert values :"+no3);
		
		System.out.println("Insert values :"+no4);
		
		
		 

	}

}
