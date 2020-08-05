package runLession;

import java.util.Scanner;

import lession1.ChuanHoaChuoi;
import lession2.Student;

public class Run {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Chuẩn hóa chuỗi");
		System.out.println("2. Chuyển hóa Object sang String Json");
		System.out.println("-------------------------------------");
		
		while(true) {
			System.out.print("\n\nPlease choose option: ");
			int input = scanner.nextInt();
			scanner.nextLine();
			
			switch (input) {
				case 1:
					ChuanHoaChuoi chuanHoa = new ChuanHoaChuoi();
					System.out.print("Nhập chuỗi cần chuẩn hóa: ");
					chuanHoa.str = scanner.nextLine();
					System.out.println("---------------");
					chuanHoa.chuanHoaChuoi();
					break;
				case 2:
					Student student = new Student();
					System.out.print("Nhập tên: ");
					student.name = scanner.nextLine();
					System.out.print("Nhập tuổi: ");
					student.age = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhập môn học: ");
					student.subject = scanner.nextLine();
					System.out.print("Nhập trường học: ");
					student.school = scanner.nextLine();
					System.out.println("---------------");
					System.out.println(student.convert(student));
					break;
				default:
					System.out.print("ĐẦU VÀO KHÔNG HỢP LỆ. CHỌN 1 HOẶC 2 ĐỂ TIẾP TỤC!");
					break;
			
			}
		}

	}
}
