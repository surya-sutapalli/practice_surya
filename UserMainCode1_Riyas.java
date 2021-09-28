import java.util.Scanner;

class MainCode1{
	public static String getLargestWord(String str) {
		String arr[]=str.split("\\s+");
		int l=0;
		String longestWord=null;
		for(String brr:arr) {
			if(brr.length()>l) {
				l=brr.length();
				longestWord =brr;

			}
		}return longestWord;

	}

}
public class UserMainCode1_Riyas {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String longestWord=MainCode1.getLargestWord(str);
		System.out.println(longestWord);


	}

}
