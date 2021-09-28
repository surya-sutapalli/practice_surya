import java.util.Scanner;

class UserMainCode1
{
	public static int addAndReverse(int arr[],int number)
	{
		int sum=0;
		for(int inparr : arr)
		{
			if(inparr>number)
			{					
				sum+=inparr;
			}
		}
		StringBuffer revnum = new StringBuffer(Integer.toString(sum));
		revnum.reverse();

		return Integer.parseInt(revnum.toString());
	}
}

public class UserMainCode1_sivalingam {	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//{10,15,20,25,30,100} 15

		//System.out.println("Enter the number of input");		
		int size=sc.nextInt();
		int inputarr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			//System.out.print("\nEnter num"+(i+1)+" ");
			inputarr[i] = sc.nextInt();
		}
		//System.out.println("\nEnter the number");
		int number = sc.nextInt();

		System.out.println(UserMainCode1.addAndReverse(inputarr, number));

	}

}
