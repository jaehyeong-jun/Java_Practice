module com.example.fxapp03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxapp03 to javafx.fxml;
    exports com.example.fxapp03;
}