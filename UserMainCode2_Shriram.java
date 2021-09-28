import java.util.Scanner;

public class UserMainCode2_Shriram {

	public static int validatePassword(String pass)
	{
		char arr[] = pass.toCharArray();
		int n =0, s=0;
		if(pass.length()>=6 && pass.length()<=20)
		{
			
			for(char ch:arr)
			{
				if(Character.isDigit(ch))
					n = 1;
				if(!Character.isLetterOrDigit(ch))
					s = 1;
			}
		}
		if((n+s)==2)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		//Question7 obj = new Question7();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String s = in.next();
		if(UserMainCode2_Shriram.validatePassword(s)==1)
		{
			System.out.println("Valid password");
		}
		else
			System.out.println("Invalid password");;
		in.close();
	}

}
