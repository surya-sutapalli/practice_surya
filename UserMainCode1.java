import java.util.Scanner;

public class UserMainCode1 {
	public static int addandreverse(int brr[],int n2)
	{
		int sum=0;
		int rev=0;
		for(int num:brr)
		{
			if(num>n2)
			{
				sum+=num;
			}
		}
		System.out.println(sum);
				
				
			while(sum!=0)
			{
				int rem=sum%10;
			    rev=rev*10+rem;
				sum=sum/10;
			}
			return rev;
			
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter number of elements in an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element:");
		int n2=sc.nextInt();
		UserMainCode1 obj=new UserMainCode1();
		System.out.println(obj.addandreverse(arr, n2));
	

	}

}
