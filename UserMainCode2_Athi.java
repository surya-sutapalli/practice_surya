//5th Program 

import java.util.Scanner;
public class UserMainCode2_Athi {
	public static int sumOfSquaresOfEvenDigits(int num)
	{
		int s=0;
		int l,square;
		
		 while(num!=0)
		 {
			 l=num%10;     
			 if(l%2==0)  
			 {
				 square =l*l;
				 s=s+square;
			 }
			 num=num/10;
		 }
		 return s;
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();
		
		UserMainCode2_Athi obj = new UserMainCode2_Athi();
		System.out.println(obj.sumOfSquaresOfEvenDigits(num));

}
}
