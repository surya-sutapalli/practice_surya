
public class UserMainCode1_kaviya_a 
{
     public static int addAndReverse(int brr[],int number)
     {
    	 int c=0,sum=0;
    	for(int a:brr)
    	{
    		if(a==number)
    			break;
    		else
    			c++;
    	}
    	for(int i=c+1;i<=brr.length;i++) {
    		sum+=brr[i];
    	}
    	String s= String.valueOf(sum);
    	StringBuffer sb=new StringBuffer(s);
    	sb.reverse();
    	String str = sb.toString();
    	int res = Integer.parseInt(str);
    	return res;

    	
     }
}