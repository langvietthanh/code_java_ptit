package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t = Integer.valueOf(bf.readLine());
		while(t-->0) {
			String s = bf.readLine();
			System.out.println((distance(s)&&total(s)) ? "YES":"NO");
			
		}
	}

	private static boolean distance(String s) {
		int n =s.length();
		char c[] =  s.toCharArray();
		for(int i=0;i<n-1;i++) {
			int a,b;
			a = Integer.valueOf(c[i]) ;
			b = Integer.valueOf(c[i+1]) ;
			if(Math.abs(a-b)!=2) return false;
		}
		return true;
	}
	
	private static boolean total(String s) {
		int n =s.length();
		int S = 0;
		char c[] =  s.toCharArray();
		for(int i=0;i<n;i++) {
			int a;
			a = Integer.valueOf(s.charAt(i)) -'0' ;
			S +=a;
		}
		return S%10==0;
	}
}	
