package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String s = bf.readLine();
		char a[] = s.toCharArray();
		int cnt= 0;
		for (char c : a) {
			if(c == '4'  || c =='7')cnt++;
		}
		System.out.println( ((cnt==4 || cnt==7) ? "YES":"NO") );
	}
}
