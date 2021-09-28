package Test;

import java.util.Scanner;

class UserMainCode1
{
	public static void formNewWord(String str,int num)
	{
		StringBuffer res=new StringBuffer();
		res.append(str.substring(0, num));
		int lastIndex=str.length()-num;
		res.append(str.substring(lastIndex, str.length()));
		String output=res.toString();
		System.out.println(output);
	}
}
public class Main2_Nandhini 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s=new Scanner(System.in);
			String str=s.next();
			int num=s.nextInt();
			UserMainCode1.formNewWord(str, num);

		}
		catch(Exception e)
		{
			System.out.println("Don't enter negative numbers");
		}
	}

}
