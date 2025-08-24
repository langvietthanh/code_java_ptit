package problem;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n+1];
		a[0]=1;
		long total = 0;
		for (int i=1;i<=n;i++) {
			a[i] = a[i-1]*i;
			total += a[i];
		}
		System.out.println(total);
	}
}
