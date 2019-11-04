package Main.com.QLQA.controller;

import Main.com.QLQA.entity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerDangNhap {
    public PasswordField txtMatKhau;
    public TextField txtTaiKhoan;
    public Button btnDangNhap;
    public Label lblLogin;
    public Button btnDangKy;
    private boolean notAdmin=true;
    private String taiKhoan="",matkhau="";
    public int quyen=0;

    public void btnDangNhapClick(ActionEvent actionEvent) {

        taiKhoan=txtTaiKhoan.getText();
        matkhau=txtMatKhau.getText();
        if(kiemTraDangNhap(taiKhoan,matkhau)==true&&notAdmin!=true){
            System.out.println("Đăng nhập thành công với quyền "+quyen);
        }
        else {
            if(kiemTraDangNhap(taiKhoan,matkhau)==true&&quyen==1){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Bạn Không có quyền này");
                alert.show();
                System.out.println("Bạn Không có quyền này");

            }
            else if(kiemTraDangNhap(taiKhoan,matkhau)==true){
                ((Node) actionEvent.getSource()).getScene().getWindow().hide();
                Stage stage=new Stage();
                try{
                    Parent root = FXMLLoader.load(getClass().getResource("../view/frmTrangChu.fxml"));
                    Scene scene=new Scene(root);
                    stage.setScene(scene);
                    stage.setTitle("Xin Chào "+taiKhoan);
                    stage.show();
                }
                catch (Exception e){
                    System.out.println(""+e);
                    // e.printStackTrace();
                }
                System.out.println("Đăng nhập thành công với quyền "+quyen);
            }
            else {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Sai thông tin đăng nhập hoặc bạn chưa được cấp quyền, vui lòng liên hệ admin.");
                alert.show();
                System.out.println("Sai thông tin đăng nhập hoặc bạn chưa được cấp quyền, vui lòng liên hệ admin.");
            }
        }


    }

    public void btnDangKyClick(ActionEvent actionEvent) {
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
        Stage stage=new Stage();
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../view/frmDangKy.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception e){
            System.out.println(""+e);
          // e.printStackTrace();
        }
    }

    public void lblLoginClick(MouseEvent mouseEvent) {
        if(notAdmin){
            lblLogin.setText("Admin Login");
            notAdmin=false;
            System.out.println("admin is "+notAdmin);
        }
        else {
            lblLogin.setText("User Login");
            notAdmin=true;
            System.out.println("admin is "+notAdmin);
        }
    }
    public boolean kiemTraDangNhap(String username,String password){
        boolean ketqua=false;
        String sql="select * from Users where TenDangNhap= '"+username+"' and Password= '"+password+"'";
        ConnectionClass connectionClass=new ConnectionClass();
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
        try {
            if (rs.next()) {
                 quyen = rs.getInt("Quyen");
                //String ten=rs.getString("TenNhanVien");
                //String user=rs.getString("UserName");
               // System.out.println(" " + quyen);
                ketqua=true;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi Đăng Nhập"+ex);
        }
        return ketqua;
    }

}
