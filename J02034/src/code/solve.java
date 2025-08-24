package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> st = new TreeSet<Integer>();
		for(int i=0;i<n;i++) {
			st.add(sc.nextInt());
		}
		List<Integer> lst =new ArrayList<Integer>(st);
		int m = lst.size();
		int maxn = lst.get(m-1);
		if(maxn == n) {
			System.out.println("Excellent!");
			return;
		}
		for(int i = 1;i<maxn;i++) {
			if(!st.contains(i))System.out.println(i);
		}
	}
}
