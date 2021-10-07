package com.tharani.jdbc_with_server;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class BavatharaniSQL_SERVER_2 {
	// method to create table.
	public void table(Connection c,Statement s) throws SQLException
	{
		s.execute("Create table Bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		System.out.println("Table created for Bank database");
	}
	// method to insert values in table.
	public void insertValues(Connection c,Statement s) throws SQLException
	{
		s.execute("insert into Bank values(1001,'tharani','hdfc',10000,'chennai')");
		s.execute("insert into Bank values(1002,'praveen','icici',15000,'coimbatore')");
		s.execute("insert into Bank values(1003,'partha','axis',12000,'chennai')");
		s.execute("insert into Bank values(1004,'rani','hdfc',8000,'bangalore')");
		s.execute("insert into Bank values(1005,'dhinesh','icici',9000,'chennai')");
		s.execute("insert into Bank values(1006,'anu','axis',20000,'coimbatore')");
		s.execute("insert into Bank values(1007,'banu','hdfc',12500,'coimbatore')");
		s.execute("insert into Bank values(1008,'dharun','icici',9800,'bangalore')");
		s.execute("insert into Bank values(1009,'abi','axis',19000,'bangalore')");
		s.execute("insert into Bank values(1010,'karthi','hdfc',18000,'mangalore')");
		s.execute("insert into Bank values(1011,'kajal','icici',8700,'chennai')"); 

		System.out.println("rows inserted");
	}
	// method to get record by city.
	public void recordByCity(String city,Statement s) throws SQLException
	{
		ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"' and accbalance>0");
		BavatharaniSQL_SERVER_2.display(rs);
	}
	// method to get records by bank.
	public void recordByBank(String b,Statement s) throws SQLException
	{
		ResultSet rs=s.executeQuery("select * from bank where accbank='"+b+"'and accbalance>0");
		BavatharaniSQL_SERVER_2.display(rs);
	}
	// static method to display resultset.
	public static void display(ResultSet rs) throws SQLException
	{  int c=0;
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getInt(4)+"----"+rs.getString(5));
		c++;
	} 
	if(c==0)
		System.out.println("No records matching");
	}
	// main method.
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=ONOFFMOE/Bankdb","sa","welcome");
		Statement s=c.createStatement();
		BavatharaniSQL_SERVER_2 obj= new BavatharaniSQL_SERVER_2();
		//s.execute("create database Bankdb");
		//obj.table(c, s);
		//obj.insertValues(c,s);

		Scanner sc = new Scanner(System.in);

		while(true) 
		{
			System.out.println("enter option 1 for records by city and 2 for records by bank");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("enter branch city");
				String city=sc.next();
				obj.recordByCity(city, s);
			}
			else if(choice==2)
			{
				System.out.println("enter account branch-(hdfc or icici or axis)");
				String b=sc.next();
				obj.recordByBank(b, s);
			}
			System.out.println("do you want to continue? y/n");
			String val=sc.next();
			if(val.equalsIgnoreCase("y"))
			{continue;}
			else
			{System.out.println("Ended");
			break;}
		}  
		s.close();
		c.close();
	}

}






