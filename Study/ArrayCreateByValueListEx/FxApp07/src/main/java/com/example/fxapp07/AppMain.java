package com.example.fxapp07;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox();                         // HBox 컨테이너 생성
        hbox.setPadding(new Insets(10, 10, 10, 10));    // 안쪽 여백 설정
        hbox.setSpacing(20);                            // 컨트롤 간의 수평 간격 설정

        TextField textField = new TextField();          // TextField 컨트롤 생성
        textField.setPrefWidth(200);                    // TextField 폭 설정

        Button button = new Button();                   // Button 컨트롤 생성
        button.setText("입력");                         // Button 글자 설정

        Button button1 = new Button();                   // Button 컨트롤 생성
        button1.setText("확인");

        ObservableList<Node> list = hbox.getChildren(); // HBox의 ObservableList 얻기
        // 아래 메시지 때문에 'ObservableList -> ObservableList<Node>'으로 수정함.
        // ObservableList is a raw type. References to generic type ObservableList<E> should be parameterized.
        list.add(textField);                            // TextField 컨트롤 배치
        list.add(button);                               // Button 컨트롤 배치
        list.add(button1);                               // Button 컨트롤 배치

        Scene scene = new Scene(hbox);                  // 장면 생성

        primaryStage.setTitle("AppMain");               // 윈도우 창 제목 설정
        primaryStage.setScene(scene);                   // 윈도우 창에 장면 설정
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }


}
