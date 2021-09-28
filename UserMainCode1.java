import java.util.*;
public class UserMainCode1 {
  public static int getLowest(HashMap<Integer,Integer> h)
  { int sum=0,i=0;
  int a[]= new int[h.size()];
     Set<Integer> s= h.keySet();
     Iterator<Integer> it= s.iterator();
     while(it.hasNext())
     {
    	 int key=it.next();
    	 a[i++]=(int)h.get(key);
     }
    Arrays.sort(a);
    for(int j=0;j<3;j++)
    {
    	sum+=a[j];
     }
	return sum;  
  }
	public static void main(String[] args) {
     HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter size of hashmap");
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
    	 System.out.println("Enter student rollnumber");
    	 int num=sc.nextInt();
    	 System.out.println("Enter marks");
    	 int mark=sc.nextInt();
    	 h.put(num, mark);
     }
     //System.out.println(h);
    int result= UserMainCode1.getLowest(h);
    System.out.println("Sum of lowest 3 marks: "+result);
    sc.close();
	}  

}
