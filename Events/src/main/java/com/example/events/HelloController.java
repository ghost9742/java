package com.example.events;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
       if (e.getSource().equals(helloButton)) {
           System.out.println("Hello, " + nameField.getText());
       } else if ( e.getSource().equals(byeButton)){
                System.out.println("Bye, " + nameField.getText());
       }

       Runnable task = new Runnable() {
           @Override
           public void run() {
               Thread.sleep(10000);
           }
       }

       if(ourCheckBox.isSelected()) {
           nameField.clear();
           helloButton.setDisable(true);
           byeButton.setDisable(true);
       }
    }
    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    @FXML
    public void handleChange() {
        System.out.println("Checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}