//Problem number 7
import java.util.*;
public class UserMainCode7_Navaneethan {
public static int validatePassword(String str)
{
if(str.length()>=6 && str.length()<=20)
{
if(str.matches(".*[0-9]{1,}.*") && str.matches(".*[@#$]{1,}.*"))
{
return 1;
}
else
{
return 0;
}
}
return 0;
}
public static void main(String[] args) {
String str;
Scanner sc= new Scanner(System.in);
str=sc.nextLine();

int count=UserMainCode7_Navaneethan.validatePassword(str);
if(count==1)
System.out.println("Valid password");
else
System.out.println("invalid password");
}
}