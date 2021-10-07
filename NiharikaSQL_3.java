package ntt;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc {
	static Scanner scn = new Scanner(System.in);

	public class Account
	{
	    private int accountId;
	    private String accountType;
	    private int balance;
	    public int getAccountId()
	    {
	        return accountId;
	        
	    }
	    public String getAccountType()
	    {
	        return accountType;
	    }
	    public int getBalance()
	    {
	        return balance;
	        
	    }
	    public void setAccountId(int id)
	    {
	        accountId=id;
	    }
	    public void setAccountType(String s)
	    {
	        accountType=s;
	    }
	    public void setBalance(int b)
	    {
	        balance=b;
	    }
	    public boolean withdraw(int w)
	    {
	        if(getBalance()<w)
	        {
	            System.out.println("Sorry!!! No enough balance");
	            return false;
	        }
	        else
	        {
	            System.out.println("Balance amount after withdraw: "+(getBalance()-w));
	            return true;
	        }
	    }
	}

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/NTT", "system", "welcome");
		Statement s = c.createStatement();
		public class AccountDetails
		{
		    public static  Account getAccountDetails()
		    {
		        Account acc=new Account();
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter account id: ");
		        acc.setAccountId(sc.nextInt());
		        sc.nextLine();
		        System.out.println("Enter account type: ");
		        acc.setAccountType(sc.nextLine());
		        int b;
		        do
		        {
		        System.out.println("Enter Balance");
		        acc.setBalance(sc.nextInt());
		        b=acc.getBalance();
		        if(b<=0)
		        System.out.println("Balance should be positive");
		        }
		        while(b<=0);
		        return acc;
		    }
		    public static int deposit()
		    {
		        Scanner sc=new Scanner(System.in);
		        int w;
		        do
		        {
		            System.out.println("Enter amount to be deposit:");
		            w=sc.nextInt();
		            if(w<=0)
		            System.out.println("Amount should be positive");
		        }
		        while(w<=0);
		        return w;
		    }
		    public static void main(String[] args)
		    {
		        Account accObj=new Account();
		        accObj=getAccountDetails();
		        int c=deposit();
		        accObj.withdraw(c);
		    }
		}	
	}