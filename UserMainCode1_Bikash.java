package test;

import java.util.Scanner;

public class UserMainCode1_Bikash {
	public static int sumOfSquaresOfEvenDigits(int n) {
		int sumOfEvenDigit=0;
		int lastDigit=0;
		while(n!=0) {
			lastDigit=n%10;
			if(lastDigit%2==0) {
				sumOfEvenDigit+=lastDigit*lastDigit;
			}
			n/=10;
		}
		return sumOfEvenDigit;
	}



	public static void main(String[] args) {
		System.out.println("Enter a Positive Integer");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int number1=sumOfSquaresOfEvenDigits(number);
		System.out.println(number1);
	}

}
