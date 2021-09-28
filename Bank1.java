import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class SortbyaccBalance1 implements Comparator<Bank1>
{

	@Override
	public int compare(Bank1 x, Bank1 y) {
		return x.accBalance-y.accBalance;
	}
	
}

public class Bank1 {
	int accId;
	String accName;
	String accBank;
	int accBalance;
	public Bank1(int accId,String accName,String accBank,int accBalance)
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
		ArrayList<Bank1> obj=new ArrayList<Bank1>();
		Bank1 b1=new Bank1(101,"Harshitha","SBI",5000);
		Bank1 b2=new Bank1(102,"Mahitha","Andhra",6000);
		Bank1 b3=new Bank1(103,"Manasa","Canara",2000);
		Bank1 b4=new Bank1(104,"Sameera","Axis",500);
		Bank1 b5=new Bank1(105,"Shilpa","ICIC",200);

		
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		Collections.sort(obj,new SortbyaccBalance1());
		

		
		Iterator<Bank1> itr=obj.iterator();
		while(itr.hasNext())
		{
			Bank1 bb=itr.next();
			bb.getDetails();
		}	
	}

}
