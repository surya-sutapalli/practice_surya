	
public class UserMainCode2 {
	public static int getSumOfEvenNumber(int n) {
		int sum=0;
		String s = Integer.toString(n);
		int arr[] = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]= s.charAt(i)-'0';
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				
				sum= sum+ (arr[i]*arr[i]);
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UserMainCode2.getSumOfEvenNumber(56895));

	}

}
