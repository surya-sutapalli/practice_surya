package Assesment;
import java.util.Scanner;
public class UserMainCode {
	public static int addAndReverse(int crr[],int x)
	{
		int s=0,r;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>x)
				s+=crr[i];
		}
		System.out.println(s);
		int org=s,s1=0;
		while(s!=0)
		{
			r=s%10;
			s1=s1*10+r;
			s/=10;
			
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of elements that  in to array");
		int num = sc.nextInt();
		int brr[]=new int[num];
		System.out.println("Enter element");
	
		for(int i=0;i<num;i++)
		{
			brr[i]=sc.nextInt();
			
		}
		System.out.println("Enter element for compare");
		int o=sc.nextInt();
		
		System.out.println(UserMainCode.addAndReverse(brr,o));

	}

}
