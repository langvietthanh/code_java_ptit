package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t = Integer.parseInt(bf.readLine().trim());
		while(t-->0) {
			int n = Integer.parseInt(bf.readLine().trim());
			String line = bf.readLine().trim();
			StringTokenizer st = new StringTokenizer(line);
			long dp[] = new long[n+1];
			dp[0]=0;
			for(int i=1;i<=n;i++) {
				dp[i] += Integer.parseInt(st.nextToken()) + dp[i-1];
			}
			int res=-1;
			for(int i=2;i<n;i++) {
				long s1,s2;
				s1 = dp[i-1];
				s2 = dp[n]-dp[i];
				if(s1==s2) {
					res=i;
					break;
				}
			}
			System.out.println(res);
		}
	}
}

