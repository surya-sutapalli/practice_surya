import java.util.*;
public class UserMainCode2 {

	static String formNewWord(String s,int n)
	{
		int len=s.length();
		String new1=s.substring(0,n);
		String new2=s.substring(len-n,len);

		String new3=new1+new2;

		String new4=new3.substring(0,1).toUpperCase();
		String new5=new3.substring(1, new3.length());


		return new4+new5;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a String");
		String pass_str=sc.next();

		System.out.println("Enter the splitting number");
		int pass_num=sc.nextInt();

		String get=UserMainCode2.formNewWord(pass_str, pass_num);

		System.out.println(get);
	}

}
