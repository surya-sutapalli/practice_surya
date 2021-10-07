package com.priyanshu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PriyanshuSQL_1 {
	public void validations(Statement s1) throws SQLException {
		
		for(int i = 0; i<10; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Account Id "+(i+1)+": ");
			int id = sc.nextInt();
			System.out.println("Enter Account Name "+(i+1)+": ");
			String acname = sc.next();
			System.out.println("Enter Account Bank "+(i+1)+": ");
			String bankname = sc.next();
			System.out.println("Enter Account Balance "+(i+1)+": ");
			int balance = sc.nextInt();
			System.out.println("Enter Account branch city "+(i+1)+" : ");
			String branch = sc.next();
			if((bankname.equalsIgnoreCase("hdfc") || bankname.equalsIgnoreCase("axis") || bankname.equalsIgnoreCase("icici"))&& (balance>0) )
			{		
				s1.execute("insert into accounts values("+id+",'"+acname+"','"+bankname+"',"+balance+",'"+branch+"')");
			}
			else if(!(bankname.equalsIgnoreCase("hdfc") || bankname.equalsIgnoreCase("axis") || bankname.equalsIgnoreCase("icici")))
			{
				System.out.println("Bank should be hdfc/icici/axis");		
				i-=1;
				continue;
				
			}
			else if((balance < 0))
			{
				System.out.println("Balance is negative");
				i-=1;
				continue;
			}
			
	    }	
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
				//register database driver
				Class.forName("com.mysql.jdbc.Driver"); 
				//establish a database connection
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","root" );
				//create a statement
				Statement s = c.createStatement();
//				s.execute("create database bank");
//				s.execute("create table accounts(accid int, accname varchar(20), accbank varchar(20), accbalance int , branchcity varchar(20))");
				PriyanshuSQL_1 obj = new PriyanshuSQL_1();
				obj.validations(s);
				s.close();
				c.close();

	}

}
