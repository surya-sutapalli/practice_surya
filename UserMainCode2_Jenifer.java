
import java.util.Scanner;

public class UserMainCode2_Jenifer {
	public static int sumofsquaresofevendigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
		
		int lastdigit=n%10;
		if((lastdigit%2)==0)
		{
			int sqr=(lastdigit)*(lastdigit);
			sum=sum+sqr;
			
		}
		n=n/10;
	}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Enter number");
				UserMainCode2_Jenifer s=new UserMainCode2_Jenifer();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=s.sumofsquaresofevendigit(n);
		System.out.println(result);
		

		

	}

}
