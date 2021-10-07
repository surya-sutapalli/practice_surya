package com.Navaneethan.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NavaneethanSql_4 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException,IOException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "navaneethan@64");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account id");
		int accid=sc.nextInt();
		ResultSet rs = s.executeQuery("select * from bank where accid="+accid+"");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getInt(4)+"---"+rs.getString(5));
		}

		System.out.println("enter withdrawal amount");
		int amt = sc.nextInt();
		s.execute("update bank set accbalance=accbalance-'"+amt+"' where accid="+accid+"");
		System.out.println("Updated successfully");
		ResultSet rc = s.executeQuery("select * from bank where accid="+accid+"");
		while(rc.next())
		{
		System.out.println(rc.getInt(1)+"---"+rc.getString(2)+"----"+rc.getString(3)+"----"+rc.getInt(4)+"---"+rc.getString(5));

		}
		rc.close();
		rs.close();
		s.close();
		c.close();
	}
}

	