package vaishu;
import java.util.*;
class UserMainCode
{
	public static void getLargestWord(String s)
	{
		int max=0;
		String res=null;
		String a[]=s.split(" ");
		for(String b:a)
		{
			if(b.length()>max)
			{
				max=b.length();
				res=b;
			}
		}
		System.out.println(res);
	}
}
public class Main1_VaishnaviM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String : ");
String str=sc.nextLine();
UserMainCode.getLargestWord(str);
	}

}
