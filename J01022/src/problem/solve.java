package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	static long l[] = new long[93];
	public static String binary_string(int n,long k) {
		if (k == 1 && n==1) return "0";
		else if (k == 1 && n == 2) return "1";
		else {
			long len1 = l[n-1];
			long len2 = l[n-2];
			if (len2 >= k) {
				return binary_string(n-2, k);
			}
			else {
				return binary_string(n-1, k-len2);
			}
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t = Integer.parseInt(bf.readLine());
		l[0]=0;
		l[1]=1;
		for(int i=2;i<93;i++)l[i]=l[i-1]+l[i-2];
		while(t-- > 0 ) {
			String line = bf.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int n;
			long k;
			n = Integer.parseInt(st.nextToken());
			k = Long.parseLong(st.nextToken());
			System.out.println(binary_string(n,k));
		}
	}
}
