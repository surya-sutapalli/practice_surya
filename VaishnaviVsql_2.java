package com.vaishnavi.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//PROGRAM DONE in ORACLE
public class VaishnaviVsql_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","SYSTEM","welcome");
		Statement s=c.createStatement();
		//s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
		//s.execute("insert into bank values(101,'vaishnavi','hdfc',50000,'chennai')");
		//s.execute("insert into bank values(102,'oviya','axis',10000,'bangalore')");
		//s.execute("insert into bank values(103,'ram','hdfc',50200,'chennai')");
		//s.execute("insert into bank values(104,'sita','icici',25000,'delhi')");
		//s.execute("insert into bank values(105,'radha','axis',9000,'pune')");
		//s.execute("insert into bank values(106,'krishna','hdfc',5000,'delhi')");
		//s.execute("insert into bank values(107,'satya','icici',30000,'bangalore')");
		//s.execute("insert into bank values(108,'barathi','axis',53000,'chennai')");
		//s.execute("insert into bank values(109,'swathi','hdfc',6000,'chennai')");
		//s.execute("insert into bank values(110,'raj','icici',500,'pune')");
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("1.Enter a city");
			System.out.println("2.Enter a bankname");
			System.out.println("please enter an option");
			int val= sc.nextInt();
			ResultSet rs=s.executeQuery("select * from bank");

            // select the record by city
			if(val==1)
			{
				System.out.println("Enter a cityname");
				String city=sc.next();


				while(rs.next())
				{
					if(city.equals(rs.getString(5)))
						System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getInt(4)+"---"+rs.getString(5));
				}

			}
			//select the record by bankname
			else if(val==2)
			{
				System.out.println("Enter a bankname");
				String bank=sc.next();

				while(rs.next())
				{
					if(bank.equals(rs.getString(3)))
						System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getInt(4)+"---"+rs.getString(5));
				}

			}
			//To continue the process
			System.out.println("Do you want to continue");
			String str=sc.next();

			if(str.equalsIgnoreCase("Y"))
			{
				continue;
			}
			else
			{
				break;
			}
		}
		sc.close();
		s.close();
		c.close();


	}

}
