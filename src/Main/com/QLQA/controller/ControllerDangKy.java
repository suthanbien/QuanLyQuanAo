package Main.com.QLQA.controller;

import Main.com.QLQA.entity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControllerDangKy {
    public TextField txtTenDangNhap;
    public PasswordField txtMatKhau;
    public PasswordField txtNhapLaiMatKhau;
    public Button btnDangKy;
    public Button btnDangNhap;
    private int quyen=0;
    private String ten="";
    private String databaseName="QuanLySanPham";






    public void btnDangKyClick(ActionEvent actionEvent) {
        String MaNhanVien, TenDangNhap, Password, NhapLai, Quyen = "";
        TenDangNhap = txtTenDangNhap.getText();
        Password = String.valueOf(txtMatKhau.getText()).trim();
        NhapLai = String.valueOf(txtNhapLaiMatKhau.getText());
        String kiemtraquyen = "select *from Quyen ";
        ConnectionClass connectionClass=new ConnectionClass(databaseName);
        ResultSet rs = connectionClass.ExcuteQueryGetTable(kiemtraquyen);
        try {
            while (rs.next()) {
                if (rs.getString("TenQuyen").equals("New")) {
                    Quyen = rs.getString("MaQuyen");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        boolean kt = false;
         {
            if (TenDangNhap.length() < 6 || TenDangNhap.length() > 10) {
                ThongBao("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            } else if (Password.length() < 6 || Password.length() > 50) {
                ThongBao("Mật khẩu phải nhập nhiều hơn 6 ký tự và ít hơn 50 ký tự", "Lỗi đăng ký", 2);
            } else if (!KiemTraChuaChuVaSo(Password)) {
                ThongBao("Mật khẩu phải bao gồm chữ IN HOA, chữ thường và số", "Thông báo", 2);
            } else if (!Password.equals(NhapLai)) {
                ThongBao("nhập lại mật khẩu không khớp", "Thông báo", 2);
            } else {

                String sql = "select * from Users where TenDangNhap= '" + TenDangNhap + "'";
                System.out.println(sql);
                try {
                    ResultSet rs2 = connectionClass.ExcuteQueryGetTable(sql);
                    rs2.next();
                    if (rs2.getString("TenDangNhap").equals(TenDangNhap)) {
                        kt = false;
                        ThongBao("Tên đăng nhập: " + TenDangNhap + " đã  có trong sql yêu cầu tạo tk với tên đăng nhập khác!", "Thông báo", 2);
                    }
                } catch (SQLException ex) {
                    System.out.println("không có trong sql !có thể tạo thêm" +ex );
                    kt = true;
                }


                if (kt == true) {
                    String ctv = "insert into Users values(26 ,'" + TenDangNhap + "' , '" + Password + "' ," + Quyen
                            + ", N' ')";
                    System.out.println(ctv);
                    connectionClass.ExcuteQueryUpdateDB(ctv);
                    setMacDinh();
                    ThongBao("Thêm Thành Công", "Lỗi đăng ký", 2);
                } else {
                    ThongBao("Không thể Thêm tài Khoản", "lỗi", 2);
                }
            }
        }
    }

    public void btnDangNhapClick(ActionEvent actionEvent) {
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        Stage stage=new Stage();
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../view/frmDangNhap.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(""+e);
            // e.printStackTrace();
        }
    }

    private boolean KiemTraChuaChuVaSo(String chuoi) {
        boolean ketqua = false;
        Pattern p = Pattern.compile("[a-zA-Z][0-9]");
        Matcher m = p.matcher(chuoi);
        if (!(chuoi == chuoi.toLowerCase())) {
            ketqua = m.find();
        }
        return ketqua;
    }
    private boolean KiemTra(String tendangnhap, String matkhau) {
        boolean kq = false;
        String sql = "select * from Users where TenDangNhap= '" + tendangnhap + "' and Password= '" + matkhau + "'";
        System.out.println(sql);
        ConnectionClass connectionClass=new ConnectionClass(databaseName);
        ResultSet rs = connectionClass.ExcuteQueryGetTable(sql);
        try {
            if (rs.next()) {
                kq = true;
                quyen = rs.getInt("Quyen");
                ten = rs.getString("TenDangNhap");
                System.out.println(" " + quyen);
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng nhập"+ex);
        }
        return kq;
    }

    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    public void setMacDinh(){
        txtNhapLaiMatKhau.setText("");
        txtMatKhau.setText("");
        txtTenDangNhap.setText("");
    }
}
