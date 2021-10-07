package com.shriram.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ShriramSQL_1 {

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","@vengers4RAM");
    Statement s  =c.createStatement();
    //s.execute("create database bank");
    //s.execute("create table bank(accid int, accname varchar(20), accbank varchar(20), accbalance int, accbranchcity varchar(25))");
    int i=1;
    Scanner sc = new Scanner(System.in);
    while(i<11)
    {
      //get account id
      System.out.print("Enter the acc id: ");
      int accid = sc.nextInt();         
     
    //get account name
      System.out.print("Enter the acc name: ");
      String accname = sc.next();
      
      //get bank name
      System.out.print("Enter the bank name: ");
      String accbank = sc.next();
      
      //get the account balance
      System.out.print("Enter the acc balance: ");
      int accbalance = sc.nextInt();
      
      //get acoount branch city
      System.out.print("Enter the branch city: ");
      String accbranchcity = sc.next();
      
      //inserts
      s.execute("insert into bank values("+accid+",'"+accname+"','"+accbank+"',"+accbalance+",'"+accbranchcity+"')");
      System.out.println("Bank details created "+i);
      i++;
    }
    sc.close();
    s.close();
    c.close();
  }

}
