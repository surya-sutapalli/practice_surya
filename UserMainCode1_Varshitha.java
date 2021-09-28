import java.util.Scanner;

public class UserMainCode1_Varshitha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int n = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		String s2 = s1.substring(0,n);;
		String s3 = s1.substring(s1.length()-n,s1.length());

		sb.append(s2).append(s3);
		System.out.println(sb.toString());

		// TODO Auto-generated method stub

	}

}
