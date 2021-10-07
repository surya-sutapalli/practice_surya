package main.java.comjdbc.JDBC;
import java.sql.*;
import java.util.Scanner;
import java.io.*;

public class ShirishaSQL_2{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/cus_bank","root","root");
		Statement s=c.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("pleace select an option:");
		int choice=sc.nextInt();
		while(true)
		{
			if(choice==1) {
				System.out.println("enter city:");
				String accbranchcity=sc.next();
				ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+accbranchcity+"'");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getInt(4)+"-----"+rs.getString(5));

			}
				break;	
				}
			if(choice==2) {

				System.out.println("enter bank:");
				String bank=sc.next();
				ResultSet rs1=s.executeQuery("select * from bank where accbank='"+bank+"'");
				while(rs1.next()) {
					System.out.println(rs1.getInt(1)+"----"+rs1.getString(2)+"----"+rs1.getString(3)+"----"+rs1.getInt(4)+"-----"+rs1.getString(5));

				}
				break;}
		}
		s.close();
		c.close();
	}
}