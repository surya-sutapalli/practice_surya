import java.util.Scanner;

class UserMainCode2
{
	public static String formNewWord(String word,int number)
	{
		String newword = "";
		if(number>0)
		{
			newword+=Character.toString(word.charAt(0)).toUpperCase();
			newword+=word.substring(1,number);
			newword+=word.substring((word.length()-number),word.length());				
		}
		
		return newword;
	}
}

public class UserMainCode2_sivalingam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//California 3
		//this 1
		
		//System.out.println("Enter a string");
		String s = sc.next();		
		//System.out.println("Enter a number");
		int number = sc.nextInt();
		
		System.out.println(UserMainCode2.formNewWord(s, number));		

	}

}
