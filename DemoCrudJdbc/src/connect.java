// Java program to illustrate
// Connecting to the Database
import java.sql.*;

public class connect
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Establishing Connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system","1234");

			if (con != null)			
				System.out.println("Connected");		
			else		
				System.out.println("Not Connected");
			
			Statement smt=con.createStatement();
			
			smt.executeUpdate("create table emp(emp_id number,First_Name varchar2(20),Last_Name varchar2(25),EMAIL varchar2(25),Age number)");
			System.out.print("Table created sucessfully....");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
