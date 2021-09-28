import java.util.*;
public class UserMainCode2_Sandeep {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = sc.nextLine();
		int a = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		String s2 = s1.substring(0,a);
		String s3 = s1.substring(s1.length()-a,s1.length());

		sb.append(s2).append(s3);
		System.out.println(sb.toString());


	}

}
