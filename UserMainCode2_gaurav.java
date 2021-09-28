package Gaurav;

import java.io.*;
import java.lang.*;
import java.util.*;
  
class Bank {
    int accId;
    String accName;
    String accBank;
    int accBalance;
       public Bank(int accId, String accName, String accBank, int accBalance)
    {
        this.accId = accId;
        this.accName = accName;
        this.accBank = accBank;
        this.accBalance = accBalance;
    }
    public String toString()
    {
        return this.accId + " " + this.accName + " "
            + this.accBank + " " + this.accBalance;
    }
}
  class SortByAccBalances implements Comparator<Bank> {
    public int compare(Bank a, Bank b)
    {
        return a.accBalance - b.accBalance;
    }
}
 public class UserMainCode2_gaurav {
    public static void main(String[] args)
    {
        ArrayList<Bank> ar = new ArrayList<Bank>();
        ar.add(new Bank(111, "kumar", "HDFC", 5000));
        ar.add(new Bank(131, "gaurav", "ICICI",10000));
        ar.add(new Bank(121, "manish", "SBI", 20000));
        ar.add(new Bank(123, "devid", "SBI", 4000));
        ar.add(new Bank(124, "virat", "SBI", 30000));
  
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new SortByAccBalances());
  
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}