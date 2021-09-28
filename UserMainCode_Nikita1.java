import java.util.Scanner;

public class UserMainCode_Nikita1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int n1 = sc.nextInt();


		System.out.println(subStringOfgivenString(s1,n1));
	}
	public static String subStringOfgivenString(String s1, int n1)
	{
		int n = 2*n1;
		String s = new String();
		if(s1.length()>n)
		{
			s = s1.substring(0,n1) + s1.substring(s1.length()-n1, s1.length());
			return s;
		}
		else
			return null;
	}





}


