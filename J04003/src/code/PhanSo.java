package code;

import java.util.Scanner;

public class PhanSo {
	private long tu,mau;
	public static long uc(long a,long b) {
		if(b==0)return a;
		else return uc(b,a%b);
	}
	
	public PhanSo(long tu, long mau) {
		super();
		long k = uc(tu,mau);
		this.tu = tu/k;
		this.mau = mau/k;
	}
	
	public String Solve() {
		return tu+"/"+mau;
	}
	public static void main(String[] args) {
		long a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		b = sc.nextLong();
		if(b == 0) {
			return;
		}
		PhanSo ps = new PhanSo(a,b);
		System.out.println(ps.Solve());
	}
}
