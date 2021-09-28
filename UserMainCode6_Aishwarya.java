import java.util.Scanner;
public class UserMainCode6_Aishwarya {

	public static int check(String str)
	{
		String st[]=str.split(" ");
				int len;int start = 0;
				int end=st.length-1;
				if(st[start].equals(st[end]))
				{

				len=st[start].length();
				}
				else
				{
				len=st[start].length()+st[end].length();
		}
				return len;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		UserMainCode6_Aishwarya obj=new UserMainCode6_Aishwarya();
		System.out.println(obj.check(str));
	}
}