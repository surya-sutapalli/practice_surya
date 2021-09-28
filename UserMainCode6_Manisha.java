package demopackage;
import java.util.*;
public class UserMainCode6_Manisha {
    public static void main(String args[]) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     System.out.println(check(s));
    }
    static int check(String s){
        String[] sp=s.split(" ");
        if(sp[0].equals(sp[sp.length-1])){
            return sp[0].length();
        }
        return sp[0].length()+sp[sp.length-1].length();
    }
}