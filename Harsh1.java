package tests;

import java.util.Scanner;

public class Harsh1 {
	static Scanner sc = new Scanner(System.in);

	public static class UserMainCode {
		static String formNewWord(String str, int n) {
			String first = str.substring(0, n);
			String last = str.substring(str.length() - n);
			String result = first.concat(last);

			return result;
		}
	}

	public static void main(String[] args) {
		System.out.println("Input A String : ");
		String a = sc.next();
		System.out.println("Input a Number : ");
		int n = sc.nextInt();

		String result = UserMainCode.formNewWord(a, n);
		char s = result.charAt(0);
		char ch = Character.toUpperCase(s);
		String f = result.substring(1, result.length());
		System.out.println("Output : " + ch + f);

	}
}
