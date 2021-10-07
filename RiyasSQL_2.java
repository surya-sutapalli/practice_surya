package com.riyas.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// creating singletonclass 
class SingleTonClass{
	private static SingleTonClass single=null;
	public static  SingleTonClass grtInstance() {
		if (single==null) {
			single =new SingleTonClass();
		}return single;
		// in getconnection method ,connection and statement created
	}public Statement getConnection()  throws SQLException,IOException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","welcome");
		Statement s=c.createStatement();
		return s;
	}
}
public class RiyasSQL_2 {
	//in getstatus method used to get city or bank according to option
	public static void getStatus(Scanner sc,Statement s,int option) throws SQLException {
		if(option==1) {
			System.out.println("enter the city");
			String city=sc.next();
			ResultSet rs=s.executeQuery("select * from bank where accbranchcity='"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"-----"+rs.getString(2)+"-----"+rs.getString(3)+"-----"+rs.getInt(4)+"----"+rs.getString(5));
			}
		}
		else if(option==2) {
			System.out.println("enter the bank");
			String bank=sc.next();
			ResultSet rs=s.executeQuery("select * from bank where accbank='"+bank+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"-----"+rs.getString(2)+"-----"+rs.getString(3)+"-----"+rs.getInt(4)+"----"+rs.getString(5));}
		}
	}
	//main method
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Statement s=SingleTonClass.grtInstance().getConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("please select option(1/2)");
		int option=sc.nextInt();
		getStatus(sc,s,option);
		s.close();
	}

}
