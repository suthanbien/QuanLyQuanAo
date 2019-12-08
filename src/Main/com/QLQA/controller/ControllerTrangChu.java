package Main.com.QLQA.controller;

import Main.com.QLQA.entity.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ControllerTrangChu {
    public TableView tblBangHoaDon;
    public TableView tblBangChiTietHD;
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
    public Tab tabHoaDon;
    public Button butonTheMKhachHangHD;
    public ComboBox cboMaKhachHangHD;
    public TextField txtMaNhanVienHD;
    public TextField txtSDTKhachHangHD;
    public TextField txtDiaChiKHHD;
    public TextField txtNhanVienHD;
    public DatePicker dateNgayLApHD;
    public Button btnTaoMoiHD;
    public Button btnThemChiTietHD;
    public Button btnXoaChiTietHD;
    public Button btnLuuHD;
    public BorderPane boderPaneHD;
    public TextField txtTongCongHD;
    public ScrollPane scrollPaneHD;
    public TextField txtTenkhachHangHD;
    public TextField txtMaHoaDonHD;
    public TableColumn colMaHoaDonHD;
    public TableColumn colKhachHangHD;
    public TableColumn colNhanVienHD;
    public TableColumn colNgayLapHD;
    public TableColumn colTongTienHD;
    public TableColumn colGhiChuHD;
    public TableColumn colMaCTHD;
    public TableColumn colMaHDCTHD;
    public TableColumn colSoLuongCTHD;
    public TableColumn colSanPhamCTHD;
    public TableColumn colTongTienCTHD;
    public TableColumn colGhiChuCTHD;
    public TextField txtMaHoaDonXHD;
    public TextField txtTongTienXHD;
    public TextArea textGhiChuXHD;
    public Button btnSuaXHD;
    public Button btnReSetXHD;
    public TextField txtTimTheoMaXHD;
    public RadioButton radTimHDTheoMa;
    public ToggleGroup TimHoaDonGroup;
    public RadioButton radTimHDTheoKhachHang;
    public RadioButton radTimHDtheoNhanVien;
    public RadioButton radTimHDTheoNgay;
    public DatePicker dateTimXHD;
    public ComboBox cboNhanVienTimXHD;
    public ComboBox cboKhachHangTimXHD;
    public TextField txtNhanVienXHD;
    public TextField txtKhachHangXHD;
    public TextField txtNgayLapXHD;
    public int quyentc=1;
    public String userDangNhap="admin";
    public String tenUser="";
    public String idUser="";
    public Tab tabDoanhThu;
    public Button btnMoQuyen;
    public Tab tabNhanVien;
    public Tab tabTrangChu;
    public DatePicker TKTuNgay;
    public DatePicker TKDenNgay;
    public Button btnTKTop10;
    public Button btnInBaoCao;

    public CategoryAxis bcSanPham;
    public BarChart bcThongKe;
    public NumberAxis bcSoLuong;
    public TableView tbThongKe;
    public TableColumn colMaSPTK;
    public TableColumn colTenSPTK;
    public TableColumn colSLBanTK;
    public TableColumn colTongTienTK;
    public Button btnResetThongKe;
    ConnectionClass kncsdl=new ConnectionClass();
    ComboBox<String> cboMaMatHangCTHD;
    ComboBox<String> cboTenMHCTHD;
    GridPane gridPane;
    int nRowsCT=0;
    List<TextField> txtSTTList=new ArrayList();
    List<TextField> txtMSMatHangList=new ArrayList();
    List<TextField> txtTenMatHangList=new ArrayList();
    List<TextField> txtSoLuongList=new ArrayList();
    List<TextField> txtDonGiaList=new ArrayList();
    List<TextField> txtTriGiaList=new ArrayList();
    String MSKH_Luu="";
    String MSMH_Luu="";
    String maNhanVienUser="";
    int rowDangChonCTHoaDon=-1;


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
    ArrayList<HoaDon> listHoaDon;
    ArrayList<ChiTietHoaDon> listChiTietHoaDon;
    ArrayList<ThongKe> listThongKe;

    //Tạo list Cho Combobox
    private ObservableList lisLoaiKhachHang;
    private ObservableList listChucVuNhanVien;
    private ObservableList listQuyen;
    private ObservableList listTenNhanVien;
    private ObservableList listTenKhachHang;
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

    private void getTableHoaDon(){
        setCellTableHoaDon();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listHoaDon = new ArrayList<HoaDon>();
            while(rs.next()) {
                HoaDon dataHoaDon=new HoaDon(rs.getInt(1),
                        rs.getString(8), rs.getString(16),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6));
                listHoaDon.add(dataHoaDon);
            }
            tblBangHoaDon.getItems().clear();
            tblBangHoaDon.getItems().addAll(listHoaDon);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin Hóa Đơn"+ex);
        }
    }

    private void getTableChiTietHoaDon(String mahoadon){
        setCellTableChiTietHoaDon();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from ChiTietHoaDon,HoaDon,SanPham "
                    +"where ChiTietHoaDon.MaHoaDon=HoaDon.MaHoaDon and ChiTietHoaDon.MaSanPham=SanPham.MaSanPham "
                    +"and ChiTietHoaDon.MaHoaDon="+mahoadon;
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listChiTietHoaDon = new ArrayList<ChiTietHoaDon>();
            while(rs.next()) {
                ChiTietHoaDon dataChiTietHD=new ChiTietHoaDon(rs.getInt(1),
                        rs.getInt(2),rs.getString(14),
                        rs.getString(4),rs.getString(5),
                        rs.getString(6));
                listChiTietHoaDon.add(dataChiTietHD);
            }
            tblBangChiTietHD.getItems().clear();
            tblBangChiTietHD.getItems().addAll(listChiTietHoaDon);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
    }

    private void getTableSanPhamTK(){
        setCellTableThongKe();
        bcThongKe.getData().clear();
        String strTuNgay="",strDenNgay="";
        strTuNgay=TKTuNgay.getValue().toString();
        strDenNgay=TKDenNgay.getValue().toString();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="SELECT Top (10) SanPham.MaSanPham ,TenSanPham,SUM(SoLuong) as 'TongSoLuong',sum(ChiTietHoaDon.TongTien)as'TongSoTien' " +
                    " FROM ChiTietHoaDon ,SanPham ,HoaDon" +
                    " where  ChiTietHoaDon.MaSanPham=SanPham.MaSanPham and ChiTietHoaDon.MaHoaDon=HoaDon.MaHoaDon  " +
                    " and HoaDon.NgayLapHoaDon >= '"+strTuNgay+"'" +
                    " AND HoaDon.NgayLapHoaDon  <= '"+strDenNgay+"'" +
                    " GROUP BY TenSanPham , SanPham.MaSanPham" +
                    " ORDER BY TongSoLuong DESC";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listThongKe = new ArrayList<ThongKe>();
            while(rs.next()) {
                ThongKe dataThongKe= new ThongKe(rs.getInt(1),
                        rs.getString(2),rs.getInt(3),
                        rs.getInt(4));
                listThongKe.add(dataThongKe);
                XYChart.Series set1=new XYChart.Series<>();
                set1.getData().add(new XYChart.Data(rs.getString(2),rs.getInt(3)));
                bcThongKe.getData().addAll(set1);
            }
            tbThongKe.getItems().clear();
            tbThongKe.getItems().addAll(listThongKe);

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

    private void setCellTableHoaDon(){
        colMaHoaDonHD.setCellValueFactory(new PropertyValueFactory<>("maHoaDon"));
        colKhachHangHD.setCellValueFactory(new PropertyValueFactory<>("tenKhachHang"));
        colNhanVienHD.setCellValueFactory(new PropertyValueFactory<>("tenNhanVien"));
        colNgayLapHD.setCellValueFactory(new PropertyValueFactory<>("ngayLap"));
        colTongTienHD.setCellValueFactory(new PropertyValueFactory<>("tongTien"));
        colGhiChuHD.setCellValueFactory(new PropertyValueFactory<>("ghiChu"));

    }

    private void setCellTableChiTietHoaDon(){
        colMaCTHD.setCellValueFactory(new PropertyValueFactory<>("maCTHD"));
        colMaHDCTHD.setCellValueFactory(new PropertyValueFactory<>("maHoaDon"));
        colSanPhamCTHD.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
        colSoLuongCTHD.setCellValueFactory(new PropertyValueFactory<>("soLuong"));
        colTongTienCTHD.setCellValueFactory(new PropertyValueFactory<>("tongTien"));
        colGhiChuCTHD.setCellValueFactory(new PropertyValueFactory<>("ghiChu"));
    }

    private void setCellTableThongKe(){
        colMaSPTK.setCellValueFactory(new PropertyValueFactory<>("maSanPham"));
        colTenSPTK.setCellValueFactory(new PropertyValueFactory<>("tenSanPham"));
        colSLBanTK.setCellValueFactory(new PropertyValueFactory<>("soLuongBan"));
        colTongTienTK.setCellValueFactory(new PropertyValueFactory<>("tongTien"));

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
        //System.out.println(strLoaiKH);
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

    private void   setMacDinhHoaDon() throws SQLException {
        txtMaHoaDonXHD.setText("");
        txtNhanVienXHD.setText("");
        txtKhachHangXHD.setText("");
        txtNgayLapXHD.setText("");
        txtTongTienXHD.setText("");
        textGhiChuXHD.setText("");
        getTableHoaDon();
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

    private String TruyenTenKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listTenKhachHang = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select TenKhachHang from KhachHang ";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            listTenKhachHang.add(rs.getString(1));
        }
        cboKhachHangTimXHD.setItems(listTenKhachHang);
        //cboNhanVienTimXHD.set;
        return (String) cboKhachHangTimXHD.getValue();
    }

    private String TruyenTenNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        listTenNhanVien = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select TenNhanVien from NhanVien ";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            listTenNhanVien.add(rs.getString(1));
        }
        cboNhanVienTimXHD.setItems(listTenNhanVien);
        return (String) cboNhanVienTimXHD.getValue();
    }

    public void TruyenKhachHang() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        //listHangSanXuat = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select MaKhachHang from KhachHang order by MaKhachHang";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            cboMaKhachHangHD.getItems().add(rs.getString(1));
        }
    }

    public void TruyenMAMH() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        //listHangSanXuat = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select MaSanPham from SanPham  where TrangThai=1";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            cboMaMatHangCTHD.getItems().add(rs.getString(1));
        }
    }

    public void TruyenTenMH() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        //listTenMA = FXCollections.observableArrayList();
        String sqlChucVuNhanVien="select TenSanPham from SanPham  where TrangThai=1";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            cboTenMHCTHD.getItems().add(rs.getString(1));
        }
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

        if(strIDTK.equals("1")){
            ThongBaoDelete("Bạn Không thể sửa tài khoản admin với bất kỳ quyền nào");
        }else
        {
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

    private void suaThongTinHoaDon() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        String strGhiChu = "";
        String strMaHoaDon = "";
        strGhiChu=textGhiChuXHD.getText();
        strMaHoaDon=txtMaHoaDonXHD.getText();

        if(ThongBaoDelete("Bạn muốn sửa hóa đơn: "+strMaHoaDon)==true){
            if(strMaHoaDon.length()==0){
                ThongBao("Vui Lòng Chọn Hóa Đơn", "Lỗi", 2);
            }
            else {
                String sql="update HoaDon set GhiChu=N'"+strGhiChu+"' where MaHoaDon='"+strMaHoaDon+"'";
                System.out.println(sql);
                connectionClass.ExcuteQueryUpdateDB(sql);
                ThongBao("Cập Nhật Thành Công", "Thành Công", 2);
                setMacDinhHoaDon();
                getTableHoaDon();
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

    private void getDaTaHoaDon(int index) throws SQLException {
        HoaDon hoaDon= (HoaDon) tblBangHoaDon.getItems().get(index);
        txtMaHoaDonXHD.setText(""+hoaDon.getMaHoaDon());
        txtNhanVienXHD.setText(hoaDon.getTenNhanVien());
        txtKhachHangXHD.setText(hoaDon.getTenKhachHang());
        txtNgayLapXHD.setText(hoaDon.getNgayLap());
        txtTongTienXHD.setText(hoaDon.getTongTien());
        textGhiChuXHD.setText(hoaDon.getGhiChu());

        getTableChiTietHoaDon(""+hoaDon.getMaHoaDon());

    }

    private void getDaTaThongKe(int index) throws SQLException {
        ThongKe thongKe= (ThongKe) tbThongKe.getItems().get(index);
        bcThongKe.getData().clear();
        String strTuNgay="",strDenNgay="";
        strTuNgay=TKTuNgay.getValue().toString();
        strDenNgay=TKDenNgay.getValue().toString();
        String strMaSP=""+thongKe.getMaSanPham();

        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="SELECT Top (10) SanPham.MaSanPham ,TenSanPham,SUM(SoLuong) as 'TongSoLuong',sum(ChiTietHoaDon.TongTien)as'TongSoTien' " +
                    " FROM ChiTietHoaDon ,SanPham ,HoaDon" +
                    " where  ChiTietHoaDon.MaSanPham=SanPham.MaSanPham and ChiTietHoaDon.MaHoaDon=HoaDon.MaHoaDon  " +
                    " and HoaDon.NgayLapHoaDon >= '"+strTuNgay+"'" +
                    " AND HoaDon.NgayLapHoaDon  <= '"+strDenNgay+"'" +
                    " and ChiTietHoaDon.MaSanPham= '"+strMaSP+"'" +
                    " GROUP BY TenSanPham , SanPham.MaSanPham" +
                    " ORDER BY TongSoLuong DESC";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            while(rs.next()) {
                XYChart.Series set1=new XYChart.Series<>();
                set1.getData().add(new XYChart.Data(rs.getString(2),rs.getInt(3)));
                bcThongKe.getData().addAll(set1);
            }
        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin"+ex);
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
        try {
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
        }catch (Exception ex){

        }
    }

    private void TimHoaDon() throws SQLException {
        String strTimTheoMa,strTimTheoNgay,strTimNhanVien,strTimKhachHang;
        strTimTheoMa=txtTimTheoMaXHD.getText();
        strTimTheoNgay=dateTimXHD.getValue().toString();
        strTimNhanVien= ""+TruyenTenNhanVien();
        strTimKhachHang=""+TruyenTenKhachHang();
        String  sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien";

        if(radTimHDTheoNgay.isSelected())
        {
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien"
                    +" and HoaDon.NgayLapHoaDon='"+strTimTheoNgay+"'";

        }else if(radTimHDtheoNhanVien.isSelected()){
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien"
                    +" and NhanVien.TenNhanVien=N'"+strTimNhanVien+"'";
        }
        else if(radTimHDTheoKhachHang.isSelected()){
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien"
                    +" and KhachHang.TenKhachHang=N'"+strTimKhachHang+"'";
        }else if(radTimHDTheoMa.isSelected()&&strTimTheoMa.length()==0){
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien";
        }else if(radTimHDTheoMa.isSelected()){
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien"
                    +" and HoaDon.MaHoaDon="+strTimTheoMa+"";
        }else {
            sql="select * from HoaDon,KhachHang,NhanVien where HoaDon.MaKhachHang=KhachHang.MaKhachHang and HoaDon.MaNhanVien=NhanVien.MaNhanVien";
        }
        setCellTableHoaDon();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listHoaDon = new ArrayList<HoaDon>();
            while(rs.next()) {
                HoaDon dataHoaDon=new HoaDon(rs.getInt(1),
                        rs.getString(8), rs.getString(16),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6));
                listHoaDon.add(dataHoaDon);
            }
            tblBangHoaDon.getItems().clear();
            tblBangHoaDon.getItems().addAll(listHoaDon);

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

    //Thêm Chi Tiết Hóa Đơn

    public void ThemChiTietHD(){
        TextField txt;
        txt = new TextField();
        txtSTTList.add(txt);
        txt.setPrefWidth(240);
        txt.setId("ST"+nRowsCT);
        txt.setEditable(false);
        txt.setOnMouseClicked(e-> STT_MouseClick(txt.getId()));
        gridPane.add(txt,0, nRowsCT);


        TextField txtMSMH=new TextField();
        txtMSMatHangList.add(txtMSMH);
        txtMSMH.setPrefWidth(240);
        txtMSMH.setId("MS"+nRowsCT);
        txtMSMH.setOnMouseClicked(e-> MSMH_MouseClick(txtMSMH.getId()));
        gridPane.add(txtMSMH, 1, nRowsCT);

        TextField txtTenMH=new TextField();
        txtTenMatHangList.add(txtTenMH);
        txtTenMH.setPrefWidth(240);
        txtTenMH.setId("TEN"+nRowsCT);
        txtTenMH.setOnMouseClicked(e-> TenMH_MouseClick(txtTenMH.getId()));
        gridPane.add(txtTenMH, 2, nRowsCT);



        TextField txtSoLuong = new TextField();
        txtSoLuongList.add(txtSoLuong);
        txtSoLuong.setPrefWidth(240);
        gridPane.add(txtSoLuong, 4, nRowsCT);
        txtSoLuong.setOnKeyReleased(e->TriGia_Change());


        TextField txtDonGia = new TextField();
        txtDonGiaList.add(txtDonGia);
        txtDonGia.setPrefWidth(240);
        txtDonGia.setEditable(false);
        gridPane.add(txtDonGia, 5, nRowsCT);
        txtDonGia.setOnKeyReleased(e->TriGia_Change());


        TextField txtTriGia = new TextField();
        txtTriGiaList.add(txtTriGia);
        txtTriGia.setPrefWidth(240);
        txtTriGia.setAlignment(Pos.CENTER_RIGHT);
        txtTriGia.setEditable(false);
        gridPane.add(txtTriGia, 6, nRowsCT);
        nRowsCT++;
        txtSTTList.get(nRowsCT-1).setText(String.valueOf(nRowsCT));
        scrollPaneHD.setVvalue(1);

        Kiem_Hop_Le();
    }

    //Set top 10 san pham ban chay cho barchar
    public void setTop10TB(){
        bcThongKe.getData().clear();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="SELECT Top (10)TenSanPham, SUM(SoLuong) as 'TongSoLuong',"+
                    "sum(TongTien)as'TongSoTien' FROM ChiTietHoaDon ,SanPham where"+
                    "  ChiTietHoaDon.MaSanPham=SanPham.MaSanPham GROUP BY TenSanPham "+
                    "ORDER BY TongSoLuong DESC";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);

            while(rs.next()) {
                XYChart.Series set1=new XYChart.Series<>();
                set1.getData().add(new XYChart.Data(rs.getString(1),rs.getInt(2)));
                bcThongKe.getData().addAll(set1);
            }


        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin"+ex);
        }
btnInBaoCao.setDisable(true);
    }
    public void setTop10ChonNgay(){
        bcThongKe.getData().clear();
        String strTuNgay="",strDenNgay="";
        strTuNgay=TKTuNgay.getValue().toString();
        strDenNgay=TKDenNgay.getValue().toString();
        try {
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="SELECT Top (10)TenSanPham, SUM(SoLuong) as 'TongSoLuong',sum(ChiTietHoaDon.TongTien)as'TongSoTien' " +
                    " FROM ChiTietHoaDon ,SanPham ,HoaDon" +
                    " where  ChiTietHoaDon.MaSanPham=SanPham.MaSanPham and ChiTietHoaDon.MaHoaDon=HoaDon.MaHoaDon  " +
                    " and HoaDon.NgayLapHoaDon >= '"+strTuNgay+"'" +
                    " AND HoaDon.NgayLapHoaDon  <= '"+strDenNgay+"'" +
                    " GROUP BY TenSanPham " +
                    " ORDER BY TongSoLuong DESC";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);

            while(rs.next()) {
                XYChart.Series set1=new XYChart.Series<>();
                set1.getData().add(new XYChart.Data(rs.getString(1),rs.getInt(2)));
                bcThongKe.getData().addAll(set1);
            }


        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin"+ex);
        }

    }

    // Click

    public void  cboKhacHangClick(){

        try {
            MSKH_Luu=cboMaKhachHangHD.getSelectionModel().getSelectedItem().toString();
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="select * from KhachHang where MaKhachHang="+MSKH_Luu ;
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            while (rs.next()){
                txtTenkhachHangHD.setText(rs.getString("TenKhachHang"));
                txtDiaChiKHHD.setText(rs.getString("DiaChi"));
                txtSDTKhachHangHD.setText(rs.getString("SDT"));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        Kiem_Hop_Le();
    }

    public void  MSMH_MouseClick(String s){
        try{
            String id =  s.substring(2);
            int row = Integer.parseInt(id);
            cboMaMatHangCTHD.setId("cboMH"+id);
            cboMaMatHangCTHD.setOnAction(e->setCboMSMH_Click(cboMaMatHangCTHD.getId()));
            cboMaMatHangCTHD.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldValue, Boolean newValue) {
                    if (newValue.booleanValue()) {
                        focusGainedMa(cboMaMatHangCTHD);
                        // System.out.println(cboMatHang.getId());
                    } else {
                        focusLostMa(cboMaMatHangCTHD);
                       // System.out.println("focusLost");
                    }
                }
            });
            gridPane.add(cboMaMatHangCTHD, 1, row);

        }
        catch (Exception ex){}
        Kiem_Hop_Le();
    }

    public void  STT_MouseClick(String s){
            String id =  s.substring(2);
             rowDangChonCTHoaDon = Integer.parseInt(id);
             btnXoaChiTietHD.setDisable(false);
    }

    public void XoaChiTietHoaDon(){
        System.out.println(rowDangChonCTHoaDon);
        txtSoLuongList.get(rowDangChonCTHoaDon).setText("0");
        gridPane.getChildren().remove(txtSTTList.get(rowDangChonCTHoaDon));
        gridPane.getChildren().remove(txtMSMatHangList.get(rowDangChonCTHoaDon));
        gridPane.getChildren().remove(txtTenMatHangList.get(rowDangChonCTHoaDon));
        gridPane.getChildren().remove(txtSoLuongList.get(rowDangChonCTHoaDon));
        gridPane.getChildren().remove(txtDonGiaList.get(rowDangChonCTHoaDon));
        gridPane.getChildren().remove(txtTriGiaList.get(rowDangChonCTHoaDon));
        btnXoaChiTietHD.setDisable(true);

        Kiem_Hop_Le();
    }

    public void  TenMH_MouseClick(String s){
        try{
            String id =  s.substring(3);
            int row = Integer.parseInt(id);
            cboTenMHCTHD.setId("cboTen"+id);
            cboTenMHCTHD.setOnAction(e->setCboTenMH_Click(cboTenMHCTHD.getId()));
            cboTenMHCTHD.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldValue, Boolean newValue) {
                    if (newValue.booleanValue()) {
                         focusGainedTen(cboTenMHCTHD);
                        // System.out.println(cboMatHang.getId());
                    } else {
                         focusLostTen(cboTenMHCTHD);
                       // System.out.println("focusLost");
                    }
                }
            });
            gridPane.add(cboTenMHCTHD, 2, row);

        }
        catch (Exception ex){
        }
        Kiem_Hop_Le();
    }

    public void  setCboMSMH_Click(String s){
        try {
            String id =  s.substring(5);
            int row = Integer.parseInt(id);
            //System.out.println(row);
            MSMH_Luu=cboMaMatHangCTHD.getSelectionModel().getSelectedItem().toString();
            ResultSet rs = kncsdl.Tim_MSSanPham(MSMH_Luu);

            while (rs.next()){
                txtMSMatHangList.get(row).setText(rs.getString(1));
                txtTenMatHangList.get(row).setText(rs.getString(2));
                txtDonGiaList.get(row).setText(rs.getString(6));
            }
            if(txtSoLuongList.get(row).getText().length()!=0){
                TriGia_Change();
            }
        }
        catch (Exception e) {

        }
        Kiem_Hop_Le();
    }

    public void  setCboTenMH_Click(String s){
        try {
            String id =  s.substring(6);
            int row = Integer.parseInt(id);
            MSMH_Luu=cboTenMHCTHD.getSelectionModel().getSelectedItem().toString();
            ResultSet rs = kncsdl.Tim_TenSanPham(MSMH_Luu);

            while (rs.next()){
                txtMSMatHangList.get(row).setText(rs.getString(1));
                txtTenMatHangList.get(row).setText(rs.getString(2));
                txtDonGiaList.get(row).setText(rs.getString(6));
            }
            if(txtSoLuongList.get(row).getText().length()!=0){
                TriGia_Change();
            }
        }
        catch (Exception e) {

        }
        Kiem_Hop_Le();
    }

    public void TriGia_Change(){
        float TongTriGia=0;
        for(int i=0; i<nRowsCT; i++) {
            float SoLuong = MyLib.getFloat(txtSoLuongList.get(i).getText());
            float DonGia = MyLib.getFloat(txtDonGiaList.get(i).getText());
            float TriGia = SoLuong * DonGia;
            txtTriGiaList.get(i).setText(String.format("%,12.0f", TriGia));
            TongTriGia += TriGia;
        }
        txtTongCongHD.setText(String.format("%,12.0f", TongTriGia));
        Kiem_Hop_Le();

    }

    public void focusLostMa(ComboBox cbo){
        gridPane.getChildren().remove(cbo);
        Kiem_Hop_Le();
    }

    public void focusGainedMa(ComboBox cbo){

        Kiem_Hop_Le();
    }

    public void focusLostTen(ComboBox cbo){
        gridPane.getChildren().remove(cbo);
        Kiem_Hop_Le();
    }

    public void focusGainedTen(ComboBox cbo){

        Kiem_Hop_Le();
    }


    public void  Kiem_Hop_Le(){
        boolean HopLe = SHD_HopLe_LucThem() && MSKH_HopLe() && nRowsCT>0 && MSMH_HopLe()
                && SL_HopLe()&&SLTrongKhoHopLe();
        //  System.out.println("Kiem tra hop le: "+HopLe);
        btnLuuHD.setDisable(!HopLe);
    }

    public boolean SL_HopLe(){
        boolean HopLe=true;
        for(int i=0;i<nRowsCT; i++) {
            HopLe &= MyLib.isInt(txtSoLuongList.get(i).getText());
        }
        return HopLe;
    }

    public boolean SLTrongKhoHopLe(){
        boolean HopLe=true;
        String maSanPham;
        int soluongMua;
        int soLuongCon = 0;
        for(int i=0;i<nRowsCT; i++) {
            maSanPham=txtMSMatHangList.get(i).getText();
            soluongMua=Integer.parseInt(txtSoLuongList.get(i).getText());
            try {
                ConnectionClass connectionClass = new ConnectionClass();
                String sql="select TonKho From SanPham where MaSanPham="+maSanPham;
                ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
                while(rs.next()) {
                    soLuongCon=rs.getInt(1);
                }
            }
            catch (Exception ex){}
            if (soLuongCon>=soluongMua){
                return HopLe;
            }else {
                return false;
            }
        }
        return HopLe;
    }

    public boolean MSKH_HopLe(){
        // System.out.println("Khach Hang HopLe "+! MSKH_Luu.equals(""));
        return ! MSKH_Luu.equals("");
    }

    public boolean  MSMH_HopLe(){
        boolean HopLe = true;
        List<String> MSMHList = new ArrayList<>();
        for(int i=0; i<nRowsCT; i++) {
            String MSMH = txtMSMatHangList.get(i).getText();
            HopLe &= ! MSMH.equals("");
            HopLe &= ! MyLib.isInList(MSMH, MSMHList);
            MSMHList.add(MSMH);
        }
        // System.out.println("Hang Hoa HopLe "+HopLe);
        return HopLe;
    }

    public void  Luu_ToanBo(){
        if(ThongBaoDelete("Bạn muốn lưu hóa đơn ")==true){
        try
        {

            kncsdl.Them_HoaDon(cboMaKhachHangHD.getValue().toString(),txtMaNhanVienHD.getText(),dateNgayLApHD.getValue().toString(),
                    Float.parseFloat(txtTongCongHD.getText().replace(".","")));
           // System.out.println("n cout"+nRowsCT);
            for(int i=0; i<nRowsCT; i++) {
                //System.out.println(txtMSMatHangList.get(i).getId());
                //System.out.println(txtTriGiaList.get(i).getText());
                kncsdl.Them_ChiTietHoaDon(txtMaHoaDonHD.getText(),txtMSMatHangList.get(i).getText(),
                        Float.parseFloat(txtSoLuongList.get(i).getText()),
                        Float.parseFloat(txtTriGiaList.get(i).getText().replace(".","")));
            }
            TruTrongKho();
            btnLuuHD.setDisable(true);
            btnTaoMoiHD.setDisable(false);
            btnThemChiTietHD.setDisable(true);
        } catch (Exception e)
        {
            System.out.println(e.getMessage()+ ". Cần chuyển sang Region Settings là Việt Nam");
        }
        }
    }

    public void TruTrongKho(){

        String maSanPham;
        int soluongMua;
        int soLuongCon = 0;
        int conlaisaukhimua = 0;
        for(int i=0;i<nRowsCT; i++) {
            maSanPham=txtMSMatHangList.get(i).getText();
            soluongMua=Integer.parseInt(txtSoLuongList.get(i).getText());
            try {
                ConnectionClass connectionClass = new ConnectionClass();
                String sql="select TonKho From SanPham where MaSanPham="+maSanPham;
                ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
                while(rs.next()) {
                    soLuongCon=rs.getInt(1);
                }
                conlaisaukhimua=soLuongCon-soluongMua;
                System.out.println(conlaisaukhimua);
                String sqlXoaNPP="update SanPham set TonKho= "+conlaisaukhimua+" where MaSanPham ='"+maSanPham+"'";
                connectionClass.ExcuteQueryUpdateDB(sqlXoaNPP);
            }
            catch (Exception ex){}

        }

    }

    public boolean  SHD_HopLe_LucThem(){
        String SHD= txtMaHoaDonHD.getText();
        try {
            ResultSet rs = kncsdl.Tim_SoHoaDon(SHD);
            //System.out.println(rs);
            boolean HopLe  =!SHD.equals("");;
            while (rs.next()){
                HopLe = false;
            }
            // System.out.println("So hoa don hop le "+HopLe);
            return HopLe;
        } catch (Exception e)
        {
            System.out.println("loi SHD_HopLe_LucThem "+e);
            return false;
        }
    }

    public void TaoMoi(){
        if(nRowsCT>0) {
            gridPane.getChildren().clear();
            txtSTTList.clear();
            txtMSMatHangList.clear();
            txtTenMatHangList.clear();
            txtSoLuongList.clear();
            txtDonGiaList.clear();
            txtTriGiaList.clear();
            nRowsCT=0;
            try {
                int SoHoaDon = 0;
                ConnectionClass connectionClass = new ConnectionClass();
                String sql="SELECT MAX(MaHoaDon) FROM HoaDon";
                ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
                listKhachHang = new ArrayList<KhachHang>();
                while(rs.next()) {
                    SoHoaDon=rs.getInt(1);
                }
                SoHoaDon+=1;
                txtMaHoaDonHD.setText(""+SoHoaDon);

            }
            catch (Exception ex){
                System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
            }
            btnTaoMoiHD.setDisable(true);
            btnThemChiTietHD.setDisable(false);
            TriGia_Change(); // Lệnh mới thêm (30/09/2017)
        }

    }

    public void  KiemTraNhanVien() throws SQLException {
        ConnectionClass connectionClass=new ConnectionClass();
        //listTenMA = FXCollections.observableArrayList();
        System.out.println("user là: "+userDangNhap);
        String sqlChucVuNhanVien="select* from NhanVien, Users where Users.MaNhanVien=NhanVien.MaNhanVien and  Users.TenDangNhap='"+userDangNhap+"'";
        ResultSet rs= connectionClass.ExcuteQueryGetTable(sqlChucVuNhanVien);
        // System.out.println(rs.next());
        while (rs.next()){
            tenUser=rs.getString("TenNhanVien");
            idUser=rs.getString("MaNhanVien");
        }
        System.out.println("ten Nhan Vien: "+ tenUser);
        System.out.println("ma Nhan Vien: "+idUser);
        System.out.println("Quyen La "+ quyentc);
        txtMaNhanVienHD.setText(idUser);
        txtNhanVienHD.setText(tenUser);
        if(quyentc==1){
            tabHoaDon.setDisable(false);
            tabSanPham.setDisable(false);
            tabKhachHang.setDisable(false);
            tabNhanVien.setDisable(false);
            tabDoiTac.setDisable(false);
            tabDoanhThu.setDisable(false);
            btnMoQuyen.setVisible(false);
            tabTrangChu.setDisable(true);
        }else if(quyentc==2){
            tabHoaDon.setDisable(false);
            tabSanPham.setDisable(false);
            tabKhachHang.setDisable(false);
            tabNhanVien.setDisable(false);
            tabDoiTac.setDisable(false);
            tabDoanhThu.setDisable(false);
            btnMoQuyen.setVisible(false);
            tabTrangChu.setDisable(true);
            tabTaiKhoan.setDisable(true);

        }
        else if(quyentc==3){
            tabHoaDon.setDisable(false);
            tabSanPham.setDisable(false);
            tabKhachHang.setDisable(false);
            tabDoiTac.setDisable(false);
            btnMoQuyen.setVisible(false);
            tabTrangChu.setDisable(true);
            tabTaiKhoan.setDisable(true);
        }
        else if(quyentc==4){
            tabNhanVien.setDisable(false);
            tabTaiKhoan.setDisable(true);
            btnThemNhanVien.setVisible(false);
            btnXoaNhanVien.setVisible(false);
            btnSuaNhanVien.setVisible(false);
            btnReSetNhanVien.setVisible(false);
        }
        else if(quyentc==5){
            tabSanPham.setDisable(false);
            tabKhachHang.setDisable(false);
            btnThemSP.setVisible(false);
            btnSuaSP.setVisible(false);
            btnXoaSP.setVisible(false);
            btnResetSP.setVisible(false);
            btnDoiHinh.setVisible(false);
            btnXoaHinh.setVisible(false);
            btnXemSPAn.setVisible(false);

            btnAnTatCaSanPhamHH.setVisible(false);
            btnAnSanPhamHH.setVisible(false);
            btnReSetLSP.setVisible(false);
            btnXoaLSP.setVisible(false);
            btnSuaLSP.setVisible(false);
            btnThemLSP.setVisible(false);

            ptnThemKH.setVisible(false);
            btnXoaKH.setVisible(false);
            btnSuaKH.setVisible(false);
            btnResetKH.setVisible(false);

        }
        else if(quyentc==7){
            tabHoaDon.setDisable(false);
            tabSanPham.setDisable(false);
            tabKhachHang.setDisable(false);
            tabNhanVien.setDisable(false);
            tabDoiTac.setDisable(false);
            tabDoanhThu.setDisable(false);
            btnMoQuyen.setVisible(false);
            tabTrangChu.setDisable(true);
            tabTaiKhoan.setDisable(true);
        }
    }


    @FXML
    public void initialize() throws SQLException { //khởi tạo
    fileChooser=new FileChooser();
    fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All file","* *"),
            new FileChooser.ExtensionFilter("Images","* png","* jpg","* gif"),
            new FileChooser.ExtensionFilter("Text File","* txt"));
            gridPane =new GridPane();
            scrollPaneHD.setContent(gridPane);
            scrollPaneHD.setVvalue(1);
        cboMaKhachHangHD.setValue("32");
        cboMaMatHangCTHD=new ComboBox<>();
        cboMaMatHangCTHD.setMinWidth(240);
        cboTenMHCTHD=new ComboBox<>();
        cboTenMHCTHD.setMinWidth(240);
        dateNgayLApHD.setValue(LocalDate.now());
        TKTuNgay.setValue(LocalDate.now());
        TKDenNgay.setValue(LocalDate.now());
        cboKhacHangClick();
        TruyenKhachHang();
        TruyenMAMH();
        TruyenTenMH();
        btnTaoMoiHD.setDisable(true);
        btnLuuHD.setDisable(true);
        btnXoaChiTietHD.setDisable(true);


        try {
            int SoHoaDon = 0;
            ConnectionClass connectionClass = new ConnectionClass();
            String sql="SELECT MAX(MaHoaDon) FROM HoaDon";
            ResultSet rs= connectionClass.ExcuteQueryGetTable(sql);
            listKhachHang = new ArrayList<KhachHang>();
            while(rs.next()) {
                SoHoaDon=rs.getInt(1);
            }
            SoHoaDon+=1;
            txtMaHoaDonHD.setText(""+SoHoaDon);

        }
        catch (Exception ex){
            System.out.println("Kiem Tra Lại Thong Tin khách hàng"+ex);
        }
        tabHoaDon.setDisable(true);
        tabSanPham.setDisable(true);
        tabKhachHang.setDisable(true);
        tabNhanVien.setDisable(true);
        tabDoiTac.setDisable(true);
        tabDoanhThu.setDisable(true);
        setTop10TB();

    }
    public void tabDoiTacClick(Event event) throws SQLException {
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

    public void tabHoaDonClick(Event event) throws SQLException {

    }

    public void btnTaoMoiHDClick(ActionEvent actionEvent) {
        TaoMoi();
    }

    public void btnThemChiTietHDClick(ActionEvent actionEvent) {
        ThemChiTietHD();
    }

    public void btnXoaChiTietHDClick(ActionEvent actionEvent) {
        XoaChiTietHoaDon();
        TriGia_Change();
    }

    public void btnLuuHDClick(ActionEvent actionEvent) {
        Luu_ToanBo();
    }

    public void cboMaKhachHangHDClick(ActionEvent actionEvent) {
        cboKhacHangClick();
    }

    public void tblBangHoaDonClick(MouseEvent mouseEvent) throws SQLException {
        int index=tblBangHoaDon.getSelectionModel().getSelectedIndex();
        getDaTaHoaDon(index);

    }

    public void btnSuaXHDClick(ActionEvent actionEvent) throws SQLException {
        suaThongTinHoaDon();
    }

    public void btnReSetXHDClick(ActionEvent actionEvent) throws SQLException {
        setMacDinhHoaDon();
    }

    public void TimHoaDonClick(ActionEvent actionEvent) throws SQLException {
        TimHoaDon();
    }

    public void tabXemHoaDonClick(Event event) throws SQLException {
        getTableHoaDon();
        TruyenTenNhanVien();
        TruyenTenKhachHang();
        dateTimXHD.setValue(LocalDate.now());
    }

    public void butonTheMKhachHangHDClick(ActionEvent actionEvent) {

        Stage stage=new Stage();
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../view/frmThemKhachHang.fxml"));
            Scene scene=new Scene(root);
            stage.setScene(scene);
            stage.show();
            // stage.setAlwaysOnTop(true);
        }
        catch (Exception e){
            System.out.println(""+e);

        }
    }

    public void tabDoanhThuClick(Event event) {
        setTop10TB();
    }

    public void btnMoQuyenClick(ActionEvent actionEvent) throws SQLException {
        KiemTraNhanVien();
    }

    public void btnTKTop10Click(ActionEvent actionEvent) {
        setTop10ChonNgay();
        btnInBaoCao.setDisable(false);
    }

    public void btnInClick(ActionEvent actionEvent) {
    }


    public void tbThongKeClick(MouseEvent tableViewSortEvent) throws SQLException {
        int index=tbThongKe.getSelectionModel().getSelectedIndex();
        getDaTaThongKe(index);
    }


    public void btnResetThongKeClick(ActionEvent actionEvent) {
        setTop10TB();
        tbThongKe.getItems().clear();
        btnInBaoCao.setDisable(true);
    }

    public void btnChonNgayClick(ActionEvent actionEvent) {
        getTableSanPhamTK();
        btnInBaoCao.setDisable(false);
    }
}
