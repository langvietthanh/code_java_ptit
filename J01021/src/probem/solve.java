package probem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	static long MOD = (long) (1e9 + 7);
	
	
	private static long Power(long a, long b) {
		long res= 1;
		a%=MOD;
		while(b>0) {
			if(b%2==1) {
				res *= a;
				res %=MOD;
			}
			b/=2;
			a %=MOD;
			a*=a;
		}
		return res;
	}
	
	 public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bf.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;
            StringTokenizer st = new StringTokenizer(line);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            if (a == 0 && b == 0) break;
            System.out.println(Power(a, b));
        }
    }
}
