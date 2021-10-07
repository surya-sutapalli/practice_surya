package com.kalai1.ssmsample;
import java.sql.*;
import java.util.Scanner;
import java.io.*;
public class KalaiSQLSERVER_2 {
	public void insertmthd(Statement s)throws SQLException
	{
		s.execute("insert into bank values(101,'kalai','hdfc',20000,'chennai')");
		s.execute("insert into bank values(102,'vijay','hdfc',27000,'visag')");
		s.execute("insert into bank values(103,'sharmi','axis',27000,'pune')");
		s.execute("insert into bank values(104,'jimin','icici',50000,'mumbai')");
		s.execute("insert into bank values(105,'jin','hdfc',80000,'chennai')");
		s.execute("insert into bank values(106,'jhope','icici',350000,'bangalore')");
		s.execute("insert into bank values(107,'jungkook','axis',20000,'chennai')");
		s.execute("insert into bank values(108,'v','icici',40000,'pune')");
		s.execute("insert into bank values(109,'rm','hdfc',29000,'visag')");
		s.execute("insert into bank values(110,'sheik','axis',60000,'chennai')");
	}
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=7OKGOBOMSSQLSERVERO1","sa","welcome");
		Statement s = c.createStatement();
		KalaiSQLSERVER_2 o=new KalaiSQLSERVER_2();
		Scanner sc=new Scanner(System.in);
		//s.execute("create database bankdetails");
		//s.execute("create table bank(accid int, accname varchar(20),accbank varchar(20),accbalace int,accbranchcity varchar(20))");
		o.insertmthd(s);
		System.out.println("1.records by city");
		System.out.println("2.records by bank");
		System.out.println("Please select an option:");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println("enter city:");
			String city=sc.next();
			ResultSet rs =s.executeQuery("select * from bank where accbranchcity=('"+city+"')");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getInt(4)+"---"+rs.getString(5));
			}

		}

		else
		{
			System.out.println("enter bank:");
			String bank1=sc.next();

			ResultSet rs1 =s.executeQuery("select * from bank where accbank=('"+bank1+"')");
			while(rs1.next())
			{
                 System.out.println(rs1.getInt(1)+"---"+rs1.getString(2)+"---"+rs1.getString(3)+"---"+rs1.getInt(4)+"---"+rs1.getString(5));
			}
        }
        s.close();
		c.close();
	}
}



