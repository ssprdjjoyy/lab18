package com.example.lab18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private Button Button1;

    @FXML
    private TextField TextField1;

    @FXML
    private TextArea TextArea1;

    @FXML
    public void ClickButton (ActionEvent e){
        String message = TextField1.getText();
        TextArea1.appendText("Your message: " + message + "\n");
        TextField1.setText("");
        TextField1.requestFocus();
    }
}