import java.util.Scanner;

public class UserMainCode1_Deviyani 
{
	public static String getLargestWord(String s)
	{
		int flag=0;
		int large=0;
		String s3=null;
		String [] s1=s.split(" ");
		for(String s2:s1) {
			if(s2.length()>large) {
				if(s2.length()==large) {
					flag =1;
					continue;
				}
				large =s2.length();
				s3=s2;
			}
		}
		if(flag==1){
			return s1[0];
		}
		return s3;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1=UserMainCode1_Deviyani.getLargestWord(s);
		System.out.println(s1);

	}
}
