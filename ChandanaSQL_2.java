package com.chandana.jdbc;

import java.sql.*;
import java.util.*;


public class ChandanaSQL_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer_bank","root","nttdata");
		Statement s=c.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("pleace select an option");
		System.out.println("1.City");
		System.out.println("2.Bank");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter city");
			String city=sc.next();
			ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"'"); // storing the select od query in resultset
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getInt(4)+"-----"+rs.getString(5)); //diplaying the result with getstring and getint method
			
			}
			break;
		case 2:
	        
			System.out.println("enter bank");
			String bank=sc.next();
			ResultSet rs1=s.executeQuery("select * from bank where accbank='"+bank+"'");
			while(rs1.next()) {
			System.out.println(rs1.getInt(1)+"----"+rs1.getString(2)+"----"+rs1.getString(3)+"----"+rs1.getInt(4)+"-----"+rs1.getString(5));
			
			}
			break;
		}
		s.close();
		c.close();
		
		
		
		
	}
}