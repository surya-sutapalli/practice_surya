
import java.util.Scanner;

class Main{
	public static String getLargestWord(String str) {
		String chan[]=str.split(" ");
		int t=0;
		String long_Word=null;
		for(String arr:chan) {
			if(arr.length()>t) {
				t=arr.length();
				long_Word =arr;

			}
		}return long_Word;

	}

}
public class UserMainCode1_chandanaP{


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine();
		String long_Word=Main.getLargestWord(st1);
		System.out.println(long_Word);


	}
}
