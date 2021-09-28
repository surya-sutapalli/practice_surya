import java.util.Scanner;

public class sharook_9 {

	static class UserMainCode
	{
		public static  String addAndReverse(int arr[],int number)
		{
			int sum=0;
			for(int inputarray : arr)
			{
				if(inputarray>number)
				{
					sum+=inputarray;
				}
			}
			StringBuffer revnumber = new StringBuffer(Integer.toString(sum));
			revnumber.reverse();

			return revnumber.toString();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of inputs");
		int size=sc.nextInt();
		int inputarr[] = new int[size];
		for(int i=0;i<size;i++) {
			inputarr[i] = sc.nextInt();
		}
		int number = sc.nextInt();
		System.out.println(UserMainCode.addAndReverse(inputarr, number));	
	}
}
