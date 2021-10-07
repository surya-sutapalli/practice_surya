package com.Harsh.squel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class HarshSQL_2 {
	static Scanner scn = new Scanner(System.in);

	// Method For Connecting and Creating Table
	public static void Builder(String city, String Bank, int Balance, int id, String name) throws Exception {
		// Connection with driver
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "Cuts&Heals");
		Statement s = c.createStatement();
		// Value Insertion
		s.executeUpdate(
				"insert into bank values(" + id + ", '" + name + "', '" + Bank + "','" + Balance + "','" + city + "')");
	}

	// Method For Inserting Values
	public static void insert(int number) throws Exception {
		for (int i = 0; i < number; i++) {
			System.out.println("Enter ID");
			int id = scn.nextInt();
			System.out.println("Enter name : ");
			String name = scn.next();
			System.out.println("Enter Bank");
			String Bank = scn.next();
			System.out.println("Enter Balance");
			int bal = scn.nextInt();
			System.out.println("Enter City");
			String city = scn.next();
			Builder(city, Bank, bal, id, name);
		}
	}

	// Method for sorting by city
	public static void sortByCity(String city) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "Cuts&Heals");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from bank where accbranchcity = '" + city + "'");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "-----" + rs.getString(2) + "-------" + rs.getString(3) + "-------"
					+ rs.getInt(4) + "-----" + rs.getString(5));
		}
	}

	// Method for sorting by Bank
	public static void sortByBank(String Bank) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "Cuts&Heals");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from bank where accbank = '" + Bank + "'");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "-----" + rs.getString(2) + "-------" + rs.getString(3) + "-------"
					+ rs.getInt(4) + "-----" + rs.getString(5));
		}
	}

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "root", "Cuts&Heals");
		Statement s = c.createStatement();

		// Table Creation
		s.execute(
				"Create table bank (accid int, accname varchar(20), accbank varchar(20), accbalance int, accbranchcity varchar(20))");
		
		//Taking Input From User
		System.out.println("How Many Records You Want ?");
		int number = scn.nextInt();
		insert(number); // Adding Values To Table
		System.out.println("Please Select Options");
		System.out.println("1. Sort Records By City ");
		System.out.println("2. Sort Records By Bank ");
		int a = scn.nextInt();
		if (a == 1) {
			System.out.println("Please Enter City : ");
			String city = scn.next();
			sortByCity(city);
		} else if (a == 2) {
			System.out.println("Please Enter Bank : ");
			String bank = scn.next();
			sortByBank(bank);
		}

	}
}
