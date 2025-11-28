module com.example.fxapp07 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxapp07 to javafx.fxml;
    exports com.example.fxapp07;
}