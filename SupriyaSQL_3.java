import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SupriyaSQL_3{
public static void main(String[] args) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "hishri");
Statement s = c.createStatement();
Scanner sc = new Scanner(System.in);
//s.execute("create table account(accid int, accname varchar(20), accbank varchar(20), accbal int, accbranchcity varchar(20))");
/*s.execute("insert into account values(101,'dravid','axis',10000,'coimbatore')");
s.execute("insert into account values(102,'osman','hdfc',1000,'kolkatta')");
s.execute("insert into account values(103,'hamida','hdfc',20000,'bangalore')");
s.execute("insert into account values(104,'Aarya','icici',2000,'chennai')");
s.execute("insert into account values(105,'Ishani','axis',30000,'goa')");
s.execute("insert into account values(106,'Ramya','icici',30000,'indoor')");
s.execute("insert into account values(107,'suresh','hdfc',50000,'cairo')");
s.execute("insert into account values(108,'lahari','axis',700,'pune')");
s.execute("insert into account values(109,'arvind','hdfc',8000,'hyderabad')");
s.execute("insert into account values(110,'avinash','icici',8000,'pune')");*/
System.out.println("Enter a id");
int id = sc.nextInt();
ResultSet rs = s.executeQuery("select * from account where accid='"+id+"'");
while(rs.next())
{
System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getString(3)+"---"+rs.getInt(4)+"---"+rs.getString(5));
System.out.println("Enter the amount to be deposited");
int amount = sc.nextInt();
int namount = rs.getInt(4) + amount;
System.out.println(namount);
//s.execute("update account set accbal="+amount+" where accid="+id+"");
System.out.println(" Account balance updated Successfully ");
}
rs.close();
        s.close();
        c.close();
}
}