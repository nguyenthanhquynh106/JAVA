//Bài 2: Viết chương trình tính giai thừa của số được người dùng nhập vào.

package lession2;

public class Main {
	public static void main(String[] args) {
		GiaiThua giaiThua = new GiaiThua();
		int a = giaiThua.nhap("Nhap a: ");
		giaiThua.tinhGiaiThua(a);
	}
}
