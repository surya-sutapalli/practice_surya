import java.util.Scanner;
public class UserMainCode7_Sindhu{
	public static int validatePassword(String s) {
		int f = 0;
		if(s.length()>=6 && s.length()<=20) {
			char[] a= s.toCharArray();
			for(char c:a) {
				if(Character.isDigit(c)) {
					if(s.contains("@") || s.contains("$") || s.contains("#")) {
						f=1;
					}
					else
						f=-1;
				}
			}
		}
		else {
			f=-1;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int flag = validatePassword(str);
		if(flag==1) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		sc.close();
	}

}
