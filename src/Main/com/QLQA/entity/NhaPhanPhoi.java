package Main.com.QLQA.entity;

public class NhaPhanPhoi {
    private int maNhaPhanPhoi;
    private String tenNhaPhanPhoi;
    private String diaChiNPP;
    private String sdtNPP;
    private String emailNPP;
    private String chuThichNPP;

    public NhaPhanPhoi() {
    }

    public NhaPhanPhoi(int maNhaPhanPhoi, String tenNhaPhanPhoi, String diaChiNPP, String sdtNPP, String emailNPP, String chuThichNPP) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
        this.diaChiNPP = diaChiNPP;
        this.sdtNPP = sdtNPP;
        this.emailNPP = emailNPP;
        this.chuThichNPP = chuThichNPP;
    }

    public int getMaNhaPhanPhoi() {
        return maNhaPhanPhoi;
    }

    public void setMaNhaPhanPhoi(int maNhaPhanPhoi) {
        this.maNhaPhanPhoi = maNhaPhanPhoi;
    }

    public String getTenNhaPhanPhoi() {
        return tenNhaPhanPhoi;
    }

    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
        this.tenNhaPhanPhoi = tenNhaPhanPhoi;
    }

    public String getDiaChiNPP() {
        return diaChiNPP;
    }

    public void setDiaChiNPP(String diaChiNPP) {
        this.diaChiNPP = diaChiNPP;
    }

    public String getSdtNPP() {
        return sdtNPP;
    }

    public void setSdtNPP(String sdtNPP) {
        this.sdtNPP = sdtNPP;
    }

    public String getEmailNPP() {
        return emailNPP;
    }

    public void setEmailNPP(String emailNPP) {
        this.emailNPP = emailNPP;
    }

    public String getChuThichNPP() {
        return chuThichNPP;
    }

    public void setChuThichNPP(String chuThichNPP) {
        this.chuThichNPP = chuThichNPP;
    }
}
