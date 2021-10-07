package com.sathya.jdbc;
import java.sql.*;
import java.util.Scanner;


/**Singleton class */
class Singletonjdbc {

	private static Singletonjdbc single = null;
	private Singletonjdbc()
	{
		
	}
	public static Singletonjdbc getInstance()
	{
		if(single == null)
		{
			single= new Singletonjdbc();
		}
		return single;
	}
	public Statement getConnection()throws ClassNotFoundException,SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=60JURIT/test2","SYSTEM","welcome");
		Statement s = (Statement) c.createStatement();
		return s;
	}
}

public class SathyaSQL_2  {
	
	/**Getting records based on city*/
	
	public static void getRecordsbyCity(int op,Scanner sc) throws ClassNotFoundException, SQLException
	{
		Statement s= Singletonjdbc.getInstance().getConnection();
		System.out.println("Enter a City:");
		String city=sc.next();
		ResultSet rs= s.executeQuery("select * from bank where accbranchcity='"+city+"'");
		int count=0;
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "--->"+ rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
			count++;
		}
		if(count==0)
		{
			System.out.println("Records for given City is not in the table");
		}
		rs.close();
		s.close();
	}
	
	/**Getting records based on Bank*/
	
	public static void getRecordsbyBank(int op,Scanner sc) throws ClassNotFoundException, SQLException 
	{
		Statement s= Singletonjdbc.getInstance().getConnection();
		System.out.println("Enter a Bank:");
		String bankname=sc.next();
		final ResultSet rs= s.executeQuery("select * from bank where accbank='"+bankname+"'");
		int count=0;
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "--->"+ rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
			count++;
		}
		if(count==0)
		{
			System.out.println("Records for given Bank is not in the table");
		}
		rs.close();
		s.close();
	}
	
	/** Main Method
	 * @throws SQLException 
	 * @throws ClassNotFoundException */ 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Scanner sc= new Scanner(System.in);
		System.out.println("please select option(1/2):");
		int op=sc.nextInt();
		if(op==1) {
			SathyaSQL_2.getRecordsbyCity(op,sc);
		}
		else {
			SathyaSQL_2.getRecordsbyBank(op,sc);
		}
}

}
