import java.util.Scanner;
class UserMainCode
{
	public static String formNewWord(String s,int n)
	{
		int len=2*n;
		String s1="";
		String s2="";
		String res;
		if(s.length()%2==0 && s.length()>=len )
		{

			for(int i=0;i<n;i++)
			{
				char ch=s.charAt(i);
				s1+=ch;
			}

			for(int j=s.length()-n;j<s.length();j++)
			{
				char ch1=s.charAt(j);
				s2+=ch1;
			}
		}
		else
		{
			System.out.println("length of string should be Even and greater than N value");
		}
		res =s1+s2;
		return res;
	}
}

public class Meera2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println("Enter N value");
		int n=sc.nextInt();
		String rstr=UserMainCode.formNewWord(str,n);
		System.out.println(rstr);


	}

}
