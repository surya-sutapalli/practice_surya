import java.util.Scanner;

public class UserMainCode9_Sathya {
	public static int addAndReverse(int a[],int n)
	{
		int sum=0;
		for(int v:a)
		{
			if(v>n)
				sum+=v;
		}
		int rev=0;
		while(sum!=0)
		{
			int d= sum%10;
			rev= rev*10+d;
			sum/=10;
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		System.out.println(UserMainCode9_Sathya.addAndReverse(arr, num));

	}

}
