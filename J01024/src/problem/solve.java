package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t = Integer.parseInt(bf.readLine());
		while(t-->0) {
			String s = bf.readLine();
			System.out.println(check(s) ? "YES":"NO");
		}			
	}

	private static boolean check(String s) {
		for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c!='0' && c!='1' && c!='2') return false;
		}
		return true;
	}
}
