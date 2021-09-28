package com.programs1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Bank{
	private int accId;
	private String accName;
	private String accBank;
	private Double accBalance;
	public Bank(int accId, String accName, String accBank, Double accBalance) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.accBank = accBank;
		this.accBalance = accBalance;
	}
	public Double getAccBalance() {
		return accBalance;
	}
	public void display() {
		System.out.println(this.accId+"--"+this.accName+"--"+this.accBank+"---"+this.accBalance);
	}
}
class sortBAccountBalance implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getAccBalance()-o2.getAccBalance());
	}

}

public class UserMainCode4_Bharath {
	public static void main(String[] args) {
		ArrayList<Bank> a=new ArrayList<>();
		Bank b1=new Bank(1, "Bharath", "HDFC", 10000.75);
		Bank b2=new Bank(2, "eswar", "AXIS", 1999.75);
		Bank b3=new Bank(3, "manash", "SBI", 200.75);
		Bank b4=new Bank(4, "ali", "andhra", 999.75);
		Bank b5=new Bank(5, "shubham", "kyb", 99.24);
		a.add(b1);
		a.add(b2);
		a.add(b3);
		a.add(b4);
		a.add(b5);
	    //decending order comparator used
		Collections.sort(a, new sortBAccountBalance() );
		Iterator<Bank> i=a.iterator();
		while(i.hasNext()) {
			Object o=i.next();
			Bank b=(Bank) o;
			b.display();
		}
		
		
	}

}
