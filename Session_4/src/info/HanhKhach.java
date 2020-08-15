package info;

import java.util.Scanner;

public class HanhKhach {
	private String tenHanhKhach;
	private String gioiTinh;
	private int tuoi;
	private String loaiVe;
	Scanner scanner = new Scanner(System.in);
	
	public String getTenHanhKhach() {
		return tenHanhKhach;
	}

	public void setTenHanhKhach(String tenHanhKhach) {
		this.tenHanhKhach = tenHanhKhach;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getLoaiVe() {
		return loaiVe;
	}

	public void setLoaiVe(String loaiVe) {
		this.loaiVe = loaiVe;
	}
	public void nhapThongTinHanhKhach() {
		System.out.print("Tên hành khách: ");
		tenHanhKhach = scanner.nextLine();
		System.out.print("Giới tính: ");
		gioiTinh = scanner.nextLine();
		System.out.print("Tuổi: ");
		tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Loại vé: ");
		loaiVe = scanner.nextLine();
	}
	
	public void thongTinHanhKhach() {
		System.out.println("Tên hành khách: " + tenHanhKhach);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Loại vé: " + loaiVe);
	}
	
	public long thanhToan() {
		if (loaiVe.equalsIgnoreCase("cao cấp"))
			return 10000;
		if (loaiVe.equalsIgnoreCase("thương gia"))
			return 5000;
		if (loaiVe.equalsIgnoreCase("trung cấp")) {
			if (tuoi < 6) {
				return 1600;
			} else {
				return 2000;
			}
		}

	}
}
