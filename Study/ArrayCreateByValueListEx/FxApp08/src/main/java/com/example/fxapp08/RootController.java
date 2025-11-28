package com.example.fxapp08;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML private Button btn1;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("버튼이 눌러졌습니다.");
                handleAction(event);
            }
        });
    }

    public void handleAction(ActionEvent event){
        System.out.println("버튼1 클릭!!!");
    }
}
