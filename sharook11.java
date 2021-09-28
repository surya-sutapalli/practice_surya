import java.util.Scanner;

public class sharook11 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "Welcome to the world of programming";
		String s [] = s1.split(" ");
		int max =0;
		String maxword ="";
		for (String ss:s)
		{
			System.out.println(ss);
			if(max<ss.length())
			{
				maxword = ss;
				max =ss.length();
			}
		}
		System.out.println(maxword);
		
	}

}
