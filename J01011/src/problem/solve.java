package problem;

import java.util.Scanner;

public class solve {
	
	public static long greatest_common_divisor(long a,long b) {
		if (b==0) return a;
		else return greatest_common_divisor(b, a % b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			long a,b;
			a=sc.nextLong();
			b=sc.nextLong();
			long gcd = greatest_common_divisor(a, b);
			long lcm = (a*b)/gcd;
			System.out.println(lcm +" "+ gcd);
		}
	}
}
