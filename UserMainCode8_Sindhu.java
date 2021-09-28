import java.util.*;
public class UserMainCode8_Sindhu{
	public static HashMap<String,String> getStateId(String[] s) {
		HashMap<String,String> hm = new HashMap<String,String>();
		for(String st:s) {
			String skey = st.substring(0, 3);
			hm.put(skey.toUpperCase(), st);
		}
		return hm;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of states:");
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] = sc.next();
		}
		HashMap<String, String> h = getStateId(str);
		Set<String> s = h.keySet();
		Iterator<String> i = s.iterator();
		while(i.hasNext()) {
			String strkey = i.next();
			String strval = h.get(strkey);
			System.out.println(strkey+":"+strval);
		}
		sc.close();
	}

}
