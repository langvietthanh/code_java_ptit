package problem;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		a = sc.nextDouble();
		b = sc.nextDouble();
//		ax + b = 0
		if (a == 0) {
			if (b != 0)System.out.println("VN");
			if (b == 0)System.out.println("VSN");
		}
		else {
			double c = (-b)/a;
			String res = String.format("%.2f", c);
			System.out.println(res);
		}
		
	}
}
