package com.bikash.jdbc1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class BikashSQL_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		FileInputStream fi=new FileInputStream("D:\\workspace\\jdbc1\\src\\main\\java\\com\\bikash\\jdbc1\\db.properties");
    Properties p = new Properties();
    p.load(fi);
    Class.forName(p.getProperty("driver"));
    Connection c = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), p.getProperty("pass"));
    Statement s = c.createStatement();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1 or 2");
    int a = sc.nextInt();
		if(a == 1) {
			System.out.println("enter branch city");
			String city = sc.next();
			ResultSet rs = s.executeQuery("select * from bank where accbranchcity='"+city+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"----"+rs.getString(3)+"---"+rs.getInt(4)+"----"+rs.getString(5));
			}
		}else if(a==2) {
			System.out.println("enter bank name");
			String bank=sc.next();
			ResultSet rs=s.executeQuery("select * from bank where accbank='"+bank+"'");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"-----"+rs.getString(3)+"---"+rs.getInt(4)+"----"+rs.getString(5));
			}
		}else {
			System.out.println("There is no option");
		}

		s.close();
		c.close();

	}

}
