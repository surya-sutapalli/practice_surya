import java.util.*;

// Comparator class
class SortByaccBalance implements Comparator<Bank>
{

	@Override
	public int compare(Bank A, Bank B) {
		
		return (int) (A.accBalance-B.accBalance);
	}
	
}
// Bank class 
 class Bank 
{
	 int accId;
	 String accName;
	 String accBank;
	double accBalance;
	
	public Bank(int accid,String accname,String accbank,double accbalance)
	{
		this.accId=accid;
		this.accName=accname;
		this.accBank=accbank;
		this.accBalance=accbalance;
		
	}
	public void getDetails()
	{
		System.out.println(accId+"--"+accName+"--"+accBank+"--"+accBalance);
	}
	

}


// Main class
public class Program4_Test1 {

	public static void main(String[] args) 
	{
		ArrayList<Bank> obj = new ArrayList<Bank>();
		
		Bank b1 = new Bank(101, "chetan", "HDFC", 333.22);
		Bank b2 = new Bank(102, "Arjun", "ICICI", 10000.23);
		Bank b3 = new Bank(103, "Chandan","CANARA",234.67);
		Bank b4 = new Bank(104, "Sanjay", "KARNATAKA BANK", 345.45);
		Bank b5 = new Bank(105, "Aishwaraya", "PNB", 1000);
		
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		Collections.sort(obj, new SortByaccBalance());
		
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			Bank bk = (Bank) itr.next();
			bk.getDetails();
			
		}
		
		

	}

}
