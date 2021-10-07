package jdbcconnectionpac2;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class SivalingamSQL_1 {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection c =  DriverManager.getConnection("jdbc:mysql://localhost:3306/BankData","root","welcome");
    java.sql.Statement s =   c.createStatement();
    //s.execute("create database BankData");
    //s.execute("create table bank(accid int,accname varchar(20),accbank varchar(20),accbalance float,accbranchcity varchar(15))");
    
    
    Scanner sc = new Scanner(System.in);
    
    int accid=1;   
    String accname;
    String accbank;
    float accbalance;
    String accbranchcity;
    int count = 0;    
    
    
    
    while(count<10)
    {
      System.out.println("Iteration number :"+(count+1));
      System.out.println("Enter acc id :"); //Customer id
      accid = sc.nextInt();
      
      System.out.println("Enter acc name :"); //Customer name
      accname = sc.next();      
      
      System.out.println("Enter acc bank :"); //Bank name
      accbank = sc.next();
      //condition for only to enter these HDFC,AXIS,ICIC Banks
      if(!(accbank.toLowerCase().equalsIgnoreCase("hdfc")|| accbank.toLowerCase().equalsIgnoreCase("axis") || accbank.toLowerCase().equalsIgnoreCase("icici")))
      {
        System.out.println("Invalid Bank");
        continue;
      }
      
      System.out.println("Enter acc balance:");
      accbalance = sc.nextFloat(); //Account balance
      if(accbalance<=0)//invalid for 0 and negative values
      {
        System.out.println("Invalid Balance");
        continue;
      }
      
      System.out.println("Enter accbranchity :"); //Branch name
      accbranchcity = sc.next();
      
      //Insert into database
      s.execute("insert into bank values('"+accid+"','"+accname+"','"+accbank+"','"+accbalance+"','"+accbranchcity+"')");   
      count++;
    }
    
    

  }

}
