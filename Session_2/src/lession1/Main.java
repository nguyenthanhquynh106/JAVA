//Bài 1: Giải phương trình bậc nhất, bậc hai

package lession1;

public class Main {
	public static void main(String[] args) {
		PTB2 x = new PTB2();
		double a = x.nhap("Nhập a: ");
		double b = x.nhap("Nhập b: ");
		double c = x.nhap("Nhập c: ");
		x.GPTB2(a,b,c);
	}
}
