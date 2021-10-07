package com.jdbmsq.microSql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HarshithaSQL_5 {
	public static ResultSet newaccount(Connection c) throws SQLException
	{
		Statement s = c.createStatement();
		System.out.println("please enter the details of new account:");
		System.out.println("enter id:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("enter name:");
		Scanner sc1=new Scanner(System.in);
		String name=sc1.next();
		System.out.println("enter bankname:");
		Scanner sc2=new Scanner(System.in);
		String bankname=sc2.next();
		System.out.println("enter amount:");
		Scanner sc3=new Scanner(System.in);
		int amount=sc3.nextInt();
		System.out.println("enter bankcity:");
		Scanner sc4=new Scanner(System.in);
		String bankcity=sc4.next();
		
		
		s.executeUpdate("insert into bank values("+id+",'"+name+"','"+bankname+"',"+amount+",'"+bankcity+"')");
		ResultSet rs=s.executeQuery("select * from bank ");
		return rs;
	}
	public static ResultSet updateaccount(Connection c) throws SQLException
	{
		System.out.println("Enter the accid u want to update amount:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter amount to be updated:");
		Scanner sc1=new Scanner(System.in);
		int amount=sc1.nextInt();
		Statement s = c.createStatement();
		ResultSet rs1=s.executeQuery("select accbalance from bank where accid="+id+"");
		int amt=0;
		while(rs1.next())
		{
			 amt+=rs1.getInt(1);
			 amt+=amount;
		}
		s.executeUpdate("update bank set accbalance="+amt+" where accid="+id+"");
		ResultSet rs=s.executeQuery("select * from bank ");
		return rs;
	}
	public static ResultSet deleteaccount(Connection c) throws SQLException
	{
		Statement s = c.createStatement();
		System.out.println("Enter the accid u want to delete:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		s.executeUpdate("delete from bank where accid="+id+"");
		ResultSet rs=s.executeQuery("select * from bank ");
		return rs;
	}
	public static ResultSet selectaccount(Connection c) throws SQLException
	{
		Statement s = c.createStatement();
		System.out.println("Enter the accid u want to select:");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		ResultSet rs=s.executeQuery("select * from bank where accid="+id+"");
		return rs;
	}
	
	public static void display(ResultSet rs) throws SQLException
	{
		while(rs.next())
		{
			//System.out.println("inloop");
			System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
		}
		System.out.println(" ");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER01","harshitha","harshitha");
		Statement s = c.createStatement();
		//s.execute("create database bank");
		//s.executeUpdate("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		//s.executeUpdate("insert into bank values(110,'sirisha','icici','2200','delhi')");
		
		while(true)
		{
			System.out.println("please select option between 1-5");
			Scanner sc=new Scanner(System.in);
			int opt=sc.nextInt();
			if(opt==1)
			{
				ResultSet rs=HarshithaSQL_5.newaccount(c);
				HarshithaSQL_5.display(rs);
				System.out.println("new account inserted successfully");
				continue;
			}
			if(opt==2)
			{
				ResultSet rs=HarshithaSQL_5.updateaccount(c);
				HarshithaSQL_5.display(rs);
				System.out.println("account updated successfully");
				continue;
			}
			if(opt==3)
			{
				ResultSet rs=HarshithaSQL_5.deleteaccount(c);
				HarshithaSQL_5.display(rs);
				System.out.println("account deleted successfully");
				continue;
			}
			if(opt==4)
			{
				ResultSet rs=HarshithaSQL_5.selectaccount(c);
				HarshithaSQL_5.display(rs);
				System.out.println("your requested account details are being displayed");
				continue;
			}
			if(opt==5)
			{
				System.out.println("you have choosed to quit!");
				break;
			}
			
		}
	}

}
