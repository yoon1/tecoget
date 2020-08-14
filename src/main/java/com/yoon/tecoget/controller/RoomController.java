package com.yoon.tecoget.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class RoomController implements Initializable {
    @FXML private RadioButton buttonRed;
    @FXML private RadioButton buttonBlue;
    @FXML private RadioButton buttonBlack;
    @FXML private RadioButton buttonErase;

    @FXML
    ToggleGroup group1;

    public RoomController() {
    }

    @FXML
    public void exitButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("exit");
        //JavafxApplication.screenController.activate("lobby");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("group");
        group1 = new ToggleGroup();
        buttonRed.setToggleGroup(group1);
        buttonBlue.setToggleGroup(group1);
        buttonBlack.setToggleGroup(group1);
        buttonErase.setToggleGroup(group1);
    }
    @FXML
    public void redButtonActionHandler(ActionEvent actionEvent) { System.out.println("Red"); }

    @FXML
    public void blueButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("Blue");
    }

    @FXML
    public void blackButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("Black");
    }

    @FXML
    public void eraseButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("Erase");
    }


}

