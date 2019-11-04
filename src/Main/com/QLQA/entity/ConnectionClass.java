package Main.com.QLQA.entity;
import javax.swing.*;
import java.sql.*;

public class ConnectionClass {
    private Connection connection;
    public ConnectionClass() {
        // tạo chuỗi kết nối qua SQL
        String connectionString="jdbc:sqlserver://localhost\\QUYSEVER;database=QuanLySanPham;user=sa;password=Quy0164vn";
        try{  //thử nếu không lỗi
            connection= DriverManager.getConnection(connectionString);  //mở kết nối
            System.out.println("Kết Nối Thành Công");
        }
        catch (Exception ex) //thử bị lỗi
        {
            System.out.println("Lỗi sai jdbc: "+ex );  //in lỗi
        }
    }


    public void CloseConnect(){  //tạo phương thức Đóng kết nối
        try{  //thử nếu không lỗi
            if(connection!=null){   //nếu đang kết nối
                connection.close();  // đóng
            }
        }
        catch (Exception ex){  //nếu lỗi
            //không làm gì cả
        }
    }

    //Thực thi câu lệnh SELECT
    public ResultSet ExcuteQueryGetTable(String sql){
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;
    }
    //Thực thi INSERT UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    //Thực thi  DELETE,
    public void ExcuteQueryDeleteDB(String cauTruyVanSQL,String tenmuonXoa){

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
            ThongBao("Xóa Thành Công Đối Tượng : "+tenmuonXoa, "Thông Báo", 2);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            ThongBao("Bạn không thể xóa đối tượng này với bất kỳ Quyền nào","Cảnh Báo",2);
        }
    }
    public boolean Tim(String sql) throws SQLException {
        Statement stmt =connection.createStatement();
        ResultSet rs= stmt.executeQuery(sql); //chạy câu lệnh và truyền vào sr. nghĩa là nó lấy dữ liệu ra và truyền trở lại sr
        int i=0;
        while (rs.next()){  //trong khi sr.next. có nghĩa là sr có phần tử. nghĩa là đã tìm thấy khóa
            i=i+1;     //thì i cộng 1
        }
        if(i>0){   // nếu i>0

            return true;  //trả về true. ngĩa là đã tìm thấy
        }
        return false;   // ngược lại không tìm thấy
    }
    private void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
}
