package com.sampnew.jdbc;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
public class SindhuSQL_5 {
	public void operation(Statement s, Connection c) throws IOException, SQLException, ClassNotFoundException {
		String flag = "y";
		//ONLY WHILE USER WANTS TO CONTINUE
		while(flag.equalsIgnoreCase("y")) {
			System.out.println("MENU:");
			System.out.println("1.New Account\t2.Update Account: --> provide accid,amount\t3.Delete Account: --> provide accid\t4.Select Account: --> provide accid\t5.Exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			//FOR NEW ACCOUNT
			if(option == 1) {
				System.out.println("Enter id, customer name, bank name, balance, branch");
				int id = sc.nextInt();
				String name = sc.next();
				String bank = sc.next();
				double balance = sc.nextDouble();
				String branch = sc.next();
				s.execute("insert into bank values ("+id+",'"+name+"','"+bank+"',"+balance+",'"+branch+"')");
				System.out.println("Account created successfully!");
			}
			//FOR UPDATING AMOUNT
			if(option ==2) {
				System.out.println("Enter your id and amount:");
				int id = sc.nextInt();
				double amount = sc.nextDouble();
				ResultSet rs = s.executeQuery("select * from bank where accid="+id);
				while(rs.next()) {
					s.execute("update bank set accbalance="+(rs.getDouble(4)+amount)+" where accid="+id);
					break;
				}
				System.out.println("Amount updated successfully!");
			}
			//FOR DELETING RECORD
			if(option ==3) {
				System.out.println("Enter your id to delete");
				int id = sc.nextInt();
				s.execute("delete from bank where accid="+id);
				System.out.println("Account deleted successfully!");
			}
			//TO SELECT AND DISPLAY
			if(option ==4) {
				System.out.println("Enter your id to display records");
				int id = sc.nextInt();
				ResultSet rs = s.executeQuery("select * from bank where accid="+id);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getDouble(4)+"--"+rs.getString(5));
				}
			}
			//TO EXIT
			if(option ==5) {
				break;
			}
			System.out.println("Do you want to continue??(y/n)");
			String temp = sc.next();
			flag = temp;
		}
	}
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankacc", "root", "welcome");
		Statement s = c.createStatement();
		//AFTER CONNECTION, IM CALLING THE OPERATION FUNCTION
		SindhuSQL_5 ssql = new SindhuSQL_5();
		ssql.operation(s, c);
		s.close();
		c.close();
		
	}
}
