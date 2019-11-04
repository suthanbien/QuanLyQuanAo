package Main.com.QLQA.entity;

public class LoaiKhachHang {
    private int maLoaiKhachHang;
    private String tenLoaiKhachHang;
    private String ghiChu;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(int maLoaiKhachHang, String tenLoaiKhachHang, String ghiChu) {
        this.maLoaiKhachHang = maLoaiKhachHang;
        this.tenLoaiKhachHang = tenLoaiKhachHang;
        this.ghiChu = ghiChu;
    }

    public int getMaLoaiKhachHang() {
        return maLoaiKhachHang;
    }

    public void setMaLoaiKhachHang(int maLoaiKhachHang) {
        this.maLoaiKhachHang = maLoaiKhachHang;
    }

    public String getTenLoaiKhachHang() {
        return tenLoaiKhachHang;
    }

    public void setTenLoaiKhachHang(String tenLoaiKhachHang) {
        this.tenLoaiKhachHang = tenLoaiKhachHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
