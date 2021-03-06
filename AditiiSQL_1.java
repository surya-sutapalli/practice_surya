package com.aditi.jdbc;

import java.sql.*;
import java.util.*;
import java.io.*;
public class AditiiSQL_1 
{
    public static void main(String[] args) throws SQLException,IOException, ClassNotFoundException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","aditi");
        Statement s =c.createStatement();
        for(int i=0;i<1;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter accId : ");
            int id = sc.nextInt();
            System.out.println("Enter accName : ");
            String name = sc.next();
            System.out.println("Enter accbank : ");
            String bank = sc.next();
            if(!(bank.toLowerCase().equalsIgnoreCase("hdfc")|| bank.toLowerCase().equalsIgnoreCase("axis") ||bank.toLowerCase().equalsIgnoreCase("icici")))
            {
                System.out.println("INVALID BANK");
                continue ;
            }
            System.out.println("Enter ACCOUNT BALANCE : ");
            int balance = sc.nextInt();
            if(balance<=0)
            {
                System.out.println("Invalid Bank Balance");
                continue;
            }
            System.out.println("Enter bank Branch city : ");
            String city = sc.next();
            s.execute("insert into bank values("+id+",'"+name+"','"+bank+"',"+balance+",'"+city+"')");
            ResultSet rs =s.executeQuery("select * from bank");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ "--" +rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));
            }
            //}
            s.close();
            c.close();
        }
    }
}