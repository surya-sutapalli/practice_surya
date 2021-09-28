package tests;

import java.util.Scanner;

public class Harsh2 {
	static Scanner sc = new Scanner(System.in);

	public static class UserMainCode {
		static int validatePassword(String a) {
			int cond = 0;
			if (6 <= a.length() && a.length() <= 20) {
				cond++;
			}
			char[] arr = a.toCharArray();

			for (char ch : arr) {
				if (ch == '@' || ch == '#' || ch == '$') {
					cond++;
					break;
				}
			}
			for (char ch : arr) {
				if (Character.isDigit(ch)) {
					cond++;
					break;
				}
			}
			if (cond == 3) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter Password : ");
		String str = sc.next();
		int check = UserMainCode.validatePassword(str);
		if (check == 1) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	}
}
