import java.util.Scanner;

public class UserMainCode1 {
	public static void formNewWord(String s,int n)
	{
		StringBuffer obj=new StringBuffer();
		obj.append(s.substring(0,n));
		int l=s.length()-n;
		obj.append(s.substring(l,s.length()));
		String o=obj.toString();
		System.out.println(o);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("enter the postive integer");
		int s1=sc.nextInt();
		UserMainCode1.formNewWord(s,s1);
		

	}


}