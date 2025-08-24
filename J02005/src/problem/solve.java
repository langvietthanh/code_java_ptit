package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
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
		int a[]= new int[n];
		int b[]= new int[m];
		String line1,line2;
		line1 = bf.readLine();
		line2 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(line1);
		for(int i=0;i<n;i++) {
			a[i] = Integer.parseInt(st1.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer(line2);
		for(int i=0;i<m;i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}
		Set<Integer> sa = new TreeSet<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i,j;
		i=0;j=0;
		while(i<n && j<m) {
			if(a[i]<b[j]) {
				i++;
			}
			else if(a[i]>b[j]) {
				j++;
			}
			else if(a[i]==b[j]) {
				sa.add(a[i]);
				i++;
				j++;
			}
		}
		for (Integer integer : sa) {
			System.out.print(integer+" ");
		}
		System.out.println();
	}

}
