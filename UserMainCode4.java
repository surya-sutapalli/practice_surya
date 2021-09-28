import java.util.Scanner;
public class UserMainCode4
{
	public static String  formNewWord(String str,int n)
	{
		StringBuffer sb=new StringBuffer();
		
		sb.append(str.substring(0,n));
		sb.append(str.substring(str.length()-n));
		return sb.toString();
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
	
		System.out.println(UserMainCode4.formNewWord(s,n));
		}

	
}

