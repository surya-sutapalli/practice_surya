package com.sampnew.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
public class GauravSQL_1 
{
	public static void main(String[] args) throws SQLException,IOException, ClassNotFoundException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","gaurav");
		Statement s =c.createStatement();
		//s.execute("create database test1");
	    //s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(15))");
		for(int i=0;i<1;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter accId : ");
			int id = sc.nextInt();
			System.out.println("Enter accName : ");
			String name = sc.next();
			System.out.println("Enter accbank : ");
			String bank = sc.next();
			if(!(bank.toLowerCase().equalsIgnoreCase("hdfc")|| bank.toLowerCase().equalsIgnoreCase("axis") ||bank.toLowerCase().equalsIgnoreCase("icici")))
			{
				System.out.println("Invalid Bank");
				continue ;
			}
			System.out.println("Enter accbalance : ");
			int balance = sc.nextInt();
			if(balance<=0)
			{
				System.out.println("Invalid Balance");
				continue;
			}
			System.out.println("Enter bank city : ");
			String city = sc.next();
			s.execute("insert into Test values("+id+",'"+name+"','"+bank+"',"+balance+",'"+city+"')");
			ResultSet rs =s.executeQuery("select * from test");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "--" +rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
			}
			//}
			s.close();
			c.close();
		}
	}
}