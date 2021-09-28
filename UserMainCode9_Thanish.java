import java.util.Scanner;

public class UserMainCode9_Thanish 
{
	public static int addAndReverse(int arr[], int num)
	{
		int s = 0, rem;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>num)
			{
				s = s + arr[i];
			}
		}
		System.out.println(s);

		int s1 =0;
		while(s!=0)
		{
			rem = s % 10;
			s1 = (s1*10) + rem;
			s = s / 10;
		}
		return s1;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements to enter in a array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elemnts");
		for(int i=0; i<n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number");
		int num = sc.nextInt();
		UserMainCode9_Thanish obj = new UserMainCode9_Thanish();
		System.out.println(obj.addAndReverse(arr,num));


	}

}
