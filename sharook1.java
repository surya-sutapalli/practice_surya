import java.util.Scanner;

public class sharook1 {
	static class UserMainCode{
		public static String getLargestWord(String str) {
			String arr[] = str.split("\\s+");
			int i =0;
			String longestword = null;
			for(String brr:arr) {
				if(brr.length()>1) {
				i=brr.length();
				longestword = brr;
			}
		}return longestword;
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String longestword = UserMainCode.getLargestWord(str);
		System.out.println(longestword);
		

	}

}
