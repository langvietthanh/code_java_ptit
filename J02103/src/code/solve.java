package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		for(int T = 1;T<=t;T++){
			int n = sc.nextInt();
			int m = sc.nextInt();
			long a[][] = new long [n][m];
			long b[][] = new long [m][n]; 
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					a[i][j] = sc.nextLong();
					b[j][i] = a[i][j];
				}
			}
			System.out.println("Test "+T+":");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					long total = 0;
					for(int k=0; k<m;k++) {
						total += a[i][k]*b[k][j];					
					}
					System.out.print(total);
					if(j<n-1)System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
