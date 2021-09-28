import java.util.*;

public class UserMainCode {
	
	public static void  getLargestWord(String s)
	{
		int x=0;
		String p=null;
		String a[]=s.split(" ");
		for(String r:a)
		{
			if(r.length()>x)
			{
				x=r.length();
				p=r;
			}
				
		}
		System.out.println(p);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence:");
		String s=sc.nextLine();
		
		UserMainCode r=new UserMainCode();
		r.getLargestWord(s);
				
	}
	
	}

