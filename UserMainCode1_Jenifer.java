import java.util.*;
public class UserMainCode1_Jenifer {
	public static String getLargestWord(String s)
	   
	{
		//String st;
		String split[]=s.split(" ");
		String largestword=split[0];
		for(int i=1;i<split.length;i++)
		{
			String s1=split[i];
			if(s1.length()>largestword.length())
			{
				largestword=s1;
			}
			else
			{
				largestword=largestword;
			}
			
		}
		return largestword;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserMainCode1_Jenifer ls=new UserMainCode1_Jenifer();
		System.out.println("Enter the String name");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		String ans=ls.getLargestWord(s);
		System.out.println(ans);

	}

}
