import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class Bank2_VaishnaviV {
	int accId;
	String accName;
	String accBank;
	double accBalance;

	public Bank2_VaishnaviV(int accId,String accName,String accBank,double accBalance)
	{
		this.accId=accId;
		this.accName=accName;
		this.accBank=accBank;
		this.accBalance=accBalance;
	}
	public void getDetails()
	{
		System.out.println(accId+"--"+accName+"--"+accBalance);
	}



}
class SortByaccBalance implements Comparator<Bank2_VaishnaviV>
{
	public int compare(Bank2_VaishnaviV x,Bank2_VaishnaviV y) {
		return (int) (x.accBalance-y.accBalance);
	}
}
public class UserMainCode2_VaishnaviV {

	public static void main(String[] args) {
		ArrayList<Bank2_VaishnaviV> obj=new ArrayList<Bank2_VaishnaviV>();
		Bank2_VaishnaviV b1=new Bank2_VaishnaviV(100,"Ram","SBI",50000);
		Bank2_VaishnaviV b2=new Bank2_VaishnaviV(200,"Raj","HDFC",52000.95);
		Bank2_VaishnaviV b3=new Bank2_VaishnaviV(500,"Pinky","ICCI",5000);
		Bank2_VaishnaviV b4=new Bank2_VaishnaviV(103,"Mala","SBI",100000);
		Bank2_VaishnaviV b5=new Bank2_VaishnaviV(101,"Latha","HDFC",75000.85);
		obj.add(b1);obj.add(b2);obj.add(b3);obj.add(b4);obj.add(b5);
		Collections.sort(obj,new SortByaccBalance());

		Iterator<Bank2_VaishnaviV> itr=obj.iterator();
		while(itr.hasNext())
		{
			Bank2_VaishnaviV b=itr.next();
			b.getDetails();

		}


	}

}
