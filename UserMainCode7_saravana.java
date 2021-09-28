package test;
import java.util.*;
public class UserMainCode7_saravana {
	public static int validatePassword(String s)
	{
		if(s.length()>=6 && s.length()<=20)
		{
			if(s.matches(".*[0-9]{1,}.*") && s.matches(".*[@#$]{1,}.*"))
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args) {
		String s;
		Scanner sc= new Scanner(System.in);
		s=sc.nextLine();

		int c=UserMainCode7.validatePassword(s);
		if(c==1)
			System.out.println("Valid password");
		else
			System.out.println("invalid password");


	}
}
