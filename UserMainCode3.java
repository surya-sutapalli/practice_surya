//Question number-3.
import java.util.*;
public class UserMainCode3 
{
	public static int getLowest(HashMap<Integer,Integer> h1) 
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int temp = 0;
		Iterator<Integer> itr = h1.keySet().iterator();
		while (itr.hasNext()) 
		{
			int value = itr.next();
			arraylist.add(h1.get(value));
		}
		Collections.sort(arraylist);
		temp = arraylist.get(0) + arraylist.get(1) + arraylist.get(2);
		return temp;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the size :");
		int n = scan.nextInt();
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		for (int i = 1; i <= n; i++) 
		{
			hashmap.put(scan.nextInt(), scan.nextInt());
		}
		System.out.println("Output "+getLowest(hashmap));
		scan.close();
	}

}