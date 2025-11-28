module com.example.fxapp08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxapp08 to javafx.fxml;
    exports com.example.fxapp08;
}