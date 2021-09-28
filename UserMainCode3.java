import java.util.*;


public class UserMainCode3 {
	public static int validatepassword(String s)
	{
		char ch ;
		int len=s.length();
		int digitcond=0;
		int spclcond=0;
		if(len>=6&&len<=20)
		{
		for(int i=0; i<s.length(); i++) {
			ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				digitcond=1;
				break;
			}
		}
			if(s.contains("@")||s.contains("#")||s.contains("$"))
			{
				spclcond=1;
			}
			if(digitcond==1&&spclcond==1)
			{
				return 1;
			}
			

		}
		else
		{
			return 0;
		}
		
		
		return 0;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int res=UserMainCode3.validatepassword(s);
		if(res==1)
		{
			System.out.println("valid password");
		}
		else
		{
			System.out.println("invalid password");
		}
	}
}
