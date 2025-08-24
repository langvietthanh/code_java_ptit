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
		int cnt=1;
		for(int i=0;i<n-1;i++) {
			int id = i;
			for(int j=i+1;j<n;j++) {
				if(a[id]>a[j]) {
					id = j;
				}
			}
			
			if (id != -1) {
				int vi = a[i];
				a[i] = a[id];
				a[id] = vi;
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
