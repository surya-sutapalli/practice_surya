//question 4 by Harshitha

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class SortbyaccBalance1 implements Comparator<Bank1_Harshitha>
{

	@Override
	public int compare(Bank1_Harshitha x, Bank1_Harshitha y) {
		return x.accBalance-y.accBalance;
	}
	
}

public class Bank1_Harshitha {
	int accId;
	String accName;
	String accBank;
	int accBalance;
	public Bank1_Harshitha(int accId,String accName,String accBank,int accBalance)
	{
		this.accId=accId;
		this.accName=accName;
		this.accBank=accBank;
		this.accBalance=accBalance;	
	}
	public void getDetails()
	{
		System.out.println(accId+"--"+accName+"--"+accBank+"--"+accBalance);
	}

	public static void main(String[] args) {
		ArrayList<Bank1_Harshitha> obj=new ArrayList<Bank1_Harshitha>();
		Bank1_Harshitha b1=new Bank1_Harshitha(101,"Harshitha","SBI",5000);
		Bank1_Harshitha b2=new Bank1_Harshitha(102,"Mahitha","Andhra",6000);
		Bank1_Harshitha b3=new Bank1_Harshitha(103,"Manasa","Canara",2000);
		Bank1_Harshitha b4=new Bank1_Harshitha(104,"Sameera","Axis",500);
		Bank1_Harshitha b5=new Bank1_Harshitha(105,"Shilpa","ICIC",200);

		
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		Collections.sort(obj,new SortbyaccBalance1());
		

		
		Iterator<Bank1_Harshitha> itr=obj.iterator();
		while(itr.hasNext())
		{
			Bank1_Harshitha bb=itr.next();
			bb.getDetails();
		}	
	}

}
