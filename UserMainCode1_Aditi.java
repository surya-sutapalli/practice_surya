import java.util.Scanner;

public class UserMainCode1_Aditi

{  public static void getLargestWord(String[] words, int length)
	{
	String small, large;
	small = large = words[0];  
    
    for(int k = 0; k < length; k++){  
           
        if(large.length() < words[k].length())  
            large = words[k];  
    }  
      System.out.println("Largest word: " + large);  
	}
    public static void main(String[] args){ 
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a String:");
        String string = sc.nextLine();
        String word = "", small = "", large="";  
        String[] words = new String[100];  
        int length = 0;  
          
        string = string + " ";  
          
        for(int i = 0; i < string.length(); i++){   
            if(string.charAt(i) != ' '){  
                word = word + string.charAt(i);  
            }  
            else{   
                words[length] = word;  
                length++; 
                word = "";  
            }  
        }
        getLargestWord(words,length);
          
    }  
}  