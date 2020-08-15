package run;

import info.ChuyenBay;
import info.HanhKhach;

public class Main {
	public static void main(String[] args) {
		ChuyenBay chuyenBay = new ChuyenBay();
		chuyenBay.thongTinChuyenBay();
		HanhKhach[] hanhKhach = new HanhKhach[5];
		for (int i=0; i<hanhKhach.length; i++) {
			System.out.println("NHẬP THÔNG TIN HÀNH KHÁCH " +(i+1));
			hanhKhach[i] = new HanhKhach();
			hanhKhach[i].nhapThongTinHanhKhach();
			System.out.println();
		}
		
		for (int i=0; i<hanhKhach.length; i++) {
			hanhKhach[i] = new HanhKhach();
			System.out.println("THÔNG TIN HÀNH KHÁCH " +(i+1));
			hanhKhach[i].thongTinHanhKhach();
			System.out.println();
		}
		
		long tong;
		tong = 0;
		for (int i=0; i<hanhKhach.length; i++) {
			tong += hanhKhach[i].thanhToan();		
		}
		if (chuyenBay.getThoiGianBay() >= 20 && chuyenBay.getThoiGianBay() <= 4)
			tong *= 0.5;
		
		System.out.println("============================");
		System.out.println("Tổng tiền thu được từ chuyến bay là: " + tong);
	}
}
