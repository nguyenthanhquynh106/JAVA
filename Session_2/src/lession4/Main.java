//Bài 4: Viết chương trình in ra các số nguyên tố lớn hơn 0 và nhỏ hơn giá trị nhập vào

package lession4;

public class Main {
	public static void main(String[] args) {
		SoNguyenTo a = new SoNguyenTo();
		int n = a.nhap("Nhập a: ");
		System.out.print("Các số nguyên tố lớn hơn 0 và nhỏ hơn " +n+ " là: ");
		a.lietKe(n);
				
	}
}
