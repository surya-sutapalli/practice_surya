import java.util.Scanner; //Question Number-9.
public class UserMainCode2_Jagan
{
	public static int addAndReverse(int arr[],int number) {
		int sum=0;
		int  reverse = 0;
		for(int ab:arr) {
			if(ab>number) {
				sum+=ab;
			}
		}
		int number1 = sum;  
		while(number1 != 0)   
		{  
			int remainder = number1 % 10;  
			reverse = reverse * 10 + remainder;  
			number1 = number1/10;  
		}  
		return reverse;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the size of an array :");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			//System.out.println("Enter the "+(i+1)+" value :");
			arr[i]=scan.nextInt();
		}
		//System.out.println("Enter the number :");
		int number=scan.nextInt();
		int value=UserMainCode2_Jagan.addAndReverse(arr, number);
		System.out.println("Output :"+value);
		scan.close();
	}

}
