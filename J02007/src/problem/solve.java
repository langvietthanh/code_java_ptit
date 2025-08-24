package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
/*
1
10
1 7 2 8 3 3 2 1 3 2
*/
public class solve {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		int t =Integer.parseInt(bf.readLine());
		for(int k = 1;k <= t;k++) {
			int n = Integer.parseInt(bf.readLine());;
			String line = bf.readLine();
			StringTokenizer st = new StringTokenizer(line);
			Map< Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
			for(int i=0;i<n;i++) {
				int num = Integer.parseInt(st.nextToken());
				mp.put(num, mp.getOrDefault(num, 0) + 1);
			}
			System.out.println("Test "+k+":");
			for (Entry<Integer, Integer> entry : mp.entrySet()) {
				System.out.println(entry.getKey()+" xuat hien "+entry.getValue()+" lan");
			}
		}
	}
}
