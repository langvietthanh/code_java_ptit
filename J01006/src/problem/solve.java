package problem;

//import java.util.Arrays;
import java.util.Scanner;

public class solve {
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		int t= sc.nextInt();
		
		long F[] = new long[92];
		
		F[0] = F[1] = 1; 
		
		for (int i=2;i<92;i++) {
			F[i] = F[i-1]+ F[i-2];
		}
		while(t-- > 0) {
			int n = sc.nextInt();
			System.out.println(F[n-1]);
		}
	}
}
