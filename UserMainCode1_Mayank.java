
public class UserMainCode1_Mayank {
	public static String longestWord(String s) {
		String[] str = s.split(" ");
		String max=null;
		for(int i=0;i<str.length-1;i++) {
			if(str[i].length()> str[i+1].length())
				max = str[i];
			else if(str[i].length()==str[i+1].length())
				max=str[i];
			else
				max=str[i+1];
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(UserMainCode1_Mayank.longestWord("Welcome to the world of Programming"));
		System.out.println(UserMainCode1_Mayank.longestWord("abc def"));
		

	}

}
