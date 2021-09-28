import java.util.Scanner;
public class UserMainCode9_Dhibiya {
	public static int addAndReverse(int brr[], int a)
	{
		int sum = 0, rem;
		for(int i = 0 ; i < brr.length ; i++)
		{
			if(brr[i] > a )
				sum += brr[i];
		}
		//System.out.println("Sum of the array : " +sum);
		
		int sum1 = 0;
		while(sum!=0)
		{
			rem = sum %10;
			sum1 = sum1*10 + rem;
			sum /= 10;
		}
		return sum1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be enetred in an array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the element : ");
		for(int i = 0 ; i < num ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter an element to compare : ");
		int com = sc.nextInt();
		
		UserMainCode9_Dhibiya um = new UserMainCode9_Dhibiya();
		System.out.println(um.addAndReverse(arr,com));
	}

}
