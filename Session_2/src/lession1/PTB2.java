package lession1;

import java.util.Scanner;

public class PTB2 {
	public static double nhap(String str) {
		double n;
		Scanner input = new Scanner(System.in);
		System.out.print(str); 
		n = input.nextDouble(); 
		return n;
	}
	public static void GPTB2(double a, double b, double c) { 
		if (a==0) 
			{ if (b==0) { 
				if (c==0) 
					System.out.println("Phương trình có vô số nghiệm"); 
				else System.out.println("Phương trình vô nghiệm"); 
				} 
			else 
				System.out.println("Phương trình có 1 nghiệm x = " +(-c/b)); 
			} 
		else { 
			double delta = b*b - 4*a*c; 
			if (delta<0) 
				System.out.println("Phương trình vô nghiệm"); 
			else if (delta>0) { 
				double x1 = (-b + Math.sqrt(delta))/(2*a); 
				double x2 = (-b - Math.sqrt(delta))/(2*a); 
				System.out.println("Phương trình có nghiệm x1 = " +x1); 
				System.out.println("Phương trình có nghiệm x2 = " +x2); } 
			else 
				System.out.println("Phương trình có nghiệm kép x = " +(-b/(2*a))); 
			} 
		}
}
