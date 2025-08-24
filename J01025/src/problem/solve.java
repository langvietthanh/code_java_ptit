package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve {
	
	public static void main(String[] args) throws IOException {
		long x1,x2,x3,x4,y1,y2,y3,y4;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String line1,line2;
		line1 = bf.readLine();
		line2 = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(line1);
		StringTokenizer st2 = new StringTokenizer(line2);
		x1 = Integer.parseInt(st1.nextToken());
		y1 = Integer.parseInt(st1.nextToken());
		x2 = Integer.parseInt(st1.nextToken());
		y2 = Integer.parseInt(st1.nextToken());
		x3 = Integer.parseInt(st2.nextToken());
		y3 = Integer.parseInt(st2.nextToken());
		x4 = Integer.parseInt(st2.nextToken());
		y4 = Integer.parseInt(st2.nextToken());
		long x = Math.max(x2, x4) - Math.min(x1, x3);
		long y = Math.max(y2, y4) - Math.min(y1, y3);
		long res=Math.max(x, y);
		System.out.println(res*res);
	}
}
