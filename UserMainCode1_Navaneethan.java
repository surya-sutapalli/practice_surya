
import java.util.*;
class UserMainCode
{
public static void getLargestWord(String ntt)
{
int nav=0;
String nan=null;
String arr[]=ntt.split(" ");
for(String b:arr)
{
if(b.length()>nav)
{
nav=b.length();
nan=b;
}
}
System.out.println(nan);
}

}
public class UserMainCode1_Navaneethan
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String src=s.nextLine();
UserMainCode.getLargestWord(src);
}
}
