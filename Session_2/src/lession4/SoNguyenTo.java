package lession4;

import java.util.Scanner;

public class SoNguyenTo {
	public static int nhap(String str) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print(str); 
		n = input.nextInt(); 
		return n;
	}
	public static Boolean check(int n) {
		for (int i=2; i<=Math.sqrt(n); i++)
			if (n % i ==0) return false;
		return true;
	}
	public static void lietKe(int n) {
		for (int i=2; i<n; i++)
			if (check(i)) 
				System.out.print(i+ " ");
	}
}
