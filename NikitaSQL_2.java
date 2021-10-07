import java.sql.*;
import java.util.Scanner;
import java.io.*;


public class NikitaSQL_2 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "Nikita@99");
		Statement s =c.createStatement();
		s.execute("create table bank3(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		s.execute("insert into bank3 values(101,'nikita','hdfc','200','agra')");
		s.execute("insert into bank3 values(102,'neha','icici','800','mathura')");
		s.execute("insert into bank3 values(103,'geeta','hdfc','600','goa')");
		s.execute("insert into bank3 values(104,'sharad','axis','400','agra')");
		s.execute("insert into bank3 values(105,'pulkit','hdfc','900','mumbai')");
		s.execute("insert into bank3 values(106,'nitin','axis','100','agra')");
		s.execute("insert into bank3 values(107,'shivani','hdfc','700','mathura')");
		s.execute("insert into bank3 values(108,'daya','icici','400','chennai')");
		s.execute("insert into bank3 values(109,'gopal','hdfc','900','shimla')");
		s.execute("insert into bank3 values(110,'happy','axis','300','bangalore')");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accbranchcity");
		String name = sc.next();
		
		
		ResultSet rs=s.executeQuery("select * from bank3 where accbranchcity='"+name+"'");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"---"+rs.getString(2));
		}
		String bank3 = sc.next();
		System.out.println("Enter bank name");
		ResultSet rs1=s.executeQuery("select * from bank3 where accbank='"+bank3+"'");
		while(rs1.next())
		{
			System.out.println(rs1.getInt(1)+"---"+rs1.getString(2));
		}
		
		rs.close();
		rs1.close();

		s.close();
		c.close();
				
		

	}

}
