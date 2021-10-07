package com.oracle.nttOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BharathSQL_5 {
	private static Connection c;
	private Statement s;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection c=  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "root");
		Statement s=c.createStatement();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.New Account");
			System.out.println("2.Update Account");
			System.out.println("3.Delete Account");
			System.out.println("4.Select Account");
			System.out.println("5.Exit");
			int x=sc.nextInt();
			switch(x) {
			case 1: newAccount(s,sc);
			break;
			case 2:updateAccount(s,sc);
			break;
			case 3:deleteAccount(s,sc);
			break;
			case 4:selectAccount(s,sc);
			break;

			default : System.exit(0);
			}
		}

	}

	private static void selectAccount(Statement s,Scanner sc) throws SQLException {
		System.out.println("enter the accoubt id ::");
		int id=sc.nextInt();
		ResultSet rs= s.executeQuery("select * from bank where accid="+id);
		while(rs.next()) {
			System.out.println(rs.getString(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4)+"--"+rs.getString(5));
		}

	}

	private static void deleteAccount(Statement s, Scanner sc) throws SQLException {
		System.out.println("enter the accoubt id ::");
		int id=sc.nextInt();
		s.executeUpdate("delete from bank where accid="+id);
		System.out.println("success fully deleted the account with id "+id);

	}

	private static void updateAccount(Statement s, Scanner sc) throws SQLException {
		System.out.println("enter the accoubt id ::");
		int id=sc.nextInt();
		System.out.println("enter the amount ::");
		int amt=sc.nextInt();
		s.executeUpdate("update bank set accbalance="+amt+" where accid="+id);


	}

	private static void newAccount(Statement s,Scanner sc) throws SQLException {
		System.out.println("please enter the id ::");
		int id=sc.nextInt();
		System.out.println("please enter the name ::");
		String s1=sc.next();
		System.out.println("please enter the bank name ::");
		String s2=sc.next();
		System.out.println("please enter the balance ::");
		int balance=sc.nextInt();
		System.out.println("please enter the branchcity ::");
		String s3=sc.next();
		s.executeUpdate("insert into bank values("+id+",'"+s1+"','"+s2+"',"+balance+",'"+s3+"')");
		System.out.println("sucessfully updated the account details with id "+id);


	}

}
