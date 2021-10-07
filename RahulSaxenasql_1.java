package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RahulSaxenasql_1{
		//Calling the Connection Globally
		static final String DB_URL = "jdbc:mysql://localhost:3306/ntt";
		static final String USER = "root";
		static final String PASS = "root";
		public void validations(Statement s1) throws SQLException {
		int totalnumber=1;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Total number of Acc you want add");
		int enter=input.nextInt();
		System.out.println("Please Enter the Details for + "+ totalnumber);
		for(int i = 0; i<enter; i++)//Takes all the Input
		{
			System.out.println("Enter Account Id +"+(i+1)+": ");
			int id = input.nextInt();
			System.out.println("Enter Account Name : ");
			String acname = input.next();
			System.out.println("Enter Account Bank : ");
			String bankname = input.next();
			System.out.println("Enter Account Balance : ");
			int balance = input.nextInt();
			System.out.println("Enter Account branch city : ");
			String branch = input.next();
			if((bankname.equalsIgnoreCase("Hdfc") || bankname.equalsIgnoreCase("Axis") || bankname.equalsIgnoreCase("Icici"))&& (balance>0) )//Check all the Validations
			{		
				s1.execute("insert into bank values("+id+",'"+acname+"','"+bankname+"',"+balance+",'"+branch+"')");
			}
			else if(!(bankname.equalsIgnoreCase("hdfc") || bankname.equalsIgnoreCase("axis") || bankname.equalsIgnoreCase("icici")))
			{
				System.out.println("Bank should be hdfc/icici/axis"); //Gives the Solution to the User	
				i-=1;
				continue;
				
			}
			else if((balance < 0))
			{
				System.out.println("Balance is negative");//Gives the Solution to the User
				i-=1;
				continue;
			}
			totalnumber++;
			
	    }	
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			 
				//establish a database connection
				Connection connection = DriverManager.getConnection(DB_URL,USER,PASS );
				//create a statement
				Statement statement = connection.createStatement();
				RahulSaxenasql_1 run = new RahulSaxenasql_1();
				run.validations(statement);
				statement.close();
				connection.close();

	}

}
