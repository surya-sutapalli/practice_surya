package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class UserMainCode3_Anoop 
{
	public static int theHashValueAre(HashMap<Integer, Integer> h1)
	{
		ArrayList<Integer> first = new ArrayList<Integer>();
		int flag = 0;
		Iterator<Integer> it = h1.keySet().iterator();
		while (it.hasNext()) 
		{
			int x = it.next();
			first.add(h1.get(x));
		}
		return flag;
	
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int cc = sc.nextInt();
		HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
		for (int i = 0; i < cc; i++) 
		{
			h1.put(sc.nextInt(), sc.nextInt());
		}
		System.out.println(theHashValueAre(h1));
		sc.close();
	}
	
}
