module com.example.fxbox03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxbox03 to javafx.fxml;
    exports com.example.fxbox03;
}