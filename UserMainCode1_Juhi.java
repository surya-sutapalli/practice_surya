package Test1;

import java.util.Scanner;

public class UserMainCode1_Juhi {
	public static void formNewWord()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		System.out.println("Enter no.");
		int n=sc.nextInt();
		strappend( s, n);
	}

	public static void strappend(String s, int n)
	{
		StringBuffer sb=new StringBuffer(s.substring(0,n));
		//int l=s.length()-n;
		StringBuffer sb1=new StringBuffer(s.substring(s.length()-n));
		sb.append(sb1);
		String st=sb.toString();


		System.out.println(st);


	}
}
