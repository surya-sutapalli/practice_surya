package com.thanish.jdbc1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ThanishSql_3 

{
	public void dis() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Thanish@31");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		//s.execute("create table account(accid int, accname varchar(20), accbank varchar(20), accbal int, accbranchcity varchar(20))");
		/*
				s.execute("insert into account values(102,'Zoya','hdfc',1000,'coimbatore')");
				s.execute("insert into account values(103,'Aayath','hdfc',20000,'banglore')");
				s.execute("insert into account values(104,'Aaliya','icici',2000,'chennai')");
				s.execute("insert into account values(105,'Ishana','axix',30000,'goa')");
				s.execute("insert into account values(106,'Rihana','icici',70000,'chennai')");
				s.execute("insert into account values(107,'Suhail','hdfc',5000,'coimbatore')");
				s.execute("insert into account values(108,'Aadhil','axix',700,'goa')");
				s.execute("insert into account values(109,'Afsal','hdfc',8000,'hyderabad')");
				
		 */
		s.execute("insert into account values(110,'Azhar','icici',90000,'coimbatore')");
		s.execute("insert into account values(111,'Ahmed','axix',70000,'coimbatore')");

		System.out.println("Enter a id");
		int id = sc.nextInt();
		ResultSet rs = s.executeQuery("select * from account where accid='"+id+"'");
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+"--->"+rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
			System.out.println("Enter amount to be deposit");
			int amount = sc.nextInt();
			int namount = rs.getInt(4) + amount;
			System.out.println(namount);
			s.execute("update account set accbal="+namount+" where accid="+id+"");
			System.out.println("Account balance updated Successfully ");
		}
		rs.close();
		s.close();
		c.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ThanishSql_3 obj = new ThanishSql_3();
		obj.dis();			
	}
}
