module com.example.fxplusapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxplusapp to javafx.fxml;
    exports com.example.fxplusapp;
}