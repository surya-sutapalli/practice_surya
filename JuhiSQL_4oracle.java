package com.juhi.jdbc;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

/**
* removed all pmd violations except systm.out.println,
* classNamingConvention
* LawofDemeter
* and also some checkstyling done
*/

public class JuhiSQL_4oracle {
/**
 * 
 * main method for inserting values to bank class and display and update records
 */

public static void main(final String[] args) throws SQLException, IOException, ClassNotFoundException{
 Class.forName("oracle.jdbc.driver.OracleDriver");
 final Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","welcome");
 final Statement sta =con.createStatement();
 final Scanner scan =new Scanner(System.in);

/**
 * s.execute("create table bank1(accid int,accname varchar(20),accbank varchar(20) 
 * ,accbalance int,accbranchcity varchar(20))");
 */

/**
* to insert the 10 records maunally
 */
insert(sta);
final int idem = display(sta, scan);
withdraw(scan, sta, idem);

scan.close();
sta.close();
con.close();
}
/**
* to insert the 10 records maunally
*/

public static void insert(final Statement sta) throws SQLException
{
 sta.execute("insert into bank values(101,'Ramjaag','hdfc',1500,'agra')");
 sta.execute("insert into bank values(102,'Ramesh','hdfc',100,'agra')");
 sta.execute("insert into bank values(103,'Sita','axis',1600,'pune')");
 sta.execute("insert into bank values(104,'ganga','icici',1900,'delhi')");
 sta.execute("insert into bank values(105,'arun','hdfc',100,'agra')");

 sta.execute("insert into bank values(106,'Siya','axis',400,'pune')");
 sta.execute("insert into bank values(107,'gagan','icici',1700,'delhi')");
 sta.execute("insert into bank values(108,'Sam','axis',700,'etawah')");
 sta.execute("insert into bank values(109,'sundar','icici',1200,'jaipur')");
 sta.execute("insert into bank values(110,'aruna','hdfc',1100,'noida')");
}

/**
 * to insert the 10 records manually insert(s,sc) called by main
 */
public static int display(final Statement sta, final Scanner scan) throws SQLException
{
 System.out.println("Enter account id");
 final int idem = scan.nextInt();
 final ResultSet rses = sta.executeQuery("select * from  bank where accid=" + idem + "");
 while(rses.next())
 {
	System.out.println(rses.getInt(1) + "-----" +rses.getString(2) + "---" +rses.getString(3) + "---" +rses.getInt(4) + "---"+rses.getString(5));	
 }

rses.close();
return idem;
}
/**
 * to update records 
 */
public static void withdraw(final Scanner scan,final Statement sta,final int idoo) throws SQLException
{
 System.out.println("Enter amount to withdraw");
 final int num = scan.nextInt();
 sta.execute("update bank set accbalance=(accbalance-" + num + ") where accid=" + idoo+ "");
 System.out.println("Updated successfully");
 }
}
