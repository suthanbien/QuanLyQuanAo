package Main.com.QLQA.entity;

public class ThongKe {
    private int maSanPham;
    private String tenSanPham;
    private int soLuongBan;
    private int tongTien;

    public ThongKe() {
    }

    public ThongKe(int maSanPham, String tenSanPham, int soLuongBan, int tongTien) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuongBan = soLuongBan;
        this.tongTien = tongTien;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
}
