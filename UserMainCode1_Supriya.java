import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public void check()
	{
		String s1="how are you you are how";
		List<String> l=new ArrayList<String>();
		
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens())
		{
		String s2=t.nextToken();
		l.add(s2);
		}
		String s3=l.get(0);
		String s4=l.get(l.size()-1);
		if(s3.equals(s4))
		{
		int n=s3.length();
		System.out.println(n);
		}
		else
		{
		int n1=s3.length();
		int n2=s4.length();
		System.out.println(n1+n2);
		}
	}


	public static void main(String[] args)
	{
		
		Main m1 = new Main();
		m1.check();
		
	}
}

