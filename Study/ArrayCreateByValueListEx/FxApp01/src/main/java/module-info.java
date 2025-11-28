module com.example.fxapp01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.fxapp01 to javafx.fxml;
    exports com.example.fxapp01;
}