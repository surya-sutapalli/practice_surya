package AbhishekSingh;
//2
public class UserMainCode2_Abhishek_Singh
{
	public static void formNewWord(String str,int pnum) 
	{

		int l=str.length();
		if(l%2==0 && l>=2*pnum) {
			String str1=str.substring(0, pnum);
			String str2=str.substring(l-pnum, l);
			System.out.println(str1+str2);
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
