package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			Try(0,n,a);
		}
	}

	private static void Try(int i, int n, List<Integer> a) {
		if(i==n) {
			for (int j : a) {
				System.out.print(j);
			}
			System.out.println();
		}
		else {
			for(int j=1;j<=n;j++) {
				if(i==0) {
					a.add(j);
					Try(i+1, n, a);
					a.remove(i);
				}
				else if(!a.contains(j) && (int)Math.abs(j-a.get(i-1)) > 1) {
					a.add(j);
					Try(i+1, n, a);
					a.remove(i);
				}
			}
		}
		
	}
}
