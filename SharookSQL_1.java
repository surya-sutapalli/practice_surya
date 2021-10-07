package com.sharook.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SharookSQL_1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "@Sharook786");
		Statement s = c.createStatement();
		//s.execute("create table bank(accid int, accname varchar(20), accbank varchar(20), accbalance int, accbranchcity varchar(20)");
		int i =0;
		Scanner sc = new Scanner(System.in);
		while(i<10)
		{
			System.out.println("Enter the acc id: ");
			int accid = sc.nextInt();
			System.out.println("Enter the accname: ");
			String accname = sc.next();
			System.out.println("Enter the bank name: ");
			String accbank = sc.next();
			System.out.println("Enter the accbalance: ");
			int accbalance = sc.nextInt();
			System.out.println("Enter the branchcity: ");
			String accbranchcity = sc.next();
			s.execute("insert into bank values("+accid+",'"+accname+"','"+accbank+"',"+accbalance+",'"+accbranchcity+"')");	
		}
		s.close();
		c.close();
	}}
