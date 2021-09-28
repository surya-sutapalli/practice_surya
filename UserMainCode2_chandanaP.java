package demopackage;

import java.util.Scanner;



class Main{

	public static String formNewWord(String s1,int n) {
		
		StringBuffer sb = new StringBuffer();

		String s2 = s1.substring(0,n);;
		String s3 = s1.substring(s1.length()-n,s1.length());

		StringBuffer sb1=sb.append(s2).append(s3);
		return sb1.toString();




	}

}
public class UserMainCode2_chandanaP{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String word=Main.formNewWord(s, n);
		System.out.println(word);
		
		
	}
}
