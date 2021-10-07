package Test_2;

import java.sql.*;
import java.util.*;


public class ChetanSQL_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/TEST_2","root","chetan15033");
		Statement s=c.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("pleace select an option");
		System.out.println("1.select the records by city");
		System.out.println("2.select the records by city");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the  city");
			String city=sc.next();
			ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"'");
			while(rs.next()) {
			System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getInt(4)+"-----"+rs.getString(5));
			
			}
			break;
		case 2:
	        
			System.out.println("Enter the bank");
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