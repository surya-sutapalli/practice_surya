
public class UserMainCode3_Shriram {
	public static int addAndReverse(int[] arr, int num)
	{
		int res = 0, pos = 0;
		for(int ch:arr)
		{
			if(ch==num)
				break;
			else pos++;
		}
		for(int i=pos+1; i<=arr.length-1; i++)
		{
			res += arr[i];
		}
		String s = String.valueOf(res);
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String str = sb.toString();
		int fin = Integer.parseInt(str);
		return fin;
	}
}
