package com.sandeep.jdbc;
import java.io.*;
import java.sql.*;
import java.util.*;

public class SandeepSQL_2 {
		public static void main(String[] args)throws SQLException,IOException,ClassNotFoundException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT","root","sandeep");
			Statement s=c.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("please select an option:");
			System.out.println("1.search by bank");
			System.out.println("2.search by city");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter bank:");
				String bank=sc.next();
				ResultSet rs1=s.executeQuery("select * from bank where accbank='"+bank+"' ");
				while(rs1.next()) {
					System.out.println(rs1.getInt(1)+"--"+rs1.getString(2)+"--"+rs1.getString(3)+"--"+rs1.getInt(4)+"--"+rs1.getString(5));
				}
				break;
			case 2:
				System.out.println("enter city:");
				String city=sc.next();
				ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"' ");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
				}
				break;
			}			
			s.close();
			c.close();		
	}
}
