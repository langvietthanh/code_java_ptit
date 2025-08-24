package problem;

import java.util.ArrayList;
import java.util.Scanner;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
			String s = sc.next();
			int n = s.length();
			String a[] = s.split("");
			String res= "";
			boolean valid = true;
			for(int i=0;i<n;i++) {
				if(a[i].equals("1"))res+="1";
				else if(a[i].equals("0") ||a[i].equals("9")||a[i].equals("8"))res+="0";
				else {
					valid = false;
					break;
				}
			}
			if(valid) {
				while(res.length()>0&&res.substring(0,1).equals("0")) {
					res = res.substring(1);
				}
				if(res.length()>0)System.out.println(res);
				else System.out.println("INVALID");
			}
			else {
				System.out.println("INVALID");
			}
		}
	}
}
