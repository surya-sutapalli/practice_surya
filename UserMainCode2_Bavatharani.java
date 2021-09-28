//program 9.txt 
import java.util.Scanner;

public class UserMainCode2_Bavatharani {
	public static int addAndReverse(int arr[],int key)
	{
		int sum=0,rev=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>key)
				sum+=arr[i];
		}
		//System.out.println(sum);
		while(sum!=0)
		{
			int r=sum%10;
			rev=(rev*10)+r;
			sum/=10;
		}
	return rev;
	}
		public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter no.of.digits");
	    int n=sc.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("Enter array elements");
	    	a[i]=sc.nextInt();
	    }
	    System.out.println("Enter key element");
	    int key=sc.nextInt();
	    int result=UserMainCode2_Bavatharani.addAndReverse(a,key);
	    System.out.println("reverse of sum: "+result);
	    sc.close();
	    
		}
}
