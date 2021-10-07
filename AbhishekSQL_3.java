package Assignmentoct7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AbhishekSQL_3 
{
	public void diplay() throws ClassNotFoundException, SQLException //handling exceptions
	{
		Class.forName("com.mysql.jdbc.Driver"); //register the driver
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "root"); //giving url,pass,and user
		Statement s= c.createStatement(); //creating statement
		Scanner sc= new Scanner(System.in);		//scanner to take user input
		System.out.println("Enter Acount ID:");
		int id=sc.nextInt();
		ResultSet rs=s.executeQuery("select * from bank where accid='"+id+"'");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getInt(4)+"--"+rs.getString(5));	//get the collumn

		}
		System.out.println("Enter Amount to Deposit:");
		int deposit=sc.nextInt();
		s.execute("update bank set accbalance=accbalance+'"+deposit+"' where accid='"+id+"'");
		ResultSet rs1=s.executeQuery("select * from bank where accid='"+id+"'");
		while(rs1.next())
		{
			System.out.println(rs1.getInt(1)+"--"+rs1.getString(2)+"--"+rs1.getString(3)+"--"+rs1.getInt(4)+"--"+rs1.getString(5));	//get the collumn

		}
		s.close();
		c.close();
		sc.close();
	}

	//main method
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		AbhishekSQL_3 obj =new AbhishekSQL_3(); //creating object
		obj.diplay();      //calling display function
	}
}
