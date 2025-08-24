package code;

import java.util.Scanner;
import java.util.StringTokenizer;

public class solve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String tmp = sc.nextLine();
		while (t-- > 0) {
			String License_Plate = sc.nextLine();
			StringTokenizer st = new StringTokenizer(License_Plate,"-");
			String Tail,tmp1;
			tmp1 = st.nextToken();
			Tail = st.nextToken();
			String s = dive(Tail);
			if(increse(s) || allnum(s) || six_eight(s))System.out.println("YES");
			else System.out.println("NO");
		}
	}

	private static boolean six_eight(String s) {
		int n = s.length();
		for(int i=0;i<n;i++) {
			if(s.charAt(i) != (char)'6' &&  s.charAt(i) != (char)'8')return false;
		}
		return true;
	}

	private static boolean allnum(String s) {
		String a,b;
		a = s.substring(0, 3);
		b = s.substring(3,s.length());
		return eq(a) && eq(b);
	}

	private static boolean eq(String s) {
		int n = s.length();
		for(int i=0;i<n-1;i++) {
			if(s.charAt(i) != s.charAt(i+1))return false;;
		}
		return true;
	}
	private static boolean increse(String s) {
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) >= s.charAt(i+1))return false;
		}
		return true;
	}

	private static String dive(String tail) {
		String a,b;
		StringTokenizer st = new StringTokenizer(tail,".");
		a = st.nextToken();
		b = st.nextToken();
		return a+b;
	}
}
//7
//29T1–123.45
//29T1–555.55
//29T1–222.33
//29T1–686.88
//29T1–123.33
//29T1–555.54
//29T1–606.88