package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int n = Integer.parseInt(bf.readLine().trim());
		for(int i=1;i<=n;i++) {
			String line = bf.readLine();
			StringTokenizer st = new StringTokenizer(line);
			for(int j=1;j<=n;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(num == 1 && i<=j) System.out.println("(" +i+","+j+")");
			}
		}
	}
}
