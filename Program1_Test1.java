import java.util.Scanner;

class UserMainCode1{
	public static String getLarWord(String str)
	{
		int flg= 0;
		int max=0;
		String s3 = "";
		String[] st = str.split(" ");
		for(String s2:st)
		{
			if(s2.length()>max )
			{
				if(s2.length()==max) {
			
			
				flg=1;
				continue;
			}	
			max=s2.length();
			s3=s2;
		}
		}
		
		if(flg==1)
		{
			System.out.println();
		}
		return s3;
				
	}
}

public class Program1_Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		
		String str = sc.nextLine();
		
		System.out.println(UserMainCode1.getLarWord(str));
	}

}