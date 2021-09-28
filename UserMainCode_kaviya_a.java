import java.util.Scanner;

public class UserMainCode_kaviya_a {
	public static String getLargestWord(String str)
	{
	String arr[]=str.split("\\s+");
	int t=0;
	String longestWord=null;
	for(String brr:arr)
	{
		if(brr.length()>t)
		{
			t=brr.length();
			longestWord=brr;
		}
	}
	return longestWord;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		UserMainCode_kaviya_a obj = new UserMainCode_kaviya_a();
		String longestWord = obj.getLargestWord(s);
		System.out.println(longestWord);
	}
		
	}