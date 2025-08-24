package problem;

import java.math.BigInteger;
import java.util.Scanner;

public class solve {
	

	private static boolean is_fibo(BigInteger l) {
		if(l.equals(BigInteger.ZERO) || l.equals(BigInteger.ONE))return true;
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		while (b.compareTo(l) < 0 ) {
			BigInteger c= a.add(b);
			a=b;
			b=c;
		}
		return l.compareTo(b) == 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			BigInteger n = sc.nextBigInteger();
			if(is_fibo(n))System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
