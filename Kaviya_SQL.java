package com.kaviya.mysql;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Kaviya_SQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER01;databaseName=branch","sa","welcome");
        Statement s = c.createStatement();
        //ResultSet rs = s.executeQuery("select * from bank where stdid");
        //s.execute("create database branch");
        //s.executeUpdate("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance int,accbranchname varchar(20))");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("enter account is :");
            int id=sc.nextInt();
            System.out.print("enter account name :");
            String name=sc.next();
            System.out.print("enter bank account :");
            String banacc=sc.next();
            System.out.print("enter balance :");
            int balance = sc.nextInt();
            System.out.print("enter branchname :");
            String branch=sc.next();
            s.executeUpdate("insert into bank values("+id+",'"+name+"','"+banacc+"',"+balance+",'"+branch+"')");
        }
        System.out.println("excuted sucessfuly");
        s.close();
        s.close();

    }

}
