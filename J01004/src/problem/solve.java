package problem;

import java.util.Scanner;

public class solve {
	public static boolean is_prime(int num) {
		if (num == 2) return true;
		if (num < 2 || num%2==0) return false;
		int n = num;
		for (int i = 3;i<=Math.sqrt(num);i+=2) {
			if(n % i == 0)return false;	
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			String res = is_prime(a) ? "YES" : "NO"; 
			System.out.println(res);
		}
	}
}	
