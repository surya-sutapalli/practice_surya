package com.devi.jdbcoracle;

import java.io.IOException;  // import IOexcption package
import java.sql.*;  //import sql packag
import java.util.Scanner;  //import util package
/**
 * 
 * Oracle db
 *
 */

public class Deviyani_2 
{
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");  //register database driver (google)
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				"SYSTEM","root");   //establish a connection using url,port,user,password fot the database (google) 
		Statement s=c.createStatement();  //creating a statement

		Scanner sc=new Scanner(System.in);  //to take input from keyboard
		System.out.println("pleace select an option");  //option to select from which the records need to be displayed 
		System.out.println("Option 1 is Select records by city");
		System.out.println("Option 2 is Select records by bank");
		int opt=sc.nextInt(); 
		switch(opt)  //using switch for displaying particular column records
		{
		case 1:
			System.out.println("Enter the city");
			String city=sc.next();
			ResultSet rs1=s.executeQuery("select * from bank where accbranchcity='"+city+"'"); 
			// searching the city name entered with all records
			while(rs1.next()) 
			{
				System.out.println(rs1.getInt(1)+"-----"+rs1.getString(2)+"-----"+rs1.getString(3)
				+"-----"+rs1.getInt(4)+"------"+rs1.getString(5));
				//Displaying the records of selected option
			}
			rs1.close();
			break;
		case 2:

			System.out.println("Enter the bank");
			String bank=sc.next();
			ResultSet rs2=s.executeQuery("select * from bank where accbank='"+bank+"'");
			//searching the bank name name entered with all records
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+"-----"+rs2.getString(2)+"-----"+rs2.getString(3)
				+"-----"+rs2.getInt(4)+"------"+rs2.getString(5));
				//Displaying the records of selected option
			}
			rs2.close();
			break;
		default: System.out.println("Invalid option"); // invalid option selected
		}
		s.close();
		c.close();
	}
}