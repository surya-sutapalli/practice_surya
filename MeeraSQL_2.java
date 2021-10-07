package com.meera.sqlserver;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


class SClass {
	private static SClass sd=null;
	private SClass()
	{
		
	}
	public static SClass getIns()
	{
		if(sd==null)
		{
			sd=new SClass();
		}return sd;
	}
	public Statement getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=3R6T6M2E/Test2","sa","welcome");
		Statement s = c.createStatement();
		return s;
	}

}

public class MeeraSQL_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Statement sc=SClass.getIns().getConnection();
		//sc.execute("create database Test2");
		//sc.execute("create table test1(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		//sc.execute("insert into test values(101,'meera','hdfc',2000,'trichy')");
		/*sc.execute("insert into test values(102,'mithra','axis',5000,'karur')");
		sc.execute("insert into test values(103,'aravinth','axis',2800,'coimbatore')");
		sc.execute("insert into test values(104,'dhee','icici',9000,'pollachi')");
		sc.execute("insert into test values(105,'sree','axis',3300,'bangalore')");
		sc.execute("insert into test values(106,'ovi','hdfc',8800,'chennai')");
		sc.execute("insert into test values(107,'vaish','icici',6000,'trichy')");
		sc.execute("insert into test values(108,'banu','hdfc',7100,'karur')");
		sc.execute("insert into test values(109,'areem','axis',5400,'coimbatore')");
		sc.execute("insert into test values(110,'darsh','hdfc',9300,'pollachi')");*/
		Scanner scan=new Scanner(System.in);
		while(true)
		{
		System.out.println("For city Enter:1");
		System.out.println("For bank Enter:2");
		int num=scan.nextInt();
		
		if(num==1)
		{
			System.out.println("Enter city");
			String city=scan.next();
			ResultSet rs=sc.executeQuery("select * from test where accbranchcity='"+city+"' ");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
			}
		}
		else if(num==2)
		{
			System.out.println("Enter bank");
			String bank=scan.next();
			ResultSet rs=sc.executeQuery("select * from test where accbank='"+bank+"' ");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
			}
		}
		else
		{
			System.out.println("Please enter correct option");
		}
		System.out.println("Do you wank to continue:y/n");
		String y=scan.next();
		if(y.equalsIgnoreCase("y"))
		{
			continue;
		}else
		{
			break;
		}
		}
		
	}

}