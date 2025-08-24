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
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]<a[j]) {
					int vi,vj;
					vi=a[i];
					vj=a[j];
					a[i]=vj;
					a[j]=vi;
				}
			}
			System.out.print("Buoc "+i+": ");
			for(int j=0;j<=i;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
}
