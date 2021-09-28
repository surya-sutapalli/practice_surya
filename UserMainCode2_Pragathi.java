package Assesment;
import java.util.Scanner;
public class UserMainCode2_Pragathi {
	public static int check(String str)
	{
		String[] x= str.split("");
		int totallength;
		int s =0;
		int e=x.length-1;
		if(x[s].equalsIgnoreCase(x[e]))
			totallength=x[s].length();
		else
			totallength=x[s].length()+x[e].length();
		return totallength;
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter String");
		String n=sc.nextLine();
		UserMainCode2_Pragathi m=new UserMainCode2_Pragathi();
		System.out.println(m.check(n));
		
	}

}
