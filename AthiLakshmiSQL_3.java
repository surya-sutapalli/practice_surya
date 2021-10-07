package com.maven.demo.Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AthiLakshmiSQL_3 {
   
   public void show() throws SQLException 
    {
        //Class.forName("com.mysql.jdbc.Driver");
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/Test2", "root", "Athi@2000");
        Statement s = c.createStatement();
       // s.execute("create database Test2");
      //  s.execute("create table acc(accid int,accname varchar(20),accbank varchar(20),accbalance varchar(20),accbranchcity varchar(20))");
      //  s.execute("insert into acc values(101,'devi','axis',30000,'bangalore')");
      //  s.execute("insert into acc values(102,'sam','hdfc',70000,'chennai')");
      //  s.execute("insert into acc values(103,'abi','axis',90000,'goa')");
      //  s.execute("insert into acc values(104,'raj','icici',50000,'pune')");
      //  s.execute("insert into acc values(105,'renu','axis',34000,'mumbai')");
      //  s.execute("insert into acc values(106,'ravi','hdfc',60000,'madurai')");
      //  s.execute("insert into acc values(107,'latha','hdfc',8000,'coimbatore')");
      //  s.execute("insert into acc values(108,'athi','icic',67000,'pollachi')");
      //  s.execute("insert into acc values(109,'ram','axis',20000,'hyderabad')");
      //  s.execute("insert into acc values(110,'janu','icici',100000,'pune')");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter accid: ");
        int id = s1.nextInt();
        ResultSet rs = s.executeQuery("select * from acc where accid='"+id+"'");
        while(rs.next())
        {
        System.out.println(rs.getInt(1)+"--->"+rs.getString(2)+"--->"+rs.getString(3)+"--->"+rs.getInt(4)+"--->"+rs.getString(5));
        System.out.println("Enter amount to be deposit");
        int amt = s1.nextInt();
        int damt = rs.getInt(4) + amt;
        System.out.println(damt);
        s.execute("update acc set accbalance="+damt+" where accid="+id+"");
        System.out.println("Account balance should be updated successfully ");
        
       s1.close();
       c.close();
        
        }   

    }

    public static void main(String[] args) throws SQLException {
        AthiLakshmiSQL_3 obj = new AthiLakshmiSQL_3 ();
        obj.show();
        
       
    }

}
