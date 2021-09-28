import java.util.Scanner;

public class UserMainCode_Aditi {
	 public static int findEvenDigitSum(int number) {
		
		 int lastDigit;
		 int evenDigitSum = 0;
		 while(number!=0) {
			 lastDigit = number%10;
			 if(lastDigit % 2 == 0) {
			       evenDigitSum += lastDigit*lastDigit;
			       
			 }
		 number = number / 10;
			   }
			   
			return evenDigitSum;
			 }
	 public static void main(String[] args) {
		 int number = 0;
	     int sumOfEvenDigits = 0;
	     Scanner sc= new Scanner(System.in);
	     System.out.print("Enter an integer number:: ");
	     int number1 = sc.nextInt();
	     sumOfEvenDigits = findEvenDigitSum(number1);
	     UserMainCode_Aditi obj = new UserMainCode_Aditi();
	     obj.findEvenDigitSum(number);
	     System.out.println("The sum of even digits of the number "+number1+" = "+ sumOfEvenDigits);
  
 
}
} 