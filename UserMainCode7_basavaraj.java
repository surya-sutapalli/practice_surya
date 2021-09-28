import java.util.Scanner;
class UserMainCode7_basavaraj
{
	public static int validatepass(String s)
	{
		int f=0;
		if(s.length()>=6 && s.length()<=20)
		{
			char[] a=s.toCharArray();
			for(char c: a)
			{
				if(Character.isDigit(c))
				{
					if(s.contains("@")||s.contains("$")|| s.contains("#"))
					{
						f=1;
					}
					else
						f=0;
				}
			}
		}
		else
			f=0;
		return f;
	}





	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a password");
			String str = sc.nextLine();
			int flag= UserMainCode7_basavaraj.validatepass(str);
			if(flag==1)
			{
				System.out.println("Valid password");
			}
			else
				System.out.println("Invalid password");
	}
}

	
	


