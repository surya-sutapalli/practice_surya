package com.manisha.jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ManishaMysql_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ntt1","root","welcome");
	     Statement s=c.createStatement();
	   //s.execute("create database NTT1");
		    // s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		     //s.execute("insert into bank values(101,'manisha','hdfc',20000,'hyderabad')");
		     //s.execute("insert into bank values(102,'pavan','hdfc',30000,'hyderabad')");
		     //s.execute("insert into bank values(103,'jyothi','axis',40000,'banglore')");
		     //s.execute("insert into bank values(104,'sanjana','axis',50000,'kochin')");
		     //s.execute("insert into bank values(105,'nithin','icic',10000,'goa')");
		     //s.execute("insert into bank values(106,'alekya','icic',5000,'kerala')");
		     //s.execute("insert into bank values(107,'suchi','hdfc',15000,'banglore')");
		     //s.execute("insert into bank values(108,'chandana','axis',12000,'hyderabad')");
		     //s.execute("insert into bank values(109,'madhu','icic',25000,'maharastra')");
		     //s.execute("insert into bank values(110,'shirisha','axis',2400,'hyderabad')");
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Select an option");
	     int ch=sc.nextInt();
	     switch(ch) 
	     {
	     case 1: System.out.println("enter city");
	     String city=sc.next();
	     ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"'");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getInt(4)+"-----"+rs.getString(5));
			
			}
			break;
	     case 2:
	    	 System.out.println("enter bank");
	    	 String bank=sc.next();
	    	 ResultSet rs1=s.executeQuery("select * from bank where accbank='"+bank+"'");
				while(rs1.next()) {
				System.out.println(rs1.getInt(1)+"----"+rs1.getString(2)+"----"+rs1.getString(3)+"----"+rs1.getInt(4)+"-----"+rs1.getString(5));
				
				}
				break;
	     }
	     s.close();
	     c.close();

}
}
