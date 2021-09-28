public class Bank_shirisha {
	int accid;
	String accname;
	String accbank;
	int accbal;
	public Bank_shirisha(int accid,String accname,String accbank,int accbal)   // Paramatirized Constructor
	{
		this.accid=accid;
		this.accname=accname;
		this.accbank=accbank;
		this.accbal=accbal;
	}
	public void getDetails()
	{
		System.out.println(accid+"---"+accname+"---"+accbank+"--"+accbal);
	}

}