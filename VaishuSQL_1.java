package com.Vaishu.Jdbc;
import java.sql.*;
import java.util.Scanner;
public class VaishuSQL_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","root");
		java.sql.Statement s =   c.createStatement();
		s.execute("create table BankDetails(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(15))");
		Scanner sc = new Scanner(System.in);
		int accid=1;
		String accname;
		String accbank;
		float accbalance;
		String accbranchcity;;   
		for(int i=1;i<=10;i++)
		{
			System.out.println("Enter account id :");
			accid = sc.nextInt();
			System.out.println("Enter account name :");
			accname = sc.next();      
			System.out.println("Enter bank account :");
			accbank = sc.next();
			if(!(accbank.toLowerCase().equalsIgnoreCase("hdfc")|| accbank.toLowerCase().equalsIgnoreCase("axis") || accbank.toLowerCase().equalsIgnoreCase("icici")))
			{
				System.out.println("Invalid Bank");
				continue;
			}
			System.out.println("Enter account balance:");
			accbalance = sc.nextInt();
			if(accbalance<=0)
			{
				System.out.println("Invalid Balance");
				continue;
			}
			System.out.println("Enter city of branch :");
			accbranchcity = sc.next();

			s.execute("insert into BankDetails values('"+accid+"','"+accname+"','"+accbank+"','"+accbalance+"','"+accbranchcity+"')");  
		}
		s.close();
		c.close();
	}
}

