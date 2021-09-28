import java.util.*;
class Bank_Meera4 {
	int accId;
	String accName;
	String accBank;
	double accBalance;
	public Bank_Meera4(int accId,String accName,String accBank,double accBalance)
	{
		this.accId=accId;
		this.accName=accName;
		this.accBank=accBank;
		this.accBalance=accBalance;
	}
	public void displayDetails()
	{
		System.out.println(accId+"--"+accName+"--"+accBank+"--"+accBalance);
	}
	

}

class sortByAccBalance implements Comparator<Bank_Meera4>
{

	@Override
	public int compare(Bank_Meera4 x, Bank_Meera4 y) {
		
		return (int) (x.accBalance-y.accBalance);
	}
	
}
public class BankComparator_Meera4 {

	public static void main(String[] args) {
		ArrayList<Bank_Meera4>obj=new ArrayList<Bank_Meera4>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Limit");
		int n=sc.nextInt();
		Bank_Meera4 arr[]=new Bank_Meera4[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter Bank");
			String bank=sc.next();
			System.out.println("Enter Balance");
			double bal=sc.nextDouble();
			arr[i]=new Bank_Meera4(id,name,bank,bal);
			obj.add(arr[i]);
			
		}
		Collections.sort(obj,new sortByAccBalance());
		Iterator<Bank_Meera4>itr=obj.iterator();
		while(itr.hasNext())
		{
			Bank_Meera4 o=itr.next();
			o.displayDetails();
		}

	}

}
