package com.programs1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class UserMainCode10_Bharath {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		HashMap<Integer, Integer> h2=new HashMap<>();
		for(int i=1;i<=n;i++) {
			int key=sc.nextInt();
			String deg=sc.next();
			int salary=sc.nextInt();
			h1.put (key,deg);
			h2.put(key,salary);
		}
		HashMap<Integer,Integer> h3=increaseSalaries(h1,h2);
		h3.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		sc.close();

	}

	static HashMap<Integer, Integer> increaseSalaries(HashMap<Integer, String> h1, HashMap<Integer, Integer> h2) {
       HashMap<Integer,Integer> h3=new HashMap<Integer,Integer>();
		Iterator<Integer> i=h2.keySet().iterator();
		while(i.hasNext()) {
			Object o= i.next();
			Integer i1=(Integer) o;
			Integer inc= h2.get(o)+5000;
			h3.put(i1, inc);
		}
		return h3;

	}

}
