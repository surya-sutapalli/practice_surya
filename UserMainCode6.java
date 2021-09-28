package AbhishekSingh;
//6
public class UserMainCode6 
{
	public static int check(String str) 
	{
		String arr[]=str.split(" ");
		int l=arr.length;
		if(arr[0].equals(arr[l-1])) {
			return arr[0].length();
		}
		else {

			return (arr[0].length()+arr[l-1].length());
		}
	}

}
