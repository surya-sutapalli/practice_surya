import java.util.Scanner;

public class UserMainCode2_Deviyani {

		static String formNewWord(String s,int n)
		{
			int l=s.length();
			String s1=s.substring(0,n);
			String s2=s.substring(l-n,l);

			String s3=s1+s2;

			String s4=s3.substring(0,1).toUpperCase();
			String s5=s3.substring(1,s3.length());


			return s4+s5;
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a String");
			String pass_str=sc.next();

			System.out.println("Enter the split number");
			int pass_num=sc.nextInt();

			String get=UserMainCode2_Deviyani.formNewWord(pass_str, pass_num);

			System.out.println(get);
		}


}