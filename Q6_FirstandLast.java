import java.util.Scanner;
class Q6_UserMainCode {
	public static int check(String s) {
		String arr[] = s.split(" ");
		int n = arr.length;
		if(arr[0].equals(arr[n-1])) {
			String str = arr[0];
			return str.length();
		}
		else {
			String a = arr[0];
			String b = arr[n-1];
			return a.length()+b.length();
		}
	}
}
public class Q6_FirstandLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = Q6_UserMainCode.check(str);
		System.out.println(n);
		sc.close();
	}
}
