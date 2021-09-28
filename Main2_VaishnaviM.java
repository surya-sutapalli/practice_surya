package vaishu;

import java.util.Scanner;

public class Main2_VaishnaviM {
public static void formNewWord(String str,int n)
{
	StringBuffer obj=new StringBuffer();
	obj.append(str.substring(0,n));
	int len=str.length()-n;
	obj.append(str.substring(len,str.length()));
	String o=obj.toString();
	System.out.println(o);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
System.out.println("Enter positive integer:");
int s1=sc.nextInt();
Main2_VaishnaviM.formNewWord(str,s1);
	}

}
