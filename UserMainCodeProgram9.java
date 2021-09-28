package Test_Work;
/* Program Author= Rahul Saxena Batch1
   Find the Array Sum and Then Reverse the Sum of An Array
*/
import java.util.Scanner;

public class UserMainCodeProgram9 {
	
	public static int addandreverse(int a[],int n) { //Method which sum the array and reverse it;
		int sum=0;
		for(int i=0;i<a.length;i++) { //Loop which sum the array
			if(a[i]>n) { //Condition which finds the number greater than n
				sum+=a[i];//Find the sum of the array
			}
		}
		//System.out.println(sum); Debug
		int reverse=0;
		while(sum>0) { //Loop which reverse the sum 
			int d;
			d=sum%10;
			reverse=reverse*10+d; //Find the reverse of Sum Array
			sum=sum/10;
		}
		
		return reverse; //return the reverse Answer
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")//Helps to Deals with Complier Errors
		Scanner s=new Scanner(System.in); //Takes the input from the user
		System.out.println("Enter the number of Elements in the Array");
		int n=s.nextInt();
		int []a=new int[n];
		int count=1;
		for(int i=0;i<n;i++) {//Takes all the input for the Array
			
			System.out.println("Enter the Element for the Array "+count);
			int y=s.nextInt();
			count++;
			a[i]=y;
			
		}
		System.out.println("Enter the number above which the Sum has to be Done");
		int check=s.nextInt();//Takes the Number above which we have to take the sum
		int ans=(addandreverse(a,check));
		System.out.println("Solution the Element "+ans);//Display the Output

	}

}
