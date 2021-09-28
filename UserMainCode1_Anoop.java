package Test;

import java.util.Scanner;

class mainCode{
	public static String getLarWord(String str)
	{
		int a= 0, max=0;
		String s3 = "";
		String[] s = str.split(" ");
		for(String s2:s)
		{
			if(s2.length()>max )
			{
				if(s2.length()==max) {
			
			
				a=1;
				continue;
			}	
			max=s2.length();
			s3=s2;
		}
		}
		
		if(a==1)
		{
			System.out.println("");
		}
		return s3;
				
	}
}

public class UserMainCode1_Anoop
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println(mainCode.getLarWord(str));
		sc.close();
	}


}
