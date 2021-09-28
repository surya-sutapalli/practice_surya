package assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Sample3 {
  public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) {
      h1.put(sc.nextInt(), sc.nextInt());
    }
    System.out.println(getvalues(h1));
  }
  public static int getvalues(HashMap<Integer, Integer> h1) {
    ArrayList<Integer> a1 = new ArrayList<Integer>();
    int m = 0;
    Iterator<Integer> it = h1.keySet().iterator();
    while (it.hasNext()) {
      int x = it.next();
      a1.add(h1.get(x));
    }
    Collections.sort(a1);
    m = a1.get(0) + a1.get(1) + a1.get(2);
    return m;
  }
}