package com.jagan.jdbc; //JDBC program Question number-1.
import java.sql.*;
import java.util.Scanner;
public class Jagan_SQL1 {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","welcome");
    java.sql.Statement s =   c.createStatement();
    //s.execute("create database test1");
    //s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(15))");
    Scanner scan = new Scanner(System.in);
    
    int accid=1;
    String accname;
    String accbank;
    float accbalance;
    String accbranchcity;
    int count = 0; 
    
    while(count<10) {
      System.out.println("Iteration number :"+(count+1));
      System.out.println("Enter acc id :");
      accid = scan.nextInt();
      
      System.out.println("Enter acc name :");
      accname = scan.next();   
      
      System.out.println("Enter acc bank :");
      accbank = scan.next();
      if(!(accbank.toLowerCase().equalsIgnoreCase("hdfc")|| accbank.toLowerCase().equalsIgnoreCase("axis") || accbank.toLowerCase().equalsIgnoreCase("icici")))
      {
        System.out.println("Invalid Bank");
        continue;
      }
      
      System.out.println("Enter acc balance:");
      accbalance = scan.nextInt();
      if(accbalance<=0)
      {
        System.out.println("Invalid Balance");
        continue;
      }
      
      System.out.println("Enter accbranchity :");
      accbranchcity = scan.next();
      
      s.execute("insert into bank values('"+accid+"','"+accname+"','"+accbank+"','"+accbalance+"','"+accbranchcity+"')");   
      count++;
    }
    s.close();
    scan.close();
    c.close();
    
  }
}
