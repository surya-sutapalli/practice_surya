package Test;
import java.util.*;
class UserMainCode
{
	public static void getLargestWord(String input)
	{
		int maxLength=0;
		String output=" ";
		String arr[]=input.split(" ");
		for(String brr:arr)
		{
			if(brr.length()>maxLength)
			{
				maxLength=brr.length();
				output=brr;
			}
		}
		System.out.println(output);
	}

}
public class Main 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		UserMainCode.getLargestWord(input);
	}
}
