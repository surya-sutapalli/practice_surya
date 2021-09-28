import java.util.*;
class Main{
	public void getValues(Scanner sc)
	{
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println("Enter the Number of character");
		int n=sc.nextInt();

		String newstring= UserMainCode1_VaishnaviV.formNewWord(str,n);
		System.out.println("New string created is : "+newstring);
	}


}


public class UserMainCode1_VaishnaviV {  
	public static String formNewWord(String s,int n)
	{
       int len=n*2;
       String s1=" ",s2=" ";
       if(s.length()%2==0 && s.length()>=len)
       {
		
		s1=s.substring(0,n);
		int length=s.length();
		s2=s.substring(length-n,length);
		
       }
       else
       {
    	   System.out.println("Stringthlength should be even");
       }
       return s1+s2;
       
       
		
	
}
	
public static void main(String[] args) {
	Main m=new Main();
	Scanner sc=new Scanner(System.in);
	m.getValues(sc);

}

}
