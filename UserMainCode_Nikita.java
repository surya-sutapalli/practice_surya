package Demo;
import java.util.Scanner;

public class UserMainCode_Nikita {
	static Scanner sc = new Scanner(System.in);

	public static class MainCode {
		static String formNewWord(String str, int n) {
			String s1 = str.substring(0, n);
			String s2 = str.substring(str.length() - n);
			String s3 = s1.concat(s2);

			return s3;
		}
	}

	public static void main(String[] args) {
		System.out.println("Input A String : ");
		String a = sc.next();
		System.out.println("Input a Number : ");
		int n = sc.nextInt();

		String s3 = MainCode.formNewWord(a, n);
		char s = s3.charAt(0);
		char ch = Character.toUpperCase(s);
		String f = s3.substring(1, s3.length());
		System.out.println("Output : " + ch + f);

	}
}