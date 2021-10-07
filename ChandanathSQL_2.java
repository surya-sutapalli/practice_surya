package com.chandana.jdbc;
import java.sql.*;
import java.util.*;
public class ChandanathSQL_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/banktest","root","welcome");
		Statement s= c.createStatement();//s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		//s.execute("insert into bank values(01,'chandana','hdfc',5000,'bangalore')");
		//s.execute("insert into bank values(02,'suma','hdfc',6000,'chennai')");
		//s.execute("insert into bank values(03,'vijaya','icici',9000,'pune')");
		//s.execute("insert into bank values(04,'komala','axis',4000,'noida')");
		//s.execute("insert into bank values(05,'raju','axis',5000,'mumbai')");
		//s.execute("insert into bank values(06,'gautham','icici',1000,'pune')");
		//s.execute("insert into bank values(07,'nisha','hdfc',2000,'gurgeon')");
		//s.execute("insert into bank values(08,'gagan','axis',3000,'chennai')");
		//s.execute("insert into bank values(09,'liki','icici',7000,'bangalore')");
		//s.execute("insert into bank values(10,'veda','hdfc','1000','hyderabad')");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select an option");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the city name:");
			String branchcity=sc.next();
			ResultSet res=s.executeQuery("select * from bank where accbranchcity='"+branchcity+"'");
			while(res.next()) {
			System.out.println(res.getInt(1)+"----"+res.getString(2)+"----"+res.getString(3)+"----"+res.getInt(4)+"-----"+res.getString(5));
			
			}
			break;
		case 2:
	        
			System.out.println("Enter the bank name:");
			String bankname=sc.next();
			ResultSet res1=s.executeQuery("select * from bank where accbank='"+bankname+"'");
			while(res1.next()) {
			System.out.println(res1.getInt(1)+"----"+res1.getString(2)+"----"+res1.getString(3)+"----"+res1.getInt(4)+"-----"+res1.getString(5));
			
			}
			break;
			default: System.out.println("Please enter a valid option");
		}
		s.close();
		c.close();
		
		
	}
}
