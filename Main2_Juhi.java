package Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2_Juhi {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s=br.readLine();
		int r=UserMainCode2_Juhi.check(s);
		System.out.println(r);
	}

}
