package info;

public class ChuyenBay {
	private String tenChuyenBay;
	private int thoiGianBay;
	private int soLuongKhach;
	
	public ChuyenBay() {
		super();
		this.tenChuyenBay = "Hà Nội - TP Hồ Chí Minh";
		this.thoiGianBay = 6;
		this.soLuongKhach = 1;
	}

	public ChuyenBay(String tenChuyenBay, int thoiGianBay, int soLuongKhach) {
		super();
		this.tenChuyenBay = tenChuyenBay;
		this.thoiGianBay = thoiGianBay;
		this.soLuongKhach = soLuongKhach;
	}

	public String getTenChuyenBay() {
		return tenChuyenBay;
	}

	public void setTenChuyenBay(String tenChuyenBay) {
		this.tenChuyenBay = tenChuyenBay;
	}

	public int getThoiGianBay() {
		return thoiGianBay;
	}

	public void setThoiGianBay(int thoiGianBay) {
		this.thoiGianBay = thoiGianBay;
	}

	public int getSoLuongKhach() {
		return soLuongKhach;
	}

	public void setSoLuongKhach(int soLuongKhach) {
		this.soLuongKhach = soLuongKhach;
	}
	
	public void thongTinChuyenBay() {
		System.out.println("Tên chuyến bay:" + tenChuyenBay);
		System.out.println("Thời gian bay: " + thoiGianBay);
		System.out.println("Số lượng khách: " + soLuongKhach);
	}
	
}
