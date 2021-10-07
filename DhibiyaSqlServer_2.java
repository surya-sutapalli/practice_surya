package com.madhan.mysqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DhibiyaSqlServer_2 {
	
	public void insert(Statement s) throws SQLException
	{
		s.execute("insert into details values(1,'dhibiya','hdfc',1000,'salem')");
		s.execute("insert into details values(3,'madhan','icici',12000,'coimbatore')");
		s.execute("insert into details values(4,'selvi','hdfc',5000,'palani')");
		s.execute("insert into details values(5,'palanisamy','axis',3400,'tirupur')");
		s.execute("insert into details values(6,'sudha','icici',500,'madurai')");
		s.execute("insert into details values(7,'suganya','hdfc',9087,'salem')");
		s.execute("insert into details values(8,'rithika','axis',3456,'palani')");
		s.execute("insert into details values(9,'lavaya','hdfc',8760,'tirchy')");
		s.execute("insert into details values(10,'surya','icici',12340,'dharapuram')");
		s.execute("insert into details values(11,'nandhini','axis',1400,'karur')");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=745rGE5","sa","welcome");
		Statement s = c.createStatement();
		//s.execute("create database Bank");
		//s.execute("create table details(accid int, accname varchar(20), accbank varchar(20),accbalance varchar(20),accbranchcity varchar(20))");
		DhibiyaSqlServer_2 o = new DhibiyaSqlServer_2();
		//o.insert(s);
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the accbranchcity : ");
			String city = sc.next();
			System.out.println("enter the accbank : ");
			String bank = sc.next();
			System.out.println("Do you want to continue by 1 0r 2: ");
			int n = sc.nextInt();
			if(n==1)
			{
				ResultSet rs = s.executeQuery("select * from details where accbranchcity ='"+city+"'");
				while(rs.next())
				{
				System.out.println(rs.getInt(1)+ "-----" +rs.getString(2)+ "----" +rs.getString(3)+ "-----" + rs.getInt(4)+"----"+rs.getString(5));
				}
			}
			else if(n==2)
			{
				ResultSet rs = s.executeQuery("select * from details where accbank ='"+bank+"'");
				while(rs.next())
				{
				System.out.println(rs.getInt(1)+ "-----" +rs.getString(2)+ "----" +rs.getString(3)+ "-----" + rs.getInt(4)+"----"+rs.getString(5));
				}
			}
			s.close();
			c.close();
		
	}

}
