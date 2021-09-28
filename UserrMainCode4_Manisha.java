package demopackage;
import java.util.*;
public class UserrMainCode4_Manisha {
    public static void main(String args[]) {
      ArrayList<Bank> bank=new ArrayList<Bank>(); 
      //Adding 5 Bank object to bank list
      bank.add(new Bank(1,"Manisha","SBI",10000));
      bank.add(new Bank(2,"Pavan","BOI",2000));
      bank.add(new Bank(3,"Ajay","HDFC",10000));
      bank.add(new Bank(4,"Jyothi","ICCI",5000));
      bank.add(new Bank(5,"Sanjana","Kotak",45000));
      System.out.println("Before sorting by AccBalance\n");
       
      for(Bank b:bank){
          System.out.println(b.accId+" "+b.accName+" "+b.accBank+" "+b.accBalance);
      }
      //sorting based on given parameter
      Collections.sort(bank, new SortByAccBalance());
      
      System.out.println("\nAfter sorting by AccBalance\n");
      for(Bank b:bank){
          System.out.println(b.accId+" "+b.accName+" "+b.accBank+" "+b.accBalance);
      }
      
      
    }
}
class Bank {
    int accId;
    String accName;
    String accBank;
    int accBalance;
    Bank(int a,String b,String c,int d){
        this.accId=a;
        this.accName=b;
        this.accBank=c;
        this.accBalance=d;
    }
   
}
class SortByAccBalance implements Comparator<Bank>{
     public int compare(Bank b1, Bank b2) {
       int  p1 = b1.accBalance;
       int p2 = b2.accBalance;

       if (p1 > p2) {
           return 1;
       } else if (p1 < p2){
           return -1;
       } else {
           return 0;
       }
    }
    
}