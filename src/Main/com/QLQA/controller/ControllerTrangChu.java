package Main.com.QLQA.controller;

import Main.com.QLQA.entity.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControllerTrangChu {
    public TableView tblBangHoaDon;
    public TableView tblBangChiTietHD;
    public TextField txtMaHoaDon;
    public TextField txtTongTien;
    public TextField txtMaHoaDonCT;
    public TextField txtMaCTDH;
    public TextField txtThanhTien;
    public TextArea textGiChuCTHD;
    public TextArea textGhiChuHD;
    public ComboBox cbNhanVien;
    public ComboBox cbKhachHang;
    public ComboBox cbSanPham;
    public DatePicker dateNgayLap;
    public Button btnXoaHD;
    public TextField txtSoLuong;
    public Button btnThemHD;
    public Button btnSuaHD;
    public Button btnReSetCTHD;
    public Button btnReSetHD;
    public Button btnThemCTHD;
    public Button btnXoaCTHD;
    public Button btnSuaCTHD;
    public TableView<NhaPhanPhoi> tblNhaPhanPhoi;
    public TextField txtMaNPP;
    public TextField txtTenNPP;
    public TextField txtDiaChiNPP;
    public TextField txtSDTNPP;
    public TextField txtEmailNPP;
    public TextArea textChuThichNPP;
    public Button btnThemNPP;
    public Button btnSuaNPP;
    public Button btnSesetNPP;
    public Button btnXoaNPP;
    public Tab tabDoiTac;
    public TableColumn columMaNPP;
    public TableColumn columTenNPP;
    public TableColumn columDiaChiNPP;
    public TableColumn columSDTNPP;
    public TableColumn columEmailNPP;
    public TableColumn columChuThichNPP;
    public TableView<KhachHang> tblBangKhachHang;
    public TextField txtMaKH;
    public TextField txtTenKhachHang;
    public TextField txtDiaChiKH;
    public TextField txtSDTKhachHang;
    public Button btnXoaKH;
    public Button ptnThemKH;
    public Button btnSuaKH;
    public DatePicker dayNgaySinhKH;
    public RadioButton radGioiTinhKHNam;
    public RadioButton radGioiTinhKHNu;
    public ComboBox cbLoaiKhachHang;
    public TextArea txtGhiChuKhachHang;
    public TextField txtTimTenKH;
    public ComboBox cbTimLoaiKH;
    public Button btnTimKH;
    public Tab tabKhachHang;
    public TableColumn columMaKH;
    public TableColumn columTenKH;
    public TableColumn columNgaySinhKH;
    public TableColumn columGioiTinhKH;
    public TableColumn columDiaChiKH;
    public TableColumn columSDTKH;
    public TableColumn columLoaiKH;
    public TableColumn columChuThichKH;
    public TextField txtMaSP;
    public TextField txtTenSP;
    public TextField txtGiaNhapSP;
    public TextField txtGiaBanSP;
    public TextArea txtChuThichSP;
    public TextField txtTonKhoSP;
    public Button btnThemSP;
    public Button btnXoaSP;
    public Button btnResetSP;
    public Button btnSuaSP;
    public RadioButton radTimTheoTenSP;
    public ToggleGroup TimSanPhamGroup;
    public RadioButton radTimTheoLoaiSP;
    public ComboBox cboTimLoaiSanPhamSP;
    public Button btnXemSPAn;
    public ComboBox cboLoaiSanPhamSP;
    public RadioButton radTimTheoMaSP;
    public TableView tblSanPhamSP;
    public TableColumn columMaSanPhamSP;
    public TableColumn columTenSanPhanSP;
    public TableColumn columGiaNhapSP;
    public TableColumn columLoaiSanPhamSP;
    public TableColumn columHangSanXuatSP;
    public TableColumn columGiaBanSP;
    public TableColumn columTonKhoSP;
    public TableColumn columChuThichSP;
    public TableView tblLoaiSP;
    public TableColumn columMaLoaiSanPhamLSP;
    public TableColumn columTenLoaiSanPhamLSP;
    public TableView tblSanPhamHetHang;
    public TableColumn columMaSanPhamHH;
    public TableColumn columTenSanPhamHH;
    public TableColumn ColumLoaiSanPhamHH;
    public TextField txtTenLoaiSPLSP;
    public Button btnSuaLSP;
    public Button btnReSetLSP;
    public Button btnThemLSP;
    public Button btnXoaLSP;
    public Button btnAnSanPhamHH;
    public Button btnAnTatCaSanPhamHH;
    public TableView tblNhanVien;
    public TableColumn columMaNhanVien;
    public TableColumn columTenNhanVien;
    public TableColumn columNgaySinhNhanVien;
    public TableColumn columGioiTinhNhanVien;
    public TableColumn columNgayVaoLamNhanVien;
    public TableColumn columChucVuNhanVien;
    public TableColumn columDiaChiNhanVien;
    public TableColumn columSDTNhanVien;
    public TableColumn columChuThichNhanVien;
    public TextField txtMaNhanVien;
    public TextField txtTenNhanVien;
    public TextArea txtChuThichNV;
    public TextField txtDiaChiNhanVien;
    public TextField txtSDTNhanVien;
    public TextField txtTimKiemNhanVien;
    public DatePicker dateNgaySinhNV;
    public DatePicker dateNgayVaoLamNV;
    public ComboBox cboChucVuNhanVien;
    public RadioButton radNVNam;
    public ToggleGroup GioiTinhNVGroup;
    public RadioButton radNVNu;
    public Button btnXoaNhanVien;
    public Button btnSuaNhanVien;
    public Button btnThemNhanVien;
    public Button btnReSetNhanVien;
    public RadioButton radTimTheoTen;
    public RadioButton radTimTheoMa;
    public TableView tblThongTinTaiKhoan;
    public TableColumn columTenNhanVienTK;
    public TableColumn columUserTK;
    public TableColumn columPassTK;
    public TableColumn columQuyenTk;
    public TableColumn columChuThichTK;
    public TableColumn columIdTK;
    public TextField txtIDTK;
    public ComboBox cboTenNhanVienTK;
    public TextField txtUserTK;
    public ComboBox cboQuyenTK;
    public TextField txtPassTK;
    public TextArea txtChuThichTK;
    public Button btnThemTK;
    public Button btnXoaTk;
    public Button btnSuaTK;
    public Button btnResetTK;
    public ToggleGroup TimKiemNVGroup;
    public ToggleGroup GioiTinhKHGroup;
    public Button btnResetKH;
    public TextField txtTimKiemSP;
    public ImageView imgSanPham;
    public Tab tabTaiKhoan;
    public Tab tabLoaiSanPham;
    public TextField txtMaLoaiSPLSP;
    public Button btnDoiHinh;
    public AnchorPane snchorPaneSanPham;
    public Tab tabSanPham;
    public ComboBox cboHangSanXuatSP;
    public Button btnXoaHinh;

    private FileChooser fileChooser;
    private File file;
    private Image image;
    private Image imageno=new Image("file:khongcoanh.png");
    private Stage stage;
    private String diachianh="NULL";

    //Tạo List
    ArrayList<NhaPhanPhoi> listNhaPhanPhoi;
    ArrayList<KhachHang> listKhachHang;
    ArrayList<NhanVien> listNhanVien;
    ArrayList<TaiKhoan> listTaiKhoan;
    ArrayList<LoaiSanPham> listLoaiSanPham;
    ArrayList<SanPham> listSanPham;

    //Tạo list Cho Combobox
    private ObservableList lisLoaiKhachHang;
    private ObservableList listChucVuNhanVien;
    private ObservableList listQuyen;
    private ObservableList listTenNhanVien;
    private ObservableList lisLoaiSanPhamcbo;
    private ObservableList listHangSanXuat;
    //lấy Truyền dữ liệu vào bảng
    private void getTableNPP(){
       // dataNPP = FXCollections.observableArrayList();
        setCellTableNPP();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from NhaPhanPhoi";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listNhaPhanPhoi = new ArrayList<NhaPhanPhoi>();
            while(rs.next()) {
                NhaPhanPhoi e=new NhaPhanPhoi(rs.getInt(1),
                        rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),
                        rs.getString(6));
                listNhaPhanPhoi.add(e);
            }
            tblNhaPhanPhoi.getItems().clear();
            tblNhaPhanPhoi.getItems().addAll(listNhaPhanPhoi);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin"+ex);
        }
    }

    private void getTableKhachHang(){
        setCellTableKhachHang();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from KhachHang,LoaiKhachHang where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listKhachHang = new ArrayList<KhachHang>();
            while(rs.next()) {
                KhachHang dataKhachHang=new KhachHang(rs.getInt(1),
                        rs.getString(2),rs.getDate(3),
                        rs.getString(4),rs.getString(5),
                        rs.getString(6),rs.getString(10),rs.getString(8));
                listKhachHang.add(dataKhachHang);
            }
            tblBangKhachHang.getItems().clear();
            tblBangKhachHang.getItems().addAll(listKhachHang);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }

    private void getTableNhanVien(){
        setCellTableNhanVien();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from NhanVien,ChucVu where NhanVien.ChucVu=ChucVu.MaChucVu";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listNhanVien = new ArrayList<NhanVien>();
            while(rs.next()) {
                NhanVien dataNhanVien=new NhanVien(rs.getInt(1),
                        rs.getString(2),rs.getDate(3),
                        rs.getString(4),rs.getDate(5),
                        rs.getString(11),rs.getString(7),
                        rs.getString(8),rs.getString(9));
                listNhanVien.add(dataNhanVien);
            }
            tblNhanVien.getItems().clear();
            tblNhanVien.getItems().addAll(listNhanVien);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }

    private void getTableTaiKhoan(){
        serCellTableTaiKhoan();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from Users,Quyen,NhanVien where Users.Quyen=Quyen.MaQuyen and Users.MaNhanVien=NhanVien.MaNhanVien";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listTaiKhoan = new ArrayList<TaiKhoan>();
            while(rs.next()) {
                TaiKhoan dataTaiKhoan=new TaiKhoan(rs.getInt(1),
                        rs.getString(11),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(8),
                        rs.getString(6));
                listTaiKhoan.add(dataTaiKhoan);
            }
            tblThongTinTaiKhoan.getItems().clear();
            tblThongTinTaiKhoan.getItems().addAll(listTaiKhoan);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin Tài Khoản"+ex);
        }
    }

    private void getTableLoaiSP(){
        // dataNPP = FXCollections.observableArrayList();
        setCellTableLoaiSP();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from LoaiSanPham";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listLoaiSanPham = new ArrayList<LoaiSanPham>();
            while(rs.next()) {
                LoaiSanPham e=new LoaiSanPham(rs.getInt(1),
                        rs.getString(2));
                listLoaiSanPham.add(e);
            }
            tblLoaiSP.getItems().clear();
            tblLoaiSP.getItems().addAll(listLoaiSanPham);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin"+ex);
        }
    }

    private void getTableSanPham(){
        setCellTableSanPham();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listSanPham = new ArrayList<SanPham>();
            while(rs.next()) {
                SanPham dataSanPham=new SanPham(rs.getInt(1),
                        rs.getString(2),rs.getString(14),
                        rs.getString(12),rs.getString(5),
                        rs.getString(6),rs.getString(7),
                        rs.getInt(8), rs.getString(10));
                listSanPham.add(dataSanPham);
            }
            tblSanPhamSP.getItems().clear();
            tblSanPhamSP.getItems().addAll(listSanPham);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }

    private void getTableSanPhamHH(){
        setCellTableSanPhamHH();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and TonKho=0" ;
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listSanPham = new ArrayList<SanPham>();
            while(rs.next()) {
                SanPham dataSanPham=new SanPham(rs.getInt(1),
                        rs.getString(2),rs.getString(14),
                        rs.getString(12),rs.getString(5),
                        rs.getString(6),rs.getString(7),
                        rs.getInt(8),rs.getString(10));
                listSanPham.add(dataSanPham);
            }
            tblSanPhamHetHang.getItems().clear();
            tblSanPhamHetHang.getItems().addAll(listSanPham);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }

    //set vị trí của các cột trong bảng
    private void setCellTableNPP(){
        columMaNPP.setCellValueFactory(new PropertyValueFactory<>("maNhaPhanPhoi"));
        columTenNPP.setCellValueFactory(new PropertyValueFactory<>("tenNhaPhanPhoi"));
        columDiaChiNPP.setCellValueFactory(new PropertyValueFactory<>("diaChiNPP"));
        columSDTNPP.setCellValueFactory(new PropertyValueFactory<>("sdtNPP"));
        columEmailNPP.setCellValueFactory(new PropertyValueFactory<>("emailNPP"));
        columChuThichNPP.setCellValueFactory(new PropertyValueFactory<>("chuThichNPP"));
    }

    private void setCellTableKhachHang(){
        columMaKH.setCellValueFactory(new PropertyValueFactory<>("maKhachHang"));
        columTenKH.setCellValueFactory(new PropertyValueFactory<>("tenKhachHang"));
        columNgaySinhKH.setCellValueFactory(new PropertyValueFactory<>("ngaySinh"));
        columGioiTinhKH.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
        columDiaChiKH.setCellValueFactory(new PropertyValueFactory<>("diaChi"));
        columSDTKH.setCellValueFactory(new PropertyValueFactory<>("sdt"));
        columLoaiKH.setCellValueFactory(new PropertyValueFactory<>("loaiKhachHang"));
        columChuThichKH.setCellValueFactory(new PropertyValueFactory<>("ghiChu"));
    }

    private void setCellTableNhanVien(){
        columMaNhanVien.setCellValueFactory(new PropertyValueFactory<>("maNhanVien"));
        columTenNhanVien.setCellValueFactory(new PropertyValueFactory<>("tenNhanVien"));
        columNgaySinhNhanVien.setCellValueFactory(new PropertyValueFactory<>("ngaySinh"));
        columGioiTinhNhanVien.setCellValueFactory(new PropertyValueFactory<>("gioiTinh"));
        columNgayVaoLamNhanVien.setCellValueFactory(new PropertyValueFactory<>("ngayVaoLam"));
        columChucVuNhanVien.setCellValueFactory(new PropertyValueFactory<>("chucVu"));
        columDiaChiNhanVien.setCellValueFactory(new PropertyValueFactory<>("diaChi"));
        columSDTNhanVien.setCellValueFactory(new PropertyValueFactory<>("soDienThoai"));
        columChuThichNhanVien.setCellValueFactory(new PropertyValueFactory<>("ghiChu"));
    }

    private void serCellTableTaiKhoan(){
        columIdTK.setCellValueFactory(new PropertyValueFactory<>("id"));
        columTenNhanVienTK.setCellValueFactory(new PropertyValueFactory<>("TenNhanVien"));
        columUserTK.setCellValueFactory(new PropertyValueFactory<>("user"));
        columPassTK.setCellValueFactory(new PropertyValueFactory<>("pass"));
        columQuyenTk.setCellValueFactory(new PropertyValueFactory<>("quyen"));
        columChuThichTK.setCellValueFactory(new PropertyValueFactory<>("chuthich"));

    }

    private void setCellTableLoaiSP(){
        columMaLoaiSanPhamLSP.setCellValueFactory(new PropertyValueFactory<>("maLoaiSP"));
        columTenLoaiSanPhamLSP.setCellValueFactory(new PropertyValueFactory<>("tenLoaiSP"));

    }

    private void setCellTableSanPham(){
        columMaSanPhamSP.setCellValueFactory(new PropertyValueFactory<>("maSanPham"));
        columTenSanPhanSP.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
        columLoaiSanPhamSP.setCellValueFactory(new PropertyValueFactory<>("loaiSanPham"));
        columHangSanXuatSP.setCellValueFactory(new PropertyValueFactory<>("hangSanXuat"));
        columGiaNhapSP.setCellValueFactory(new PropertyValueFactory<>("giaNhap"));
        columGiaBanSP.setCellValueFactory(new PropertyValueFactory<>("giaBan"));
        columTonKhoSP.setCellValueFactory(new PropertyValueFactory<>("tonKho"));
        columChuThichSP.setCellValueFactory(new PropertyValueFactory<>("chuThich"));
    }

    private void setCellTableSanPhamHH(){
        columMaSanPhamHH.setCellValueFactory(new PropertyValueFactory<>("maSanPham"));
        columTenSanPhamHH.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
        ColumLoaiSanPhamHH.setCellValueFactory(new PropertyValueFactory<>("loaiSanPham"));

    }

    // Thêm
    private void themNPP() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strTenNPP,strDiaChiNPP,strSDTNPP,strEmailNPP,strChuThichNPP;
        strTenNPP=txtTenNPP.getText();
        strDiaChiNPP=txtDiaChiNPP.getText();
        strSDTNPP=txtSDTNPP.getText();
        strEmailNPP=txtEmailNPP.getText();
        strChuThichNPP=textChuThichNPP.getText();
        String sqlTim="select * from NhaPhanPhoi where TenNhaPhanPhoi= N'"+strTenNPP+"'";
        System.out.println(""+sqlTim);
        if(connectionClass.Tim(sqlTim)){
            ThongBao("Nhà Phân Phối đã có", " lỗi", 2);
        }else if(strTenNPP.length()==0||strDiaChiNPP.length()==0||strSDTNPP.length()==0){
            ThongBao("Thông Tin Nhà Phân Phối không được để trống", " lỗi", 2);
        }
        else {

            String sql="insert into NhaPhanPhoi values (N'"+strTenNPP+"',N'"+strDiaChiNPP+"',N'"+strSDTNPP+"',N'"+strEmailNPP+"',N'"+strChuThichNPP+"')";
            System.out.println(sql);
            connectionClass.ExcuteQueryUpdateDB(sql);
            ThongBao("Thêm Thành Công", "Thành Công", 2);
            setMacDinhNPP();
        }


    }

    private void themKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaKH="";
        String strTenKH;
        String strDiaChiKH;
        String strSDTKH;
        String strEmailKH;
        String strChuThichKH;
        String strGioiTinhKH = "nam";
        String strLoaiKH;
        int numLoaiKH=2;
        LocalDate strNgaySinhKH;
        strMaKH=strMaKH+txtMaKH.getText();
        strTenKH=txtTenKhachHang.getText();
        strDiaChiKH=txtDiaChiKH.getText();
        strEmailKH=txtTenKhachHang.getText();
        strSDTKH=txtSDTKhachHang.getText();
        strChuThichKH=txtGhiChuKhachHang.getText();
        strNgaySinhKH=dayNgaySinhKH.getValue();
        if(radGioiTinhKHNam.isSelected()){
            strGioiTinhKH="nam";
        }
        else {
            strGioiTinhKH="nữ";
        }
        strLoaiKH= cbLoaiKhachHang.getValue().toString();
        System.out.println(strLoaiKH);
        if(strLoaiKH.equals("vip")){
            numLoaiKH=1;
        }else if(strLoaiKH.equals("sinh viên")){
            numLoaiKH=3;
        }

        String sqlTim="select * from KhachHang where TenKhachHang= N'"+strTenKH+"'";
        System.out.println(""+sqlTim);
         if(strTenKH.length()==0||strDiaChiKH.length()==0||strSDTKH.length()==0||strNgaySinhKH==null||strMaKH.length()!=0){
            ThongBao("Thông Tin khách hàng không được để trống hoặc đã có khách hàng này", " lỗi", 2);
        }
        else {

            String sql="insert into KhachHang values (N'"+strTenKH+"','"
                    +strNgaySinhKH+"',N'"+strGioiTinhKH+"',N'"+strDiaChiKH
                    +"',N'"+strSDTKH+"',"+numLoaiKH+",N'"+strChuThichKH+"')";
            System.out.println(sql);
            connectionClass.ExcuteQueryUpdateDB(sql);
            ThongBao("Thêm Thành Công", "Thành Công", 2);
            setMacDinhKH();
            getTableKhachHang();
        }
    }

    private void themNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaNV = "";
        String strTenNV;
        LocalDate strngaySinhNV;
        String strgioiTinh= "nam";
        LocalDate strngayVaoLam;
        String strchucVu;
        String strdiaChi ;
        String strsoDienThoai;
        String strghiChu;
        int numChucVuNV=6;
        strMaNV=strMaNV+txtMaNhanVien.getText();
        strTenNV=txtTenNhanVien.getText();
        strdiaChi=txtDiaChiNhanVien.getText();
        strsoDienThoai=txtSDTNhanVien.getText();
        strghiChu=txtChuThichNV.getText();
        strngaySinhNV=dateNgaySinhNV.getValue();
        strngayVaoLam=dateNgayVaoLamNV.getValue();

        if(radNVNam.isSelected()){
            strgioiTinh="nam";
        }
        else {
            strgioiTinh="nữ";
        }

        strchucVu= cboChucVuNhanVien.getValue().toString();
        String sqlChucVu="select * from ChucVu where TenChucVu=N'"+strchucVu+"'";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVu);
        while(rs.next()) {
           numChucVuNV=rs.getInt(1);
        }
        System.out.println("Chuc Vu "+numChucVuNV+strchucVu);


        String sqlTim="select * from NhanVien where TenNhanVien= N'"+strTenNV+"'";
        if(strTenNV.length()==0||strdiaChi.length()==0||strsoDienThoai.length()==0||strngaySinhNV==null||strngayVaoLam==null||strMaNV.length()!=0){
            ThongBao("Thông Tin nhân viên không được để trống hoặc đã có", " lỗi", 2);
        }
        else {

            String sql="insert into NhanVien values (N'"+strTenNV+"','"+strngaySinhNV+"',N'"
                    +strgioiTinh+"','"+strngayVaoLam+"',"+numChucVuNV+",N'"+strdiaChi+"','"+strsoDienThoai+"',N'"+strghiChu+"')";
            System.out.println(sql);
            connectionClass.ExcuteQueryUpdateDB(sql);
            ThongBao("Thêm Thành Công", "Thành Công", 2);
            setMacDinhNhanVien();
            getTableNhanVien();
        }


    }

    private void ThemTaiKhoan() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strIDTK ;
        String strTenNV;
        String strUser;
        String strPass;
        String strQuyen ;
        String strChuThich;

        int numMaNhanVien=6;
        int numQuyen=5;

        strIDTK=txtIDTK.getText();
        strTenNV=cboTenNhanVienTK.getValue().toString();
        strUser=txtUserTK.getText();
        strPass=txtPassTK.getText();
        strChuThich=txtChuThichTK.getText();
        strQuyen=cboQuyenTK.getValue().toString();


        String sqlQuyen="select * from Quyen where TenQuyen=N'"+strQuyen+"'";
        ResultSet rs3= connectionClass.ExcuteQueryGetTable(sqlQuyen);
        while(rs3.next()) {
            numQuyen=rs3.getInt(1);
        }

        String sqlTen="select * from NhanVien where TenNhanVien=N'"+strTenNV+"'";
        ResultSet rs2= connectionClass.ExcuteQueryGetTable(sqlTen);
        while(rs2.next()) {
            numMaNhanVien=rs2.getInt(1);
        }

        if(strTenNV.length()==0||strUser.length()==0||strPass.length()==0||strQuyen.length()==0||strIDTK.length()!=0){
            ThongBao("Thông Tin tài khoản không được để trống hoặc đã có", " lỗi", 2);
        }
        else {

            String sql="insert into Users values ("+numMaNhanVien+",N'"+strUser+"',N'"
                    +strPass+"','"+numQuyen+"',N'"+strChuThich+"')";
            System.out.println(sql);
            connectionClass.ExcuteQueryUpdateDB(sql);
            ThongBao("Thêm Thành Công", "Thành Công", 2);
            setMacDinhTaiKhoan();
            getTableTaiKhoan();
        }

    }

    private void themLoaiSP() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaLSP,strTenLSP;
        strMaLSP=txtMaLoaiSPLSP.getText();
        strTenLSP=txtTenLoaiSPLSP.getText();

        String sqlTim="select * from NhaPhanPhoi where TenNhaPhanPhoi= N'"+strTenLSP+"'";
        System.out.println(""+sqlTim);
        if(connectionClass.Tim(sqlTim)){
            ThongBao("Loại sản phẩm đã có", " lỗi", 2);
        }else if(strTenLSP.length()==0||strMaLSP.length()!=0){
            ThongBao("Thông tin loai sản phẩm không được để trống hoặc đã có", " lỗi", 2);
        }
        else {

            String sql="insert into LoaiSanPham values (N'"+strTenLSP+"')";
            System.out.println(sql);
            connectionClass.ExcuteQueryUpdateDB(sql);
            ThongBao("Thêm Thành Công", "Thành Công", 2);
            setMacDinhLoaiSP();
            getTableLoaiSP();
        }
    }

    private void themSanPham() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaSP = "";
        String strTenSP;
        String strLoaiSP= "";
        String strHangSanXuat;
        String strGiaNhap ;
        String strGiaBan;
        String strTonKho;
        String strChuThich;
        int numLoaiSanPham=13;
        int numHangSanXuat=20;

        strMaSP=strMaSP+txtMaSP.getText();
        strTenSP=txtTenSP.getText();
        strGiaNhap=txtGiaNhapSP.getText();
        strGiaBan=txtGiaBanSP.getText();
        strTonKho=txtTonKhoSP.getText();
        strChuThich=txtChuThichSP.getText();
        strLoaiSP= cboLoaiSanPhamSP.getValue().toString();
        strHangSanXuat=cboHangSanXuatSP.getValue().toString();
        String sqlLoaiSP="select * from LoaiSanPham where TenLoaiSanPham=N'"+strLoaiSP+"'";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlLoaiSP);
        while(rs.next()) {
            numLoaiSanPham=rs.getInt(1);
        }


        String sqlHangSX="select * from HangSanXuat where TenHangSanXuat=N'"+strHangSanXuat+"'";
        ResultSet rs1= connectionClass.ExcuteQueryGetTable(sqlHangSX);
        while(rs1.next()) {
            numHangSanXuat=rs1.getInt(1);
        }


        if((strTenSP.length() == 0) || (strGiaBan.length() == 0) || (strGiaNhap.length() == 0) || (strTonKho.length() == 0) || (strMaSP.length() != 0)){
            ThongBao("Thông Tin sản phẩm không được để trống hoặc đã có", " lỗi", 2);
        }
        else {
            try{
                int numGiaNhap,numGiaBan,numSoluong;
                numGiaNhap=Integer.parseInt(strGiaNhap);
                numGiaBan=Integer.parseInt(strGiaBan);
                numSoluong=Integer.parseInt(strTonKho);
                if(numGiaNhap>numGiaBan){
                    ThongBao("Giá nhập không được lớn hơn giá bán", " lỗi", 2);
                }else if(numGiaNhap<10000){
                    ThongBao("Giá nhập không được nhỏ hơn 10000", " lỗi", 2);
                }else if(numSoluong<10){
                    ThongBao("Số lượng không được nhỏ hơn 10", " lỗi", 2);
                }else if(diachianh.equals("NULL")){
                    String sql="insert into SanPham values(N'"+strTenSP+"',"+numLoaiSanPham+","+numHangSanXuat+",'"
                            +numGiaNhap+"','"+numGiaBan+"',"+numSoluong+",1,NULL,N'"+strChuThich+"')";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    ThongBao("Thêm Thành Công", "Thành Công", 2);
                    setMacDinhSanPham();
                    getTableSanPham();
                }else {
                    String sql="insert into SanPham values(N'"+strTenSP+"',"+numLoaiSanPham+","+numHangSanXuat+",'"
                            +numGiaNhap+"','"+numGiaBan+"',"+numSoluong+",1,(SELECT * from Openrowset(Bulk '"+diachianh+"', Single_Blob) as img),N'"+strChuThich+"')";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    ThongBao("Thêm Thành Công", "Thành Công", 2);
                    setMacDinhSanPham();
                    getTableSanPham();
                }
            }
            catch (Exception e){
                ThongBao("Vui lòng điền đúng thông tin (giá nhập , giá bán , số lượng )", " lỗi", 2);
            }
        }



    }

    //Chức Năng reset
    private void   setMacDinhNPP(){
        txtMaNPP.setText("");
        txtDiaChiNPP.setText("");
        txtEmailNPP.setText("");
        txtSDTNPP.setText("");
        txtTenNPP.setText("");
        textChuThichNPP.setText("");
        getTableNPP();
    }

    private void   setMacDinhNhanVien() throws SQLException {
        txtMaNhanVien.setText("");
        txtTenNhanVien.setText("");
        radNVNam.setSelected(true);
        txtDiaChiNhanVien.setText("");
        txtSDTNhanVien.setText("");
        txtChuThichNV.setText("");
        dateNgayVaoLamNV.setValue(LocalDate.now());
        dateNgaySinhNV.setValue(LocalDate.now());
        getTableNhanVien();

    }

    private void   setMacDinhKH() throws SQLException {
        txtMaKH.setText("");
        txtTenKhachHang.setText("");
        radGioiTinhKHNam.setSelected(true);
        txtDiaChiKH.setText("");
        txtSDTKhachHang.setText("");
        txtGhiChuKhachHang.setText("");
        dayNgaySinhKH.setValue(LocalDate.now());
        cboChucVuNhanVien.setValue("Chưa Có");
        getTableKhachHang();
    }

    private void setMacDinhTaiKhoan(){
        txtIDTK.setText("");
        cboTenNhanVienTK.setValue("");
        txtUserTK.setText("");
        txtPassTK.setText("");
        cboQuyenTK.setValue("");
        txtChuThichTK.setText("");
        getTableTaiKhoan();
    }

    private void   setMacDinhLoaiSP(){
        txtTenLoaiSPLSP.setText("");
        txtMaLoaiSPLSP.setText("");
        getTableLoaiSP();
    }

    private void   setMacDinhSanPham() throws SQLException {
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtGiaBanSP.setText("");
        txtGiaNhapSP.setText("");
        txtTonKhoSP.setText("");
        txtChuThichSP.setText("");
        cboLoaiSanPhamSP.setValue("Loại Khác");
        cboHangSanXuatSP.setValue("Hãng Khác");
        imgSanPham.setImage(imageno);
        getTableSanPham();
    }

    //Truyền dữ liệu vào combobox
    private  String getComboxLoaiKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        lisLoaiKhachHang = FXCollections.observableArrayList();
        String sqlGetLoaiKhachHang="select * from LoaiKhachHang";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlGetLoaiKhachHang);
        while(rs.next()) {
            lisLoaiKhachHang.add(rs.getString(2));
        }
        cbLoaiKhachHang.setItems(lisLoaiKhachHang);
        cbLoaiKhachHang.setValue("thường");
        return (String) cbLoaiKhachHang.getValue();
    }

    private  String getComboxLoaiKhachHangTimKiem() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        lisLoaiKhachHang = FXCollections.observableArrayList();
        String sqlGetLoaiKhachHang="select * from LoaiKhachHang";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlGetLoaiKhachHang);
        while(rs.next()) {
            lisLoaiKhachHang.add(rs.getString(2));
        }
        cbTimLoaiKH.setItems(lisLoaiKhachHang);
        cbTimLoaiKH.setValue("thường");
        return (String) cbTimLoaiKH.getValue();
    }

    private  String getComboxChucVuNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listChucVuNhanVien = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select * from ChucVu";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        while(rs.next()) {
            listChucVuNhanVien.add(rs.getString(2));
        }
        cboChucVuNhanVien.setItems(listChucVuNhanVien);
        cboChucVuNhanVien.setValue("Chưa Có");
        return (String) cboChucVuNhanVien.getValue();
    }

    private String getComboxQuyen() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listQuyen = FXCollections.observableArrayList();
        String sqlQuyen="select * from Quyen";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlQuyen);
        while(rs.next()) {
            listQuyen.add(rs.getString(2));
        }
        cboQuyenTK.setItems(listQuyen);
        cboQuyenTK.setValue("New");
        return (String) cboQuyenTK.getValue();
    }

    private String getComboxTenNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listTenNhanVien = FXCollections.observableArrayList();
        String sqlTenNV="select * from NhanVien";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlTenNV);
        while(rs.next()) {
            listTenNhanVien.add(rs.getString(2));
        }
        cboTenNhanVienTK.setItems(listTenNhanVien);
        cboTenNhanVienTK.setValue("New");
        return (String) cboTenNhanVienTK.getValue();
    }

    private  String getComboxLoaiSanPham() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        lisLoaiSanPhamcbo = FXCollections.observableArrayList();
        String sqlLoaiSanPham="select * from LoaiSanPham";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlLoaiSanPham);
        while(rs.next()) {
            lisLoaiSanPhamcbo.add(rs.getString(2));
        }
        cboLoaiSanPhamSP.setItems(lisLoaiSanPhamcbo);
        cboLoaiSanPhamSP.setValue("Loại Khác");
        return (String) cboLoaiSanPhamSP.getValue();
    }

    private String getComboxTimTheoLoaiSP() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        lisLoaiSanPhamcbo = FXCollections.observableArrayList();
        String sqlLoaiSanPham="select * from LoaiSanPham";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlLoaiSanPham);
        while(rs.next()) {
            lisLoaiSanPhamcbo.add(rs.getString(2));
        }
        cboTimLoaiSanPhamSP.setItems(lisLoaiSanPhamcbo);
        cboTimLoaiSanPhamSP.setValue("Loại Khác");
        return (String) cboTimLoaiSanPhamSP.getValue();
    }

    private  String getComboxHangSanXuat() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listHangSanXuat = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select * from HangSanXuat";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        while(rs.next()) {
            listHangSanXuat.add(rs.getString(2));
        }
        cboHangSanXuatSP.setItems(listHangSanXuat);
        cboHangSanXuatSP.setValue("Hãng Khác");
        return (String) cboHangSanXuatSP.getValue();
    }

    //Sửa Thông tin
    private void suaThongTinNhaPhanPhoi(){
        String strMaNPP=txtMaNPP.getText();
        String strTenNPP=txtTenNPP.getText();
        String strDiaChiNPP=txtDiaChiNPP.getText();
        String strSDT=txtSDTNPP.getText();
        String strEmail=txtEmailNPP.getText();
        String strChuThich=textChuThichNPP.getText();
        if(ThongBaoDelete("Bạn muốn sửa Nhà Phân Phối: "+strTenNPP)==true){
            if(strMaNPP.length()==0){
                ThongBao("Vui lòng chọn nhà phân phối: "+strTenNPP, "Thông Báo", 2);
            }else {
                String sqlXoaNPP="update NhaPhanPhoi set TenNhaPhanPhoi= N'"+strTenNPP
                        +"',DiaChi=N'"+strDiaChiNPP+"',SDT='"+strSDT+"',Email='"+strEmail+"',ChuThich='"+strChuThich+"'  where MaNhaPhanPhoi ='"+strMaNPP+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryUpdateDB(sqlXoaNPP);
                getTableNPP();
                setMacDinhNPP();
                ThongBao("Cập nhật Thành Công Nhà Phân Phối: "+strTenNPP, "Thông Báo", 2);
            }
        }
    }

    private void suaThongTinKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaKH;
        String strTenKH;
        String strDiaChiKH;
        String strSDTKH;
        String strEmailKH;
        String strChuThichKH;
        String strGioiTinhKH = "nam";
        String strLoaiKH;
        int numLoaiKH=2;
        LocalDate strNgaySinhKH;
        strMaKH=txtMaKH.getText();
        strTenKH=txtTenKhachHang.getText();
        strDiaChiKH=txtDiaChiKH.getText();
        strEmailKH=txtTenKhachHang.getText();
        strSDTKH=txtSDTKhachHang.getText();
        strChuThichKH=txtGhiChuKhachHang.getText();
        strNgaySinhKH=dayNgaySinhKH.getValue();
        if(radGioiTinhKHNam.isSelected()){
            strGioiTinhKH="nam";
        }
        else {
            strGioiTinhKH="nữ";
        }
        strLoaiKH= getComboxLoaiKhachHang();
        if(strLoaiKH.equals("vip")){
            numLoaiKH=1;
        }else if(strLoaiKH.equals("sinh viên")){
            numLoaiKH=3;
        }



        if(ThongBaoDelete("Bạn muốn sửa Khách Hàng: "+strTenKH)==true){
            if(strMaKH.length()==0){
                ThongBao("Vui lòng chọn Khách hàng: "+strTenKH, "Thông Báo", 2);
            }else {
                String sqlXoaNPP="update KhachHang set TenKhachHang= N'"+strTenKH
                        +"',NgaySinh='"+strNgaySinhKH+"',GioiTinh=N'"+strGioiTinhKH
                        +"',DiaChi=N'"+strDiaChiKH+"',SDT='"+strSDTKH+"',LoaiKhachHang='"
                        +numLoaiKH+"',GhiChu=N'"+strChuThichKH+"'  where MaKhachHang ='"+strMaKH+"'";
                System.out.println(sqlXoaNPP);
                connectionClass.ExcuteQueryUpdateDB(sqlXoaNPP);
                getTableKhachHang();
                setMacDinhKH();
                ThongBao("Cập nhật Thành Công Khách Hàng: "+strTenKH, "Thông Báo", 2);
            }
        }
    }

    private void suaThongTinNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaNV = "";
        String strTenNV;
        LocalDate strngaySinhNV;
        String strgioiTinh= "nam";
        LocalDate strngayVaoLam;
        String strchucVu;
        String strdiaChi ;
        String strsoDienThoai;
        String strghiChu;
        int numChucVuNV=6;
        strMaNV=txtMaNhanVien.getText();
        strTenNV=txtTenNhanVien.getText();
        strdiaChi=txtDiaChiNhanVien.getText();
        strsoDienThoai=txtSDTNhanVien.getText();
        strghiChu=txtChuThichNV.getText();
        strngaySinhNV=dateNgaySinhNV.getValue();
        strngayVaoLam=dateNgayVaoLamNV.getValue();

        if(radNVNam.isSelected()){
            strgioiTinh="nam";
        }
        else {
            strgioiTinh="nữ";
        }

        strchucVu= cboChucVuNhanVien.getValue().toString();
        String sqlChucVu="select * from ChucVu where TenChucVu=N'"+strchucVu+"'";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVu);
        while(rs.next()) {
            numChucVuNV=rs.getInt(1);
        }
        System.out.println("Chuc Vu "+numChucVuNV+strchucVu);

        if(ThongBaoDelete("Bạn muốn sửa Nhân Viên: "+strTenNV)==true){
            if(strMaNV.length()==0){
                ThongBao("Vui lòng chọn Nhân Viên: "+strTenNV, "Thông Báo", 2);
            }else {
                String sqlThemNhanVien="update NhanVien set TenNhanVien=N'"+strTenNV+"',NgaySinh='"+strngaySinhNV+"',GioiTinh=N'"
                        +strgioiTinh+"',NgayVaoLam='"+strngayVaoLam+"',ChucVu="+numChucVuNV+",DiaChi=N'"+strdiaChi+"',SoDT='"
                        +strsoDienThoai+"',GhiChu=N'"+strghiChu+"' where MaNhanVien='"+strMaNV+"'";
                System.out.println(sqlThemNhanVien);
                connectionClass.ExcuteQueryUpdateDB(sqlThemNhanVien);
                getTableNhanVien();
                setMacDinhNhanVien();
                ThongBao("Cập nhật Thành Công Nhân Viên: "+strTenNV, "Thông Báo", 2);
            }
        }
    }

    private void suaThongTinTaiKhoan() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strIDTK ;
        String strTenNV;
        String strUser;
        String strPass;
        String strQuyen ;
        String strChuThich;

        int numMaNhanVien=6;
        int numQuyen=5;

        strIDTK=txtIDTK.getText();
        strTenNV=cboTenNhanVienTK.getValue().toString();
        strUser=txtUserTK.getText();
        strPass=txtPassTK.getText();
        strChuThich=txtChuThichTK.getText();
        strQuyen=cboQuyenTK.getValue().toString();


        String sqlQuyen="select * from Quyen where TenQuyen=N'"+strQuyen+"'";
        ResultSet rs3= connectionClass.ExcuteQueryGetTable(sqlQuyen);
        while(rs3.next()) {
            numQuyen=rs3.getInt(1);
        }

        String sqlTen="select * from NhanVien where TenNhanVien=N'"+strTenNV+"'";
        ResultSet rs2= connectionClass.ExcuteQueryGetTable(sqlTen);
        while(rs2.next()) {
            numMaNhanVien=rs2.getInt(1);
        }

        if(ThongBaoDelete("Bạn muốn sửa Tài Khoản: "+strUser)==true){
            if(strIDTK.length()==0){
                ThongBao("Vui lòng chọn Tài Khoản: ", "Thông Báo", 2);
            }else {
                String sqlSuaTaiKhoan="update Users set MaNhanVien="+numMaNhanVien+",TenDangNhap=N'"+strUser+"',Password=N'"
                        +strPass+"',Quyen="+numQuyen+",ChuThich=N'"+strChuThich+"' where ID= "+strIDTK+"";
                connectionClass.ExcuteQueryUpdateDB(sqlSuaTaiKhoan);
                getTableTaiKhoan();
                setMacDinhTaiKhoan();
                ThongBao("Cập nhật Thành Công tài khoản: "+strUser, "Thông Báo", 2);
            }
        }
    }

    private void suaThongTinLoaiSP(){
        String strMaLSP=txtMaLoaiSPLSP.getText();
        String strTenLSP=txtTenLoaiSPLSP.getText();

        if(ThongBaoDelete("Bạn muốn sửa Nhà Phân Phối: "+strTenLSP)==true){
            if(strMaLSP.length()==0){
                ThongBao("Vui lòng chọn loại sản phẩm: "+strTenLSP, "Thông Báo", 2);
            }else {
                String sqlXoaNPP="update LoaiSanPham set TenLoaiSanPham= N'"+strTenLSP
                        +"'  where MaLoaiSanPham ='"+strMaLSP+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryUpdateDB(sqlXoaNPP);
                getTableLoaiSP();
                setMacDinhLoaiSP();
                ThongBao("Cập nhật Thành Công Loại Sản Phẩm: "+strTenLSP, "Thông Báo", 2);
            }
        }
    }

    private void suaThongTinSanPham() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaSP = "";
        String strTenSP;
        String strLoaiSP= "";
        String strHangSanXuat;
        String strGiaNhap ;
        String strGiaBan;
        String strTonKho;
        String strChuThich;
        int numLoaiSanPham=13;
        int numHangSanXuat=20;

        strMaSP=strMaSP+txtMaSP.getText();
        strTenSP=txtTenSP.getText();
        strGiaNhap=txtGiaNhapSP.getText();
        strGiaBan=txtGiaBanSP.getText();
        strTonKho=txtTonKhoSP.getText();
        strChuThich=txtChuThichSP.getText();
        strLoaiSP= cboLoaiSanPhamSP.getValue().toString();
        strHangSanXuat=cboHangSanXuatSP.getValue().toString();
        String sqlLoaiSP="select * from LoaiSanPham where TenLoaiSanPham=N'"+strLoaiSP+"'";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlLoaiSP);
        while(rs.next()) {
            numLoaiSanPham=rs.getInt(1);
        }


        String sqlHangSX="select * from HangSanXuat where TenHangSanXuat=N'"+strHangSanXuat+"'";
        ResultSet rs1= connectionClass.ExcuteQueryGetTable(sqlHangSX);
        while(rs1.next()) {
            numHangSanXuat=rs1.getInt(1);
        }

        if(ThongBaoDelete("Bạn muốn sửa sản phẩm: "+strTenSP)==true){
            if(strMaSP.length()==0){
                ThongBao("Vui lòng chọn sản phẩm: "+strTenSP, "Thông Báo", 2);
            }else {
                try{
                    int numGiaNhap,numGiaBan,numSoluong;
                    numGiaNhap=Integer.parseInt(strGiaNhap);
                    numGiaBan=Integer.parseInt(strGiaBan);
                    numSoluong=Integer.parseInt(strTonKho);
                    if(numGiaNhap>numGiaBan){
                        ThongBao("Giá nhập không được lớn hơn giá bán", " lỗi", 2);
                    }else if(numGiaNhap<10000){
                        ThongBao("Giá nhập không được nhỏ hơn 10000", " lỗi", 2);
                    }else if(numSoluong<10){
                        ThongBao("Số lượng không được nhỏ hơn 10", " lỗi", 2);
                    }else {
                        String sql="update SanPham set TenSanPham=N'"+strTenSP+"',LoaiSanPham="+numLoaiSanPham+",HangSanXuat="
                                +numHangSanXuat+",GiaNhap='"+numGiaNhap+"',GiaBan='"+numGiaBan+"',TonKho="+numSoluong+",ChuThich=N'"
                                +strChuThich+"' where MaSanPham='"+strMaSP+"'";
                        System.out.println(sql);
                        connectionClass.ExcuteQueryUpdateDB(sql);
                        ThongBao("Cập Nhật Thành Công", "Thành Công", 2);
                        setMacDinhSanPham();
                        getTableSanPham();
                    }
                }
                catch (Exception e){
                    ThongBao("Vui lòng điền đúng thông tin (giá nhập , giá bán , số lượng )", " lỗi", 2);
                }
            }
        }
    }

    //Xóa Thông Tin
    private void XoaThongTinNhaPhanPhoi(){
        String strMaNPP=txtMaNPP.getText();
        String strTenNPP=txtTenNPP.getText();
        if(ThongBaoDelete("Bạn muốn xóa Nhà Phân Phối: "+strTenNPP)==true){
            if(strMaNPP.length()==0){
                ThongBao("Vui lòng chọn nhà phân phối: "+strTenNPP, "Thông Báo", 2);
            }else {
                String sqlXoaNPP="delete from NhaPhanPhoi where MaNhaPhanPhoi ='"+strMaNPP+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryDeleteDB(sqlXoaNPP,strTenNPP);
                getTableNPP();
                setMacDinhNPP();
                //ThongBao("Xóa Thành Công Nhà Phân Phối: "+strTenNPP, "Thông Báo", 2);
            }
        }
    }

    private void XoaThongTinKhachHang() throws SQLException {
        String strMaKH=txtMaKH.getText();
        String strTenKH=txtTenKhachHang.getText();
        if(ThongBaoDelete("Bạn muốn xóa khách hàng: "+strTenKH)==true){
            if(strMaKH.length()==0){
                ThongBao("Vui lòng chọn khách hàng: "+strTenKH, "Thông Báo", 2);
            }else {
                String sqlXoaKH="delete from KhachHang where MaKhachHang ='"+strMaKH+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryDeleteDB(sqlXoaKH,strTenKH);
                getTableKhachHang();
                setMacDinhKH();
                //ThongBao("Xóa Thành Công Khách Hàng: "+strTenKH, "Thông Báo", 2);
            }
        }
    }

    private void XoaThongTinNhanVien() throws SQLException {
        String strMaNV=txtMaNhanVien.getText();
        String strTenNV=txtTenNhanVien.getText();
        if(ThongBaoDelete("Bạn muốn xóa nhân viên: "+strTenNV)==true){
            if(strMaNV.length()==0){
                ThongBao("Vui lòng chọn nhân viên: "+strTenNV, "Thông Báo", 2);
            }else {
                String sqlXoaNV="delete from NhanVien where MaNhanVien ='"+strMaNV+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryDeleteDB(sqlXoaNV,strTenNV);
                getTableNhanVien();
                setMacDinhNhanVien();
            }
        }
    }

    private void XoaThongTinTaiKhoan() throws SQLException {
        String strIDTK=txtIDTK.getText();
        String strTenTK=txtUserTK.getText();
        if(strIDTK.equals("1")){
            ThongBao("Bạn Không Thể Xóa tài Khoản của admin với bất kỳ Quyền nào", "Cảnh Báo", 2);
        }else{
            if(ThongBaoDelete("Bạn muốn xóa tài khoản: "+strTenTK)==true){
                if(strIDTK.length()==0){
                    ThongBao("Vui lòng chọn tài khoản muốn xóa: "+strTenTK, "Thông Báo", 2);
                }else {
                    String sqlXoaTK="delete from Users where ID ='"+strIDTK+"'";
                    ConnectionClass connectionClass=new ConnectionClass();
                    connectionClass.ExcuteQueryDeleteDB(sqlXoaTK,strTenTK);
                    getTableTaiKhoan();
                    setMacDinhTaiKhoan();

                }
            }
        }
    }

    private void XoaThongTinLoaiSP(){
        String strMaLSP=txtMaLoaiSPLSP.getText();
        String strTenLSP=txtTenLoaiSPLSP.getText();
        if(ThongBaoDelete("Bạn muốn xóa Loại Sản Phẩm: "+strTenLSP)==true){
            if(strMaLSP.length()==0){
                ThongBao("Vui lòng chọn Loại Sản Phẩm: "+strTenLSP, "Thông Báo", 2);
            }else {
                String sqlXoaNPP="delete from LoaiSanPham where MaLoaiSanPham ='"+strMaLSP+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryDeleteDB(sqlXoaNPP,strTenLSP);
                getTableLoaiSP();
                setMacDinhLoaiSP();
                //ThongBao("Xóa Thành Công Nhà Phân Phối: "+strTenNPP, "Thông Báo", 2);
            }
        }
    }

    private void XoaThongTinSanPham() throws SQLException {
        String strMaSP=txtMaSP.getText();
        String strTenSP=txtTenSP.getText();
        if(ThongBaoDelete("Bạn muốn xóa sản phẩm "+strTenSP)==true){
            if(strMaSP.length()==0){
                ThongBao("Vui lòng chọn sản phẩm: "+strTenSP, "Thông Báo", 2);
            }else {
                String sqlXoaNV="delete from SanPham where MaSanPham ='"+strMaSP+"'";
                ConnectionClass connectionClass=new ConnectionClass();
                connectionClass.ExcuteQueryDeleteDB(sqlXoaNV,strTenSP);
                getTableSanPham();
                setMacDinhSanPham();
            }
        }
    }

    //lấy dữ liệu khi nhấn vào table
    private void getDaTaNPP(int index){
        NhaPhanPhoi nhaPhanPhoi= tblNhaPhanPhoi.getItems().get(index);
        txtMaNPP.setText(""+nhaPhanPhoi.getMaNhaPhanPhoi());
        txtTenNPP.setText(nhaPhanPhoi.getTenNhaPhanPhoi());
        txtDiaChiNPP.setText(nhaPhanPhoi.getDiaChiNPP());
        txtSDTNPP.setText(nhaPhanPhoi.getSdtNPP());
        txtEmailNPP.setText(nhaPhanPhoi.getEmailNPP());
        textChuThichNPP.setText(nhaPhanPhoi.getChuThichNPP());

    }

    private void getDaTaKhachHang(int index) throws SQLException {
        KhachHang khachHang= tblBangKhachHang.getItems().get(index);
        txtMaKH.setText(""+khachHang.getMaKhachHang());
        txtTenKhachHang.setText(khachHang.getTenKhachHang());
        dayNgaySinhKH.setValue(LocalDate.parse(khachHang.getNgaySinh().toString()));
        String gioitinh=khachHang.getGioiTinh();
        if(gioitinh.equals("nam")){
            radGioiTinhKHNam.setSelected(true);
        }
        else {
            radGioiTinhKHNu.setSelected(true);
        }
        txtDiaChiKH.setText(khachHang.getDiaChi());
        cbLoaiKhachHang.setValue(khachHang.getLoaiKhachHang());
        txtSDTKhachHang.setText(khachHang.getSdt());
        txtGhiChuKhachHang.setText(khachHang.getGhiChu());


    }

    private void getDaTaNhanVien(int index) throws SQLException {
        NhanVien nhanVien= (NhanVien) tblNhanVien.getItems().get(index);
        txtMaNhanVien.setText(""+nhanVien.getMaNhanVien());
        txtTenNhanVien.setText(nhanVien.getTenNhanVien());
        dateNgaySinhNV.setValue(LocalDate.parse(nhanVien.getNgaySinh().toString()));
        dateNgayVaoLamNV.setValue(LocalDate.parse(nhanVien.getNgayVaoLam().toString()));
        String gioitinh=nhanVien.getGioiTinh();
        if(gioitinh.equals("nam")){
            radGioiTinhKHNam.setSelected(true);
        }
        else {
            radGioiTinhKHNu.setSelected(true);
        }

        txtDiaChiNhanVien.setText(nhanVien.getDiaChi());
        cboChucVuNhanVien.setValue(nhanVien.getChucVu());
        txtSDTNhanVien.setText(nhanVien.getSoDienThoai());
        txtChuThichNV.setText(nhanVien.getGhiChu());


    }

    private void getDaTaTaiKhoan(int index) throws SQLException {
        TaiKhoan taiKhoan= (TaiKhoan) tblThongTinTaiKhoan.getItems().get(index);
        txtIDTK.setText(""+taiKhoan.getId());
        cboTenNhanVienTK.setValue(taiKhoan.getTenNhanVien());
        txtUserTK.setText(taiKhoan.getUser());
        txtPassTK.setText(taiKhoan.getPass());
        cboQuyenTK.setValue(taiKhoan.getQuyen());
        txtChuThichTK.setText(taiKhoan.getChuthich());
    }

    private void getDaTaLoaiSP(int index){
        LoaiSanPham loaiSanPham= (LoaiSanPham) tblLoaiSP.getItems().get(index);
        txtMaLoaiSPLSP.setText(""+loaiSanPham.getMaLoaiSP());
        txtTenLoaiSPLSP.setText(loaiSanPham.getTenLoaiSP());
    }

    private void getDaTaSanPham(int index) throws SQLException {
        SanPham sanPham= (SanPham) tblSanPhamSP.getItems().get(index);
        txtMaSP.setText(""+sanPham.getMaSanPham());
        txtTenSP.setText(sanPham.getTenSanPham());
        cboLoaiSanPhamSP.setValue(sanPham.getLoaiSanPham());
        cboHangSanXuatSP.setValue(sanPham.getHangSanXuat());
        txtGiaNhapSP.setText(sanPham.getGiaNhap());
        txtGiaBanSP.setText(sanPham.getGiaBan());
        txtTonKhoSP.setText(sanPham.getTonKho());
        txtChuThichSP.setText(sanPham.getChuThich());
        String strMaSP=""+sanPham.getMaSanPham();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select Image from SanPham where MaSanPham='"+strMaSP+"'";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            while(rs.next()) {
                InputStream is=rs.getBinaryStream(1);
                OutputStream os=new FileOutputStream(new File("photo.jpg"));
                byte[] contents=new byte[1024];
                int size=0;
                while ((size=is.read(contents))!=-1){
                    os.write(contents,0,size);
                }
                image=new Image("file:photo.jpg",imgSanPham.getFitWidth(),imgSanPham.getFitHeight(),true,true);
                imgSanPham.setImage(image);
            }
        }
        catch (Exception ex){
            //System.out.println("Kiem Tra Lại Thong Tin"+ex);
            imgSanPham.setImage(imageno);
        }
    }

    // Chức năng tìm kiếm
    private void TimKhachHang() throws SQLException {
        String strTenKH=txtTimTenKH.getText();
        String strLoaiKH;
        int numLoaiKH=2;
        strLoaiKH= getComboxLoaiKhachHangTimKiem();
        if(strLoaiKH.equals("vip")){
            numLoaiKH=1;
        }else if(strLoaiKH.equals("sinh viên")){
            numLoaiKH=3;
        }
        setCellTableKhachHang();
        String sql;
        if(strTenKH.length()==0){
            sql="select * from KhachHang,LoaiKhachHang where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and LoaiKhachHang='"+numLoaiKH+"'";
        }
        else {
            sql ="select * from KhachHang,LoaiKhachHang where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and LoaiKhachHang='"+numLoaiKH+"' and TenKhachHang=N'"+strTenKH+"'";
        }
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            System.out.println(sql);
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listKhachHang = new ArrayList<KhachHang>();
            while(rs.next()) {
                KhachHang dataKhachHang=new KhachHang(rs.getInt(1),
                        rs.getString(2),rs.getDate(3),
                        rs.getString(4),rs.getString(5),
                        rs.getString(6),rs.getString(10),rs.getString(8));
                listKhachHang.add(dataKhachHang);
            }
            tblBangKhachHang.getItems().clear();
            tblBangKhachHang.getItems().addAll(listKhachHang);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }
    private void TimNhanVien(){
        String strMaNV;
        String strTenNV;
        strMaNV=txtTimKiemNhanVien.getText();
        strTenNV=txtTimKiemNhanVien.getText();
        String  sql ="select * from NhanVien,ChucVu where NhanVien.ChucVu=ChucVu.MaChucVu" ;

        if(radTimTheoTen.isSelected()){
            sql="select * from NhanVien,ChucVu where NhanVien.ChucVu=ChucVu.MaChucVu and TenNhanVien=N'"+strTenNV+"'";
        }
        else if(radTimTheoMa.isSelected()){
            sql="select * from NhanVien,ChucVu where NhanVien.ChucVu=ChucVu.MaChucVu and MaNhanVien="+strMaNV;
        }

        setCellTableNhanVien();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listNhanVien = new ArrayList<NhanVien>();
            while(rs.next()) {
                NhanVien dataNhanVien=new NhanVien(rs.getInt(1),
                        rs.getString(2),rs.getDate(3),
                        rs.getString(4),rs.getDate(5),
                        rs.getString(11),rs.getString(7),
                        rs.getString(8),rs.getString(9));
                listNhanVien.add(dataNhanVien);
            }
            tblNhanVien.getItems().clear();
            tblNhanVien.getItems().addAll(listNhanVien);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }
    private void TimSanPham(){ ;
        String strTim,strLoaiSP;
        strTim=txtTimKiemSP.getText();
        strLoaiSP=""+cboTimLoaiSanPhamSP.getValue().toString();
        String  sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1";
        if(strTim.length()==0&&radTimTheoLoaiSP.isSelected()==false)
        {
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1";
        }else if(radTimTheoMaSP.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and MaSanPham="
            +strTim;
        }
        else if(radTimTheoTenSP.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and TenSanPham=N'"
                    +strTim+"'";
        }else if(radTimTheoLoaiSP.isSelected()){
            sql="select * from SanPham,HangSanXuat,LoaiSanPham "
                    +"where SanPham.LoaiSanPham=LoaiSanPham.MaLoaiSanPham and SanPham.HangSanXuat=HangSanXuat.MaHangSanXuat and TrangThai=1 and LoaiSanPham.TenLoaiSanPham=N'"
                    +strLoaiSP+"'";
        }

        setCellTableSanPham();
        try {
            ConnectionClass connectionClass = new ConnectionClass();

            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listSanPham = new ArrayList<SanPham>();
            while(rs.next()) {
                SanPham dataSanPham=new SanPham(rs.getInt(1),
                        rs.getString(2),rs.getString(14),
                        rs.getString(12),rs.getString(5),
                        rs.getString(6),rs.getString(7),
                        rs.getInt(8),rs.getString(10));
                listSanPham.add(dataSanPham);
            }
            tblSanPhamSP.getItems().clear();
            tblSanPhamSP.getItems().addAll(listSanPham);

        }
        catch (Exception ex){

        }
    }

    //Ẩn Sản Phẩm
    private void AnSanPham(int index){
        SanPham sanPham= (SanPham) tblSanPhamHetHang.getItems().get(index);
        String maSP =""+sanPham.getMaSanPham();
        if(ThongBaoDelete("Bạn muốn ẩn sản phẩm: ")==true){
            if(maSP.length()==0){
                ThongBao("Vui lòng chọn sản phẩm: ", "Thông Báo", 2);
            }else {
                try{
                    ConnectionClass connectionClass=new ConnectionClass();
                        String sql="update SanPham set TrangThai=0 where MaSanPham='"+maSP+"'";
                        System.out.println(sql);
                        connectionClass.ExcuteQueryUpdateDB(sql);
                        getTableSanPhamHH();
                }
                catch (Exception e){
                    ThongBao("Vui lòng chọn sản phẩm ", " lỗi", 2);
                }
            }
        }
    }
    private void AnToanBoSanPham(){


        if(ThongBaoDelete("Bạn muốn ẩn sản phẩm: ")==true){

                try{
                    ConnectionClass connectionClass=new ConnectionClass();
                    String sql="update SanPham set TrangThai=0 where TonKho=0";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    getTableSanPhamHH();
                }
                catch (Exception e){
                    ThongBao("Vui lòng chọn sản phẩm ", " lỗi", 2);
                }
        }
    }

    //thông báo
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
    public void initialize() { //khởi tạo
    fileChooser=new FileChooser();
    fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All file","* *"),
            new FileChooser.ExtensionFilter("Images","* png","* jpg","* gif"),
            new FileChooser.ExtensionFilter("Text File","* txt")
    );

    }
    public void tabDoiTacClick(Event event) {
        getTableNPP();
    }

    public void btnThemNPPClick(ActionEvent actionEvent) throws SQLException {
        themNPP();
        getTableNPP();
    }

    public void btnSuaNPPClick(ActionEvent actionEvent) {
        suaThongTinNhaPhanPhoi();

    }

    public void btnResetNPPClick(ActionEvent actionEvent) {
        getTableNPP();
        setMacDinhNPP();
    }

    public void btnXoaNPPClick(ActionEvent actionEvent) {
        XoaThongTinNhaPhanPhoi();
    }

    public void tblNhaPhanPhoiClick(MouseEvent mouseEvent) {
        int index=tblNhaPhanPhoi.getSelectionModel().getSelectedIndex();
        getDaTaNPP(index);
    }

    public void tblBangKhachHangClick(MouseEvent mouseEvent) throws SQLException {
        int index=tblBangKhachHang.getSelectionModel().getSelectedIndex();
        getDaTaKhachHang(index);
    }
    public void btnXoaKHClick(ActionEvent actionEvent) throws SQLException {
        XoaThongTinKhachHang();
    }

    public void btnThemKHClick(ActionEvent actionEvent) throws SQLException {
        themKhachHang();
    }

    public void btnSuaKHClick(ActionEvent actionEvent) throws SQLException {
        suaThongTinKhachHang();
    }

    public void tabKhachHangClick(Event event) throws SQLException {
        getTableKhachHang();
        getComboxLoaiKhachHang();
        getComboxLoaiKhachHangTimKiem();

    }

    public void btnResetKHClick(ActionEvent actionEvent) throws SQLException {
        getTableKhachHang();
        setMacDinhKH();
    }

    public void btnTimKHClick(ActionEvent actionEvent) throws SQLException {
        TimKhachHang();
    }

    public void tabNhanVienClick(Event event) throws SQLException {
        getTableNhanVien();
        getComboxChucVuNhanVien();
        setMacDinhNhanVien();
    }

    public void btnXoaNhanVienClick(ActionEvent actionEvent) throws SQLException {
        XoaThongTinNhanVien();

    }

    public void btnSuaNhanVienClick(ActionEvent actionEvent) throws SQLException {
        suaThongTinNhanVien();
    }

    public void btnThemNhanVienClick(ActionEvent actionEvent) throws SQLException {
        themNhanVien();

    }

    public void btnReSetNhanVienClick(ActionEvent actionEvent) throws SQLException {
        getTableNhanVien();
        setMacDinhNhanVien();
    }

    public void tblNhanVienClick(MouseEvent mouseEvent) throws SQLException {
        int index=tblNhanVien.getSelectionModel().getSelectedIndex();
        getDaTaNhanVien(index);
    }

    public void radTimTheoTenClick(ActionEvent actionEvent) {
        TimNhanVien();
    }

    public void radTimTheoMaClick(ActionEvent actionEvent) {
        TimNhanVien();
    }

    public void btnThemTKClick(ActionEvent actionEvent) throws SQLException {
        ThemTaiKhoan();
    }

    public void btnXoaTkClick(ActionEvent actionEvent) throws SQLException {
        XoaThongTinTaiKhoan();
    }

    public void btnSuaTKClick(ActionEvent actionEvent) throws SQLException {
        suaThongTinTaiKhoan();
    }

    public void btnResetTKClick(ActionEvent actionEvent) {
        setMacDinhTaiKhoan();
        getTableTaiKhoan();
    }

    public void tabTaiKhoanClick(Event event) throws SQLException {
        getTableTaiKhoan();
        getComboxQuyen();
        getComboxTenNhanVien();
    }

    public void tblThongTinTaiKhoanClick(MouseEvent mouseEvent) throws SQLException {
        int index=tblThongTinTaiKhoan.getSelectionModel().getSelectedIndex();
        getDaTaTaiKhoan(index);
    }

    public void btnSuaLSPClick(ActionEvent actionEvent) {
        suaThongTinLoaiSP();
    }

    public void btnReSetLSPClick(ActionEvent actionEvent) {
        setMacDinhLoaiSP();
    }

    public void btnThemLSPClick(ActionEvent actionEvent) throws SQLException {
        themLoaiSP();
    }

    public void btnXoaLSPClick(ActionEvent actionEvent) {
        XoaThongTinLoaiSP();

    }

    public void btnAnTatCaSanPhamHHClick(ActionEvent actionEvent) {
        AnToanBoSanPham();
    }

    public void tabLoaiSanPhamClick(Event event) {
        getTableLoaiSP();
        getTableSanPhamHH();
    }

    public void tblLoaiSPClick(MouseEvent mouseEvent) {
        int index=tblLoaiSP.getSelectionModel().getSelectedIndex();
        getDaTaLoaiSP(index);
    }

    public void btnDoiHinhClick(ActionEvent actionEvent) throws MalformedURLException, FileNotFoundException {
        stage= (Stage) snchorPaneSanPham.getScene().getWindow();
        file=fileChooser.showOpenDialog(stage);
        ConnectionClass connectionClass=new ConnectionClass();
        String strMaSP = "";
        strMaSP=strMaSP+txtMaSP.getText();
        if(strMaSP.length()==0){
            if(file!=null){
                diachianh=file.getAbsolutePath();
                image=new Image(file.getAbsoluteFile().toURL().toString());
                imgSanPham.setImage(image);
                System.out.println(diachianh);
            }else{

                diachianh="NULL";
                System.out.println(diachianh);
                imgSanPham.setImage(imageno);
            }
        }else {
            if(file!=null){
                diachianh=file.getAbsolutePath();
                image=new Image(file.getAbsoluteFile().toURL().toString());
                imgSanPham.setImage(image);
                System.out.println(diachianh);
                try{
                    String sql="update SanPham set Image = (SELECT * from Openrowset(Bulk '"+diachianh+"', Single_Blob) as img) where MaSanPham='"+strMaSP+"'";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    ThongBao("Đã đổi thành công", "Thành Công", 2);
                    setMacDinhSanPham();
                    getTableSanPham();
                }
                catch (Exception e){
                    ThongBao("Vui lòng điền đúng thông tin", " lỗi", 2);
                }
            }else{
                diachianh="NULL";
                System.out.println(diachianh);
            }
        }
    }

    public void tabSanPhamClick(Event event) throws SQLException {
        getTableSanPham();
        setMacDinhSanPham();
        getComboxHangSanXuat();
        getComboxLoaiSanPham();
        getComboxTimTheoLoaiSP();
    }

    public void btnThemSPClick(ActionEvent actionEvent) throws SQLException {
        themSanPham();
    }

    public void btnSuaSPClick(ActionEvent actionEvent) throws SQLException {
        suaThongTinSanPham();
    }

    public void btnResetSPClick(ActionEvent actionEvent) throws SQLException {
        setMacDinhSanPham();
    }

    public void btnXoaSPClick(ActionEvent actionEvent) throws SQLException {
        XoaThongTinSanPham();
    }

    public void radTimSPClick(ActionEvent actionEvent) {
        TimSanPham();
    }

    public void btnXemSPAnClick(ActionEvent actionEvent) {

        Stage stage=new Stage();
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../view/frmSanPhamAn.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
           // stage.setAlwaysOnTop(true);
        }
        catch (Exception e){
            System.out.println(""+e);
            // e.printStackTrace();
        }
    }

    public void tblSanPhamSPClick(MouseEvent mouseEvent) throws SQLException {
        int index=tblSanPhamSP.getSelectionModel().getSelectedIndex();
        getDaTaSanPham(index);
    }

    public void btnXoaHinhClick(ActionEvent actionEvent) {
            diachianh="Null";
            ConnectionClass connectionClass=new ConnectionClass();
            String strMaSP = "";
            strMaSP=strMaSP+txtMaSP.getText();
            if(strMaSP.length()!=0){
                if(ThongBaoDelete("Bạn muốn xóa ảnh này ")==true){
                try{
                    String sql="update SanPham set Image = NULL where MaSanPham='"+strMaSP+"'";
                    System.out.println(sql);
                    connectionClass.ExcuteQueryUpdateDB(sql);
                    ThongBao("Đã xóa thành công", "Thành Công", 2);
                    setMacDinhSanPham();
                    getTableSanPham();
                }
                catch (Exception e){
                    ThongBao("Vui lòng điền đúng thông tin", " lỗi", 2);
                }
            }
        }

    }

    public void cboTimLoaiSanPhamSPClick(ActionEvent actionEvent) {
        TimSanPham();
    }

    public void tblSanPhamHetHangClick(SortEvent<TableView> tableViewSortEvent) {
    }

    public void btnAnSanPhamHH(ActionEvent actionEvent) {
       try{
           int index=tblSanPhamHetHang.getSelectionModel().getSelectedIndex();
           AnSanPham(index);
       }
       catch (Exception e){
           ThongBao("Vui lòng chọn sản phẩm","Thông báo",2);
       }
    }
}
