import java.util.Scanner;
class MainCode2{
	public static String formNewWord(String str,int n) {
		int l=str.length()-1;
		int h=l-n;
		String s1=str.substring(0, n);
		String s2=str.substring(h+1,l+1);
		String newWord=s1.concat(s2);
		return newWord;


	}
}

public class UserMaincode2_Riyas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		String newWord=MainCode2.formNewWord(str, n);
		System.out.println(newWord);


	}

}
