package Test1;

public class UserMainCode2_Juhi {
	public static int check(String s)
	{
		String arr[]=s.split(" ");
		int l=arr.length-1;
		
		if(arr[0].equals(arr[l]))
		{
			return arr[0].length();
		}
		else
			return (arr[0].length()+arr[l].length());
	}

	
}

