package com.madhu.jdbc;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MadhuSQL_2 
{

  public static void main(String[] args) throws SQLException,IOException,ClassNotFoundException {
    // TODO Auto-generated method stub
     Class.forName("com.mysql.jdbc.Driver");
     Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","madhu");
     Statement s=c.createStatement();
     Scanner sc=new Scanner(System.in);
    //s.execute("create database test1");
     //s.executeUpdate("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");
     //s.executeUpdate("insert into bank values(110,'swarna','kotak','1000','karnataka')");
     System.out.println("enter option : ");
     Scanner sc1=new Scanner(System.in);
     int num=sc1.nextInt();
     if(num==1)
     {
       Scanner sc2=new Scanner(System.in);
       String name=sc2.next();
       ResultSet r=s.executeQuery("select * from bank where accbranchcity='"+name+"'");
       while(r.next())
       {
         System.out.println(r.getInt(1)+"--"+r.getString(2));
       }
     }
     if(num==2)
     {
       Scanner sc3=new Scanner(System.in);
       String name=sc3.next();
       ResultSet r=s.executeQuery("select * from bank where accbank='"+name+"'");
       while(r.next())
       {
         System.out.println(r.getInt(1)+"--"+r.getString(2));
       }
     }
     
     
     s.close();
     c.close();
   }

  }


