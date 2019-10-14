package Main.com.QLQA.entity;
import java.sql.*;

public class ConnectionClass {
    private Connection connection;
    public ConnectionClass(String databaseName) {
        // tạo chuỗi kết nối qua SQL
        String connectionString="jdbc:sqlserver://localhost\\QUYSEVER;database="+databaseName+";user=sa;password=Quy0164vn";
        try{  //thử nếu không lỗi
            connection= DriverManager.getConnection(connectionString);  //mở kết nối
            System.out.println("Kết Nối Thành Công");
        }
        catch (Exception ex) //thử bị lỗi
        {
            System.out.println("Lỗi sai jdbc: "+ex+" "+databaseName );  //in lỗi
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
    //Thực thi INSERT, DELETE, UPDATE
    public void ExcuteQueryUpdateDB(String cauTruyVanSQL){

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(cauTruyVanSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
