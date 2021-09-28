package Test_1;

import java.util.Scanner;

public class UserMainCode_priyanshu {
	public static String getLargestword(String str) 
	{
		int max =0;
		String result = new String();
		String[] split = str.split(" ");
		for(String s :split)
		{
			int len = s.length();
			if(len >max) {
				max=len;
				result =s;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		System.out.println(getLargestword(inputString));
	}


}

