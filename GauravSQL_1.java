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
		for(int i=0;i<10;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accId : ");
		int id = sc.nextInt();
		System.out.println("Enter accName : ");
		String name = sc.next();
		System.out.println("Enter accbank : ");
		String bank = sc.next();
		System.out.println("Enter accbalance : ");
		int balance = sc.nextInt();
		System.out.println("Enter bank city : ");
		String city = sc.next();
		s.execute("insert into Test values("+id+",'"+name+"','"+bank+"',"+balance+",'"+city+"')");
		}
		s.close();
		c.close();
	}
}