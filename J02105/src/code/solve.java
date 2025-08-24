package code;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n+1][n+1];
		for(int i =1 ;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(sc.nextInt()==1) {
					a[i][j]=1;
					a[j][i]=1;
				}
				else a[i][j]=0;
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.print("List("+i+") = ");
			for(int j=1;j<=n;j++) {
				if(a[i][j]==1)System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
