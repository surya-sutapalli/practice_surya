import java.util.Scanner;

public class Question5_Shriram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = in.nextInt();
		int ouput = UserMainCode1_Shriram.sumOfSquareOfEvenDigits(n);
		System.out.println(ouput);
		in.close();

	}

}
