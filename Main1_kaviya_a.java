import java.util.Scanner;

public class Main1_kaviya_a {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int b=sc.nextInt();
		int arr[] = new int[b];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int number =sc.nextInt();
		UserMainCode1_kaviya_a obj=new UserMainCode1_kaviya_a();
		int result = obj.addAndReverse(arr, number);
		System.out.println(result);
		
	}

}
