package problem;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		int T= t;
		while(t-->0) {
			int n = sc.nextInt();
			int cnt=0;
			System.out.print ("Test "+(T-t)+": ");
			while(n%2==0) {
				cnt ++;
				n/=2;
			}
			if(cnt>0) {
				System.out.print("2("+cnt+") ");
				cnt=0;
			}
			for(int i=3;i<=Math.sqrt(n);i++) {
				while(n%i==0) {
					cnt++;
					n/=i;
				}
				if(cnt>0) {
					System.out.print(i+"("+cnt+") ");
					cnt=0;
				}
			}
			if(n > 1) System.out.print(n+"("+1+") ");
			System.out.println();
		}
	}
}
