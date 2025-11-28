module com.example.fxapp02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxapp02 to javafx.fxml;
    exports com.example.fxapp02;
}