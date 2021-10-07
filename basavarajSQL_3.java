package com.basu.sql;
import java.sql.*;
import java.io.*;
import java.util.*;
public class basavarajSQL_3  {


	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3307/bank1", "root","root123");
		Statement s = c.createStatement();
		Scanner sc = new Scanner(System.in);
		//s.execute("create table bank(accid int, accname varchar(20), accbank varchar(20), accbal int, accbranchcity varchar(20))");
		/*s.execute("insert into bank values(101,'basu','axix',10000,'coimbatore')");
		s.execute("insert into bank values(102,'hari','axis',2500,'pune')");
		s.execute("insert into bank values(103,'sarfaraz','icici',10500,'mumbai')");
		s.execute("insert into bank values(104,'kavya','icici',2000,'hyderabad')");
		s.execute("insert into bank values(105,'pavan','hdfc',90000,'hyderabad')");
		s.execute("insert into bank values(106,'aman','hdfc',1000,'vizag')");
		s.execute("insert into bank values(107,'sahana','icici',800,'chennai')");
		s.execute("insert into bank values(108,'manju','axis',12800,'hyderabad')");
		s.execute("insert into bank values(109,'revati','axis',60000,'bangalore')");
		s.execute("insert into bank values(110,'pranav','hdfc',9900,'chennai')");*/
		System.out.println("Enter a id");
		int id = sc.nextInt();
		ResultSet rs = s.executeQuery("select * from bank where accid='"+id+"'");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+"--->"+rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
		System.out.println("Enter amount to be deposit");
		int amount = sc.nextInt();
		int namount = rs.getInt(4) + amount;
		System.out.println(namount);
		s.execute("update bank set accbalance="+namount+" where accid="+id+"");
		System.out.println(" Account balance updated Successfully ");
		}
		
		s.close();
		c.close();
		rs.close();
		;
	}
}