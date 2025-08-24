package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve {	
	public static long largest_prime_factor(long n) {
		long res=-1;
		while(n%2==0) {
			n/=2;
			res=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2) {
			while(n%i==0) {
				res = Math.max(res, i);
				n/=i;
			}
		}
		if(n>1)res = Math.max(res, n);
		return res;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(is);
		int t = Integer.parseInt(bf.readLine().trim());
		while(t-->0) {
			long n = Long.parseLong(bf.readLine().trim());
			System.out.println(largest_prime_factor(n));
		}
	}
}
