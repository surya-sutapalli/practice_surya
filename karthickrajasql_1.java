package com.raja.maven.jdbc;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Jdbctest {
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433","sa","gokulraja1");
		Statement s = c.createStatement();
		//s.execute("create database Bank");
		//s.execute("create table ban(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		
		Scanner sc=new Scanner(System.in);
		int accbalance=0;
		for(int i=0;i<=10;i++)
		{	
		System.out.println("enter accid:");
		int id=sc.nextInt();
		System.out.println("enter the accname:");
		String name=sc.next();
		System.out.println("enter the accbank:");
		String name1=sc.next();
		System.out.println("enter the accbalance:");
		if(accbalance<=0)
		{
			System.out.println("invalid balance");
			continue;
		}
		int id1=sc.nextInt();
		System.out.println("enter the accbranchcity:");
		String name2=sc.next();
		s.execute("insert into ban values('"+id+"','"+name+"','"+name1+"','"+id1+"','"+name2+"')");
		
		}
		
		s.close();
		c.close();
	}
}