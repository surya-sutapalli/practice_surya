import java.util.Scanner;

public class UsermainCode {

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
		UsermainCode obj=new UsermainCode();
		System.out.println(obj.check(str));
		

				

	}

}
