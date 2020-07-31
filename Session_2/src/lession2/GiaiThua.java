package lession2;

import java.util.Scanner;

public class GiaiThua {
	
	public static int nhap(String str) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print(str); 
		n = input.nextInt(); 
		return n;
	}
	public static void tinhGiaiThua(int n) {
		int giaiThua = 1;
		for (int i=1; i<=n; i++)
			giaiThua *= i;
		System.out.println(+n+ "! = " +giaiThua);
	}
}
