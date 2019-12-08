package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("com/QLQA/view/frmTrangChu.fxml"));
        primaryStage.setTitle("Đăng Nhập");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        //lấy này điền vào main
        //--module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml
    }


    public static void main(String[] args) {
        launch(args);
    }
}
