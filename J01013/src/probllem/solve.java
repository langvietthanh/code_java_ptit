package probllem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class solve {
	
	static int maxn = 2000000 + 1;
	static int spf[] = new int[maxn];
	
	public static void sieve() {
		for(int i=2;i<maxn;i++)spf[i]=i;
		for(int i=2;i<=Math.sqrt(maxn);i++) {
			if(spf[i]==i) {
				for (int j=i*i;j<maxn;j+=i) {
					if(spf[j]==j)spf[j]=i;
				}
			}
		}
	}
	
	private static long sum_prime(int n) {
		long res= 0;
		while(n>1) {
			res+=spf[n];
			n/=spf[n];
		}
		return res;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		long res=0;
		sieve();
		while (t-->0) {
			int n = Integer.parseInt(br.readLine().trim());
			res += sum_prime(n);
		}
		System.out.println(res);
	}

	
}

