package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int n =  Integer.parseInt(bf.readLine().trim());
		String line = bf.readLine().trim();
		StringTokenizer st = new StringTokenizer(line);
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int cnt = 1;
		for(int i=n-1;i>0;i--) {
			boolean change = false;
			for(int j=0;j<i;j++) {
				if(a[j] > a[j+1]) {
					int v1,v2;
					v1=a[j];
					v2=a[j+1];	
					a[j]=v2;
					a[j+1]=v1;
					change = true;
				}
			}
			if(change) {
				System.out.print("Buoc "+cnt+": ");
				for(int v:a) {
					System.out.print(v+" ");
				}
				System.out.println();
				cnt++;
			}
		}
	}
}
