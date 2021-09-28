//9th program

import java.util.Scanner;

public class UserMainCode1_Athi {
	
	public static int addAndReverse(int a[],int r)
	{
		int sum=0,r1,rev=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>r)
			{
				sum=sum+a[i];
			}
		}
		
//reverse the sum	
		while(sum!=0)
		{
			r1=sum%10;
			rev=rev*10+r1;
			sum=sum/10;
			
		}
		return rev;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("No.of element ");
		int n = s.nextInt();
		
		int[] a = new int[10];
		System.out.println("Array Elements are ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		System.out.println("Element in an array ");
		int r = s.nextInt();
		
		UserMainCode1_Athi obj = new UserMainCode1_Athi();
		int res = obj.addAndReverse(a,r);
		System.out.println(res);

	}

}

