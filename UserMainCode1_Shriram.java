
public class UserMainCode1_Shriram {

	public static int sumOfSquareOfEvenDigits(int num)
	{
		int sum=0;

		int n=0;
		while(num!=0)
		{
			n=num%10;
			if((n%2)==0)
				sum+= (n*n);
			num/=10;
		}

		return sum;
	}

}
