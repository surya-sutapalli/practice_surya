import java.util.*;

// Comparator class
class SortBySAccBalance implements Comparator<Bank>
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
public class UserMainCode4_madhu {

	public static void main(String[] args) 
	{
		ArrayList<Bank> obj = new ArrayList<Bank>();
		
		Bank b1 = new Bank(1, "madhu", "HDFC", 45950.5);
		Bank b2 = new Bank(2, "sandeep", "ICICI", 15045.23);
		Bank b3 = new Bank(3, "varshita","CANARA",23467.67);
		Bank b4 = new Bank(4, "Maneesha", "KOTAK", 34567.45);
		Bank b5 = new Bank(5, "Sirisha", "PNB", 1469.05);
		
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		Collections.sort(obj, new SortBySAccBalance());
		
		Iterator itr = obj.iterator();
		while(itr.hasNext())
		{
			Bank bk = (Bank) itr.next();
			bk.getDetails();
			
		}
		
		

	}

}