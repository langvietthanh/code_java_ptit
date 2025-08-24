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
	
	public long getTu() {
		return tu;
	}

	public void setTu(long tu) {
		this.tu = tu;
	}

	public long getMau() {
		return mau;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public String Solve(PhanSo oth) {
		long k1= uc(tu*oth.getMau()+mau*oth.getTu(),mau*oth.getMau());
		return (tu*oth.getMau()+mau*oth.getTu())/k1 + "/" + mau*oth.getMau()/k1;
	}
	public static void main(String[] args) {
		long a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		d = sc.nextLong();
		if(b == 0 || d==0) {
			return;
		}
		PhanSo ps = new PhanSo(a,b);
		System.out.println(ps.Solve(new PhanSo(c,d)));
	}
}
