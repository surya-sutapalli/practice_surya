import java.util.Scanner;

public class UserMainCode 
{
	static String getLargestWord(String s)
	{
		String crr[] = s.split(" ");
		String largest = crr[0];
		for(int i=1; i<crr.length; i++)
		{
			String s1 = crr[i];
			if (s1.length()>largest.length())
			{
				largest = s1;
			}
			else if(s1.length()==largest.length())
			{
				largest = largest;
			}
		}
		return largest;	
	}


	public static void main(String[] args)
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s= sc.nextLine();
		UserMainCode obj = new UserMainCode();
		System.out.println(obj.getLargestWord(s));
	}
}