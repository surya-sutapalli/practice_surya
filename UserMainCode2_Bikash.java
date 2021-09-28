package test;

import java.util.Scanner;

public class UserMainCode2_Bikash {
	public static int addAndReverse(int arr[],int n) {
		int sum=0, result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>n)
				sum+=arr[i];
			
		}
		while(sum>0) {
			result=result*10+sum%10;
			sum=sum/10;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("enter number of elements ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter element "+i);
			a[i]=sc.nextInt();
		}
		System.out.println("enter a num");
		int num=sc.nextInt();
		System.out.println(addAndReverse(a, num));
	}
}
