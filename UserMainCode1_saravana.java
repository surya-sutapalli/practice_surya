package test;
import java.util.*;
public class UserMainCode1_saravana {
	public static String getLargest(String s)
	{
		int maximum=0;
		String s3=new String();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
			String s4 = st.nextToken();
			int len = s4.length();
			if(len>maximum)
			{
				maximum = len;
				s3=s4;
			}
		}
		return s3;
	}

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		String s2=UserMainCode1_saravana.getLargest(s);
		System.out.println(s2);

	}

}
