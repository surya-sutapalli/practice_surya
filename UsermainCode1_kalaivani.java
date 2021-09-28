import java.util.Scanner;

public class UsermainCode1_kalaivani {

	public static int check(String str)
	{
		String wrd[]=str.split(" ");
				int len;int start = 0;
				int end=wrd.length-1;
				if(wrd[start].equals(wrd[end]))
				{
					
				len=wrd[start].length();
				}
				else
				{
				len=wrd[start].length()+wrd[end].length();
		}
				return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		UsermainCode1_kalaivani obj=new UsermainCode1_kalaivani();
		System.out.println(obj.check(str));
	}

}
