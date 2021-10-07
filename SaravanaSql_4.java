package com.saravana.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SaravanaSql_4 {
	//update and display the records
	 public void compute()throws SQLException,IOException,ClassNotFoundException
	 {
		 Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","Saravana");
			Statement s=c.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter account id of the bank");
			int accid=sc.nextInt();
			ResultSet rs = s.executeQuery("select * from bank where accid="+accid+"");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"|||"+rs.getString(2)+"|||"+rs.getString(3)+"|||"+rs.getInt(4)+"|||"+rs.getString(5));
				
			}
			System.out.println("enter withdrawal amount");
			int amt = sc.nextInt();
			s.execute("update bank set accbalance=accbalance-'"+amt+"' where accid="+accid+"");
			System.out.println("Records updated successfully");
			ResultSet rc = s.executeQuery("select * from bank where accid="+accid+"");
			System.out.println("Updated Records");
			while(rc.next())
			{
				System.out.println(rc.getInt(1)+"|||"+rc.getString(2)+"|||"+rc.getString(3)+"|||"+rc.getInt(4)+"|||"+rc.getString(5));
				
			}
			rc.close();
			rs.close();
			s.close();
			c.close();
	 }

	public static void main(String[] args) throws SQLException,IOException,ClassNotFoundException {
		SaravanaSql_4 obj = new SaravanaSql_4(); //creating instance
		obj.compute(); //calling the method
	}

}
