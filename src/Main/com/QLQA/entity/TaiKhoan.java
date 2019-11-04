package Main.com.QLQA.entity;

public class TaiKhoan {
    private int id;
    private String TenNhanVien;
    private String user;
    private String pass;
    private String quyen;
    private String chuthich;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String tenNhanVien, String user, String pass, String quyen, String chuthich) {
        this.id = id;
        TenNhanVien = tenNhanVien;
        this.user = user;
        this.pass = pass;
        this.quyen = quyen;
        this.chuthich = chuthich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        TenNhanVien = tenNhanVien;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }
}
