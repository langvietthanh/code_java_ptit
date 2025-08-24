package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int n,m;
		String line = bf.readLine().trim();
		StringTokenizer st = new StringTokenizer(line);
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		Set<Integer> sa = new TreeSet<Integer>();
		String line1,line2;
		line1 = bf.readLine();
		line2 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(line1);
		for(int i=0;i<n;i++) {
			sa.add(Integer.parseInt(st1.nextToken()));
		}
		StringTokenizer st2 = new StringTokenizer(line2);
		for(int i=0;i<m;i++) {
			sa.add(Integer.parseInt(st2.nextToken()));
		}	
		for (Integer integer : sa) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}

}
