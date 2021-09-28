import java.util.Scanner;

public class UserMainCode6_Dhibiya {
	
	public static int check(String s)
	{
		String[] a = s.split(" ");
		int totallength;
		int start = 0;
		int end = a.length - 1;
		if(a[start].equalsIgnoreCase(a[end]))
			totallength = a[start].length();
		else
			totallength = a[start].length() + a[end].length();
		return totallength;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		UserMainCode6_Dhibiya um = new UserMainCode6_Dhibiya();
		System.out.println(um.check(str));
		
	}

}
