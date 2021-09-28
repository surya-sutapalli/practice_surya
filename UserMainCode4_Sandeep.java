import java.util.*;

class SortByAccBalance implements Comparator<Bank> {
	@Override
	public int compare(Bank b1,Bank b2) {
		double x1=b1.accBalance;
		double x2=b2.accBalance;
		if(x1>x2) {
			return 1;
		}
		else if(x1<x2) {
			return -1;
		}
		else
			return 0;
	}
}

public class UserMainCode4_Sandeep {

	public static void main(String[] args) {
		ArrayList<Bank> obj=new ArrayList<Bank>();
		Bank b1=new Bank(1,"sandeep","hdfc",2000);
		Bank b2=new Bank(2,"sam","icici",3500);
		Bank b3=new Bank(3,"pavan","hdfc",500);
		Bank b4=new Bank(4,"Theju","axis",5000);
		obj.add(b1); obj.add(b2); obj.add(b3); obj.add(b4);
		
		for(Bank b:obj) {
			System.out.println(b.accId+"--"+b.accName+"--"+b.accBank+"--"+b.accBalance);
		}
		System.out.println();
		Collections.sort(obj,new SortByAccBalance());
		Iterator<Bank> itr=obj.iterator();
		while(itr.hasNext()) {
			Bank b=itr.next();
			b.getDetails();
		}
	}

}
