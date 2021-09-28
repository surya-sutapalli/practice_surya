import java.util.*;

class SortByBankBal implements Comparator<Bank_shirisha>
{

	@Override
	public int compare(Bank_shirisha x, Bank_shirisha y) {
		
		return x.accbal-y.accbal;
	}
	
}

public class UserMainCode4 {

	public static void main(String[] args) {
		ArrayList<Bank_shirisha> obj=new ArrayList<Bank_shirisha>();
		Bank_shirisha b1=new Bank_shirisha(419,"Manisha","SBI",10000);
		Bank_shirisha b2=new Bank_shirisha(456,"Sanjana","HDGC",1500);
		Bank_shirisha b3=new Bank_shirisha(439,"Kalyan","ICIC",8900);
		Bank_shirisha b4=new Bank_shirisha(429,"Jyothi","HDFC",6000);
		Bank_shirisha b5=new Bank_shirisha(429,"Jyothi","SBI",6000);
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		Collections.sort(obj,new SortByBankBal());
	
		Iterator<Bank_shirisha> itr=obj.iterator();
		while(itr.hasNext())
		{
			Bank_shirisha st=itr.next();
			st.getDetails();
		}
		
		
	}
}