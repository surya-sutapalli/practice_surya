package com.jenifer.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class JeniferSQL_3 {
	public void updateDetails() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "welcome");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id");
		int id = sc.nextInt();
		ResultSet rs = s.executeQuery("select * from bank where accid='"+id+"'");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"--->"+rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
		System.out.println("Enter amount to be deposit");
		int amount = sc.nextInt();
		int updamount = rs.getInt(4) + amount;
		System.out.println(updamount);
		s.execute("update bank set accbalance="+updamount+" where accid="+id+"");
		System.out.println(" Account balance updated Successfully ");
		}
		
		        s.close();
		        c.close();
		        rs.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	JeniferSQL_3 obj=new JeniferSQL_3();
	obj.updateDetails();
	}
}