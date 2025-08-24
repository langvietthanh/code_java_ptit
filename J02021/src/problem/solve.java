package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	static int n,k;
	static int x[];
	static int cnt = 0;
	private static void generate(int i) {
		for(int j = x[i-1] + 1;j <= n-k+i;j++) {
			x[i] = j;
			if(i == k)out();
			else generate(i+1);
		}
	}
	private static void out() {
		for(int i=1;i<=k;i++) {
			System.out.print(x[i]);
		}
		System.out.print(" ");
		cnt++;
	}
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String line = bf.readLine();
		StringTokenizer st = new StringTokenizer(line);
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		x = new int [k+1];
		x[0] = 0;
		generate(1);
		System.out.println();
		System.out.println("Tong cong co " +cnt+ " to hop");
	}
}
