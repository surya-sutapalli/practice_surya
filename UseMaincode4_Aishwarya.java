import java.util.*;

class SortByaccBalance implements Comparator<UseMaincode4_Aishwarya>
{
	public int compare(UseMaincode4_Aishwarya x, UseMaincode4_Aishwarya y) {
		return (int) (x.accBalance-y.accBalance);
	}
}
	public class UseMaincode4_Aishwarya {
		
		   int accId;
		   String accName;
		   String accBank;
		   double accBalance;
		   public UseMaincode4_Aishwarya(int accId,String accName,String accType,double accBalance)
		   {
			   this.accId=accId;
			   this.accName=accName;
			   this.accBank=accBank;
			   this.accBalance=accBalance;
		   }
		   public void getDetails()
		  {
			   System.out.println(accId+"--"+accName+"---"+accBank+"---"+accBalance);
		  }
	}
	 class prog4
	{
		public static void main(String[] args)
		{
			ArrayList<UseMaincode4_Aishwarya> obj = new ArrayList<UseMaincode4_Aishwarya>();
			UseMaincode4_Aishwarya b1 = new UseMaincode4_Aishwarya(101,"Aishwarya","HDFC",4000.00);
			UseMaincode4_Aishwarya b2 = new UseMaincode4_Aishwarya(102,"Tommy","ICICI",5000.00);
			UseMaincode4_Aishwarya b3 = new UseMaincode4_Aishwarya(103,"Ram","Axis",10000.00);
			UseMaincode4_Aishwarya b4 = new UseMaincode4_Aishwarya(104,"Tej","Canara",8000.00);
			UseMaincode4_Aishwarya b5 = new UseMaincode4_Aishwarya(105, "Edwin", "SBI",15000.00);
			obj.add(b1);
			obj.add(b2);
			obj.add(b3);
			obj.add(b4);
			obj.add(b5);
			Collections.sort(obj, new SortByaccBalance());
			Iterator  itr = obj.iterator();
			while(itr.hasNext())
			{
				UseMaincode4_Aishwarya b = (UseMaincode4_Aishwarya)itr.next();
				b.getDetails();
			}
		}
	}

