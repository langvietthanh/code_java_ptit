package problem;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			if(n%2==0) {
				n/=2;
				int cnt=0;
				for(int i=1;i<=Math.sqrt(n);i++) {
					if(n%i==0)cnt+=2;
					if(i*i==n)cnt-=1;
				}
				System.out.println(cnt);
			}
			else System.out.println(0);
		}
	}
}
