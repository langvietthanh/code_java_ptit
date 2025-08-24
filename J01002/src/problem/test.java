package problem;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long a;
			a = sc.nextLong();		
			System.out.println(a*(a+1)/2);
		}
	}
}	
