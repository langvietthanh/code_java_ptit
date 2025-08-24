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
		while (t-->0) {
			int n = Integer.parseInt(bf.readLine().trim());
			int a[] = new int[n];
			String line = bf.readLine().trim();
			StringTokenizer st = new StringTokenizer(line);
			for (int i=0;i<n;i++) {
				a[i] = Integer.parseInt(st.nextToken()) ;
			}
			System.out.println( check(a) ? "YES":"NO");
		}
	}

	private static boolean check(int[] a) {
		int l,r;
		l = 0;
		r = a.length-1;
		while(l<r) {
			if(a[l]!=a[r])return false;
			l++;
			r--;
		}
		return true;
	}
}
