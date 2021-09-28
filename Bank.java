
public class Bank {
	int accId;
	String accName;
	String accBank;
	double accBalance;
	public Bank(int accId,String accName,String accBank,double accBalance) {
		this.accId=accId;
		this.accName=accName;
		this.accBank=accBank;
		this.accBalance=accBalance;
	}
	public void getDetails() {
		System.out.println(accId+"--"+accName+"--"+accBank+"--"+accBalance);
	}
}
