import java.util.*;
public class UserMainCode5_basavaraj
{
	static void sosed(int a)
	{
		int num1=a,sq=0,num2;
		while(num1!=0)
		{
			num2=num1%10;
			if(num1%2==0)
			{
				sq=num2*num2+(sq);
			}
			num1=num1/10;
		}
		System.out.println("sum of squares of even digits is:"+sq);
	}
	

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int p=input.nextInt();
		
		UserMainCode5_basavaraj.sosed(p);
		

	}
	

}
