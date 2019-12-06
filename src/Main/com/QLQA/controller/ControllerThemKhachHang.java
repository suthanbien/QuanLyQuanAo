package Main.com.QLQA.controller;

import Main.com.QLQA.entity.ConnectionClass;
import Main.com.QLQA.entity.KhachHang;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ControllerThemKhachHang {
    public TextField txtTenKhachHang;
    public TextField txtDiaChi;
    public RadioButton radNam;
    public ToggleGroup GioiTinhKHGroup;
    public RadioButton radNu;
    public TextArea textGhiChu;
    public TextField txtNgaySinh;
    public TextField txtSDT;
    public Button btnThem;
    public Button btnDong;
    public ComboBox cboLoaiKhachHang;
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    public void truyenTenLoaiKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        //listTenMA = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select TenLoaiKhachHang from LoaiKhachHang ";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            cboLoaiKhachHang.getItems().add(rs.getString(1));
        }
    }
    @FXML
    public void initialize() throws SQLException { //khởi tạo
    truyenTenLoaiKhachHang();

    }
    public void btnThemClick(ActionEvent actionEvent) {
       try{
           String strTenKhachHang="";
           String strNgaySinh="";
           String strDiaChi="";
           String strSoDienThoai="";
           String strGioiTinh="";
           String strLoai="";
           String strGhiChu="";
           int numLoaiKH=2;
           strTenKhachHang=txtTenKhachHang.getText();
           strNgaySinh=txtNgaySinh.getText();
           String nam=strNgaySinh.substring(6);


           String thang=strNgaySinh.substring(3,5);


           String ngay=strNgaySinh.substring(0,2);

           strNgaySinh=nam+"-"+thang+"-"+ngay;


           strDiaChi=txtDiaChi.getText();
           strSoDienThoai=txtSDT.getText();
           strGhiChu=textGhiChu.getText();
           if(radNam.isSelected()){
               strGioiTinh="Nam";
           }else {
               strGioiTinh="Nữ";
           }
           strLoai=cboLoaiKhachHang .getValue().toString();
           //System.out.println(strLoaiKH);
           if(strLoai.equals("vip")){
               numLoaiKH=1;
           }else if(strLoai.equals("sinh viên")){
               numLoaiKH=3;
           }
           System.out.println(numLoaiKH);
           if(strTenKhachHang.length()==0&&strNgaySinh.length()==0&&strSoDienThoai.length()==0){
               ThongBao("Vui Lòng Điền Đầy Đủ Thông Tin","Lỗi",2);
           }else{
               ConnectionClass connectionClass=new ConnectionClass();
               String sql="insert into KhachHang values (N'"+strTenKhachHang+"','"
                       +strNgaySinh+"',N'"+strGioiTinh+"',N'"+strDiaChi
                       +"',N'"+strSoDienThoai+"',"+numLoaiKH+",N'"+strGhiChu+"')";
               System.out.println(sql);
               connectionClass.ExcuteQueryUpdateDB(sql);
               ThongBao("Thêm Thành Công", "Thành Công", 2);
               ((Stage)((Node)actionEvent.getSource()).getScene().getWindow()).hide();
           }
       }
       catch (Exception e){
           ThongBao("Vui Lòng Điền Đầy Đủ Thông Tin","Lỗi",2);
       }
    }

    public void btnDongClick(ActionEvent actionEvent) {
        ((Stage)((Node)actionEvent.getSource()).getScene().getWindow()).hide();
    }
}
