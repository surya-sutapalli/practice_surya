package tests;

import java.util.Scanner;

public class Harsh3 {
	static Scanner sc = new Scanner(System.in);

	public static class UserMainCode {
		static int addAndReverse(int[] arr, int n) {
			int sum = 0;
			int a = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == n) {
					a = i;
				}
			}
			for (int i = a + 1; i < arr.length; i++) {
				sum += arr[i];
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter The Number of Elements : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + i + " Element ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Input a Number : ");
		int n = sc.nextInt();
		int f = UserMainCode.addAndReverse(arr, n);
		int reverse = 0;
		while (f != 0) {
			int remainder = f % 10;
			reverse = reverse * 10 + remainder;
			f = f / 10;
		}

		System.out.println("Output : " + reverse);
	}
}
