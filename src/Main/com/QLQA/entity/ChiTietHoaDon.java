package Main.com.QLQA.entity;

public class ChiTietHoaDon {
    private int maCTHD;
    private int maHoaDon;
    private String tenSanPham;
    private String soLuong;
    private String tongTien;
    private String ghiChu;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int maCTHD, int maHoaDon, String tenSanPham, String soLuong, String tongTien, String ghiChu) {
        this.maCTHD = maCTHD;
        this.maHoaDon = maHoaDon;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
