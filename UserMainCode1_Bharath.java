package com.programs1;
import java.util.Scanner;

class UserMainCode{
	static String getLargestWord(String s) {
		int max=0;
		String s3=null;
		String [] s1=s.split(" ");
		for(String s2:s1) {
			if(s2.length()>max) {
				max=s2.length();
				s3=s2;
			}
		}
		return s3;
	}
}
public class UserMainCode1_Bharath {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=UserMainCode.getLargestWord(s);
		System.out.println(s1);
		sc.close();
	}

}
