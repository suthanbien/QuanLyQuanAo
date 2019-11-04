package Main.com.QLQA.controller;

import Main.com.QLQA.entity.ConnectionClass;
import Main.com.QLQA.entity.SanPham;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControllerSanPhamAn {
    public TableView tblSanPhamAn;
    public TableColumn columMaSanPhamAn;
    public TableColumn columTenSPAn;
    public TableColumn columLoaiSPAn;
    public TableColumn columTonKhoAn;
    public Button btnHienLaiAn;
    public TextField txtTimKiem;
    public RadioButton radTimTheoTenAN;
    public ToggleGroup TimKiemSPAnGroup;
    public RadioButton radTimTheoMaAn;
    public RadioButton radTimTheoLoaiAn;
    public ComboBox cboTimSPAN;
    ArrayList<SanPham> listSanPhamAn;
    private ObservableList listLoaiSanPhamAn;
    private  String getComboxLoaiSanPham() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listLoaiSanPhamAn = FXCollections.observableArrayList();
        String sqlLoaiSanPham="select * from LoaiSanPham";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlLoaiSanPham);
        while(rs.next()) {
            listLoaiSanPhamAn.add(rs.getString(2));
        }
        cboTimSPAN.setItems(listLoaiSanPhamAn);
        cboTimSPAN.setValue("Loại Khác");
        return (String) cboTimSPAN.getValue();
    }
    private void getTableSanPhamAn(){
        setCellTableSanPhamAn();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=0" ;
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listSanPhamAn = new ArrayList<SanPham>();
            while(rs.next()) {
                SanPham dataSanPhamAn=new SanPham(rs.getInt(1),
                        rs.getString(2),rs.getString(14),
                        rs.getString(12),rs.getString(5),
                        rs.getString(6),rs.getString(7),
                        rs.getInt(8),rs.getString(10));
                listSanPhamAn.add(dataSanPhamAn);
            }
            tblSanPhamAn.getItems().clear();
            tblSanPhamAn.getItems().addAll(listSanPhamAn);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }
    private void HienSanPham(int index){
        SanPham sanPham= (SanPham) tblSanPhamAn.getItems().get(index);
        String maSP =""+sanPham.getMaSanPham();
        if(ThongBaoDelete("Bạn muốn hiện sản phẩm: ")==true){
            if(maSP.length()==0){
                ThongBao("Vui lòng chọn sản phẩm: ", "Thông Báo", 2);
            }else {
                try{
                    ConnectionClass connectionClass=new ConnectionClass();
                    String sql="update SanPham set TrangThai=1 where MaSanPham='"+maSP+"'";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    getTableSanPhamAn();
                }
                catch (Exception e){
                    ThongBao("Vui lòng chọn sản phẩm ", " lỗi", 2);
                }
            }
        }
    }
    private void TimSanPham(){ ;
        String strTim,strLoaiSP;
        strTim=txtTimKiem.getText();
        strLoaiSP=""+cboTimSPAN.getValue().toString();
        String  sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=0";
        if(strTim.length()==0&&radTimTheoLoaiAn.isSelected()==false)
        {
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=0";
        }else if(radTimTheoMaAn.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=0 and MaSanPham="
                    +strTim;
        }
        else if(radTimTheoTenAN.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=0 and TenSanPham=N'"
                    +strTim+"'";
        }else if(radTimTheoLoaiAn.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and LoaiSanPham.TenLoaiSanPham=N'"
                    +strLoaiSP+"'";
        }

        setCellTableSanPhamAn();
        try {
            ConnectionClass connectionClass = new ConnectionClass();

            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listSanPhamAn = new ArrayList<SanPham>();
            while(rs.next()) {
                SanPham dataSanPham=new SanPham(rs.getInt(1),
                        rs.getString(2),rs.getString(14),
                        rs.getString(12),rs.getString(5),
                        rs.getString(6),rs.getString(7),
                        rs.getInt(8),rs.getString(10));
                listSanPhamAn.add(dataSanPham);
            }
            tblSanPhamAn.getItems().clear();
            tblSanPhamAn.getItems().addAll(listSanPhamAn);

        }
        catch (Exception ex){

        }
    }
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
    private boolean ThongBaoDelete(String noidung){
        if (JOptionPane.showConfirmDialog(null, noidung, "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
    @FXML
    public void initialize() throws SQLException { //khởi tạo
       getTableSanPhamAn();
       getComboxLoaiSanPham();

    }
    private void setCellTableSanPhamAn(){
        columMaSanPhamAn.setCellValueFactory(new PropertyValueFactory<>("maSanPham"));
        columTenSPAn.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
        columLoaiSPAn.setCellValueFactory(new PropertyValueFactory<>("loaiSanPham"));
        columTonKhoAn.setCellValueFactory(new PropertyValueFactory<>("tonKho"));

    }
    public void tblSanPhamAn(MouseEvent mouseEvent) {
    }

    public void btnHienLaiAnClick(ActionEvent actionEvent) {
        try{
            int index=tblSanPhamAn.getSelectionModel().getSelectedIndex();
            HienSanPham(index);
            ((Stage)((Node)actionEvent.getSource()).getScene().getWindow()).setAlwaysOnTop(true);
        }
        catch (Exception e){
            ThongBao("Vui lòng chọn sản phẩm","Thông báo",2);
        }
    }

    public void TimKiemAnClick(ActionEvent actionEvent) {
        TimSanPham();
    }
}
