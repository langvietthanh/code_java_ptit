package code;

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
			int a[][] = new int [n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					a[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int j = 0;
			for(int i=0;i<n;i++) {
				if(j==0) {
					while(j<n) {
						System.out.print(a[i][j]+ " ");
						j++;
					}
				}
				else {
					j--;
					while(j>=0) {
						System.out.print(a[i][j]+ " ");
						j--;
					}
					j++;
				}
			}
			System.out.println();
		}
	}
}
