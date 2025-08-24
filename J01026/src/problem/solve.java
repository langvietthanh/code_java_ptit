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
			long n = Long.parseLong(bf.readLine());
			long r = (long)Math.sqrt(n);
			System.out.println((r*r==n)?"YES":"NO");
		}		
	}

}
