import java.util.*;
public class UserMainCode_Nikita2 {

	public static void main(String[] args) {


		String[] s1={"Kerala","Gujrat","Goa"};
		getStateId(s1);
	}
	public static void getStateId(String[] s1)
	{
		HashMap<String, String> h = new HashMap<String, String>();
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		for(String s : s1)
			l1.add(s.toUpperCase().substring(0,3));
		for(String s : s1)
			l2.add(s);
		for(int i=0;i<s1.length;i++)
		{
			h.put(l1.get(i),l2.get(i));
		}
		
		for(Map.Entry<String, String> ans: h.entrySet())
		{
			System.out.println(ans.getKey()+":"+ans.getValue());
		}
	}


}


