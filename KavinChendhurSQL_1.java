package test1;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class KavinChendhurSQL_1 {

	public void GetValues(Statement s) throws SQLException
	{
		Scanner sc=new Scanner(System.in);

		int accid,accbalance=0;String accname,accbank,accbranchcity=null;
		int i=1;
		do
		{
			System.out.println("Enter Account ID");
			accid=sc.nextInt();
			System.out.println("Enter account name");
			accname=sc.next();

			System.out.println("Enter account bank");
			accbank=sc.next();


			if((!"hdfc".equals(accbank) && !"icici".equals(accbank) && !"axis".equals(accbank)))
			{
				System.out.println("Invalid bank,Enter the details again");

				continue;
			}



			System.out.println("Enter account balance");
			accbalance=sc.nextInt();
			if(accbalance<=0)
			{
				System.out.println("Invalid balance!,Enter the details again");

				continue;
			}

			System.out.println("Enter branch city");
			accbranchcity=sc.next();

			s.execute("insert into bank values("+accid+",'"+accname+"','"+accbank+"',"+accbalance+",'"+accbranchcity+"')");




			i=i+1;
		}
		while(i<=10);

		s.close();

	}



	public static void main(String[] args) throws ClassNotFoundException,IOException, SQLException {

		KavinChendhurSQL_1 k=new KavinChendhurSQL_1();

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","XE","welcome");
		Statement s=c.createStatement();

		//s.execute("Create table bank(accid int,accname varchar2(20),accbank varchar(20),accbalance int,accbranchcity varchar(20))");

		k.GetValues(s);

		c.close();

	}

}
