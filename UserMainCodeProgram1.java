package Test_Work;
/* Program Author= Rahul Saxena Batch1
   Take the String and Then Find The LargestWord in the String
   
   Using the String Token Because it Helps us To Manipulate The String Easily
*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class UserMainCodeProgram1 {
	
	public static String getLargestWord(String str) {
		int max=0;//Helps to Find the MaxWord
		String ans=new String();//For Accessing the String
		StringTokenizer traverse=new StringTokenizer(str," "); //Divides the String into Tokens when Spaces Comes
		while(traverse.hasMoreTokens()){//Traverse the Each String
				String check=traverse.nextToken();//Check the EachToken
				int compare=check.length();
				if(compare>max){ //Finds the LargestWord 
									//Also help us to Fetch the FirstLongestWord in case of Same WordLength
				max=compare;
				ans=check;
			}
		}
		return ans;//Return the LargestWord
		}
		

	public static void main(String[] args) {
		@SuppressWarnings("resource")//Helps to Deals with Complier Errors
		Scanner s=new Scanner(System.in);//Takes the input
		String ss=s.nextLine();//Take the String Input from the User
		if(ss.length()<100) {//Check the Length of the String
			System.out.println(getLargestWord(ss));//Execute when the Length of the String less than 100
		}
		else {
			System.out.println("Take the String which is less than 100 Character");
		}
	}

}
