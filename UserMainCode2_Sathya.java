import java.util.Scanner;

public class UserMainCode2_Sathya {
	public static String formNewWord(String str,int n)
	{
		String nw = null,s1,s2;
		int length= str.length();
		if(length%2 == 0 && length >= (2*n))
		{
		s1= str.substring(0,n);
		s2= str.substring(length-n, length);
		nw= s1+s2; 
		}
		else
		{
			System.out.println("String length is not even Or it is not twice as n");
		}
		return nw;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.next();
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		System.out.println(UserMainCode2_Sathya.formNewWord(s, n));
	}

}
