package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class solve {
	static final int maxn = 10000;
	static int prime[]=new int[maxn+1];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t = Integer.parseInt(bf.readLine().trim());
		sieve();
		while(t-->0) {
			int n =  Integer.parseInt(bf.readLine().trim());
			System.out.println(min_num(n));
		}
	}

	private static long min_num(int n) {
		Map<Integer, Integer> mp = new  HashMap<Integer, Integer>();
		for(int i = 2;i<= n;i++) {
			int num = i;
			int prime_num = prime[i];
			int cnt_prime = 0;
			while(num>1) {
				num /= prime_num;// 4 2 1
				cnt_prime++;// 1 2 3
				if(prime_num!=prime[num]) {
					mp.put(prime_num,Math.max(mp.getOrDefault(prime_num, 0),cnt_prime));
					cnt_prime=0;
					prime_num = prime[num];
				}
			}
		}
		long res = 1 ;
		for (Entry<Integer, Integer> entry : mp.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
			long a,b;
			a = (long) entry.getKey();
			b = (long) entry.getValue();
			res *= (long) Math.pow(a, b);
		}
		return res;
	}

	private static void sieve() {
		prime[0]=0;
		prime[1]=1;
		for(int i=2;i<=maxn;i++)prime[i]=i;
		for(int i=2;i<=Math.sqrt(maxn);i++) {
			if(prime[i]==i) {
				for(int j=i*i;j<=maxn;j+=i)if(prime[j]==j)prime[j]=i;
			}
		}
		
	}
}
