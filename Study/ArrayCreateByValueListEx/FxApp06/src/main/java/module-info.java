module com.example.fxapp06 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxapp06 to javafx.fxml;
    exports com.example.fxapp06;
}