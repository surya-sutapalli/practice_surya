package Test_1;

import java.util.Scanner;

public class UserMaincode1_priyanshu {
	public static void formnewword(String str, int n) {
		if(str.length()%2==0 && str.length()>=2*n)
		{
			String firstn = str.substring(0, n);
			String lastn = str.substring(str.length()-n);
			System.out.println(firstn+lastn);
		}

	}
	public static void main(String[] args)
	{
		UserMaincode1_priyanshu obj = new UserMaincode1_priyanshu();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int j = sc.nextInt();
	
		obj.formnewword(s, j);

	}

}
