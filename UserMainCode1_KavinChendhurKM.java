import java.util.*;
public class UserMainCode1_KavinChendhurKM {
	
   static String getLargestWord(String s)
   {
	   int lar=0;
	   String[] comp=s.split(" ");
	   for(int i=0;i<comp.length;i++)
	   {
		   for(int j=i+1;i<comp.length;i++)
		   if(comp[i].length()>comp[j].length())
		 {
			 lar=i;
		 }
	   }
	  
	   
	   
	   
	   return comp[lar];
   }
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		s=sc.nextLine();
		
		String lar=UserMainCode1_KavinChendhurKM.getLargestWord(s);
		System.out.println(lar);
	}

}
