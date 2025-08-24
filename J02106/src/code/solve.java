package code;

import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt =0;
		for(int i =1;i<=n;i++) {
			int tmp = 0;
			for(int j=1;j<=3;j++) {
				if(sc.nextInt()==1)tmp++;
			}
			if(tmp>3-tmp)cnt++;
		}
		System.out.println(cnt);
	}
}
