package com.yoon.tecoget.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;
//import main.Main;

@Controller
public class PopupMakeRoomController {
    @FXML private Button cancleButton;
    @FXML private Button okButton;
    @FXML private TextField txtTitle;
    private Stage stage = null;
    private String reuslt;

    @FXML
    public void cancleButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("cancle");
        stage = (Stage)cancleButton.getScene().getWindow();
        //JavafxApplication.screenController.closePopup(stage);
    }

    @FXML
    public void okButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("ok");
        stage = (Stage)okButton.getScene().getWindow();
        //JavafxApplication.screenController.closePopup(stage);
    }

    public Stage getStage() {
        return stage;
    }

    public String getReuslt() {
        return reuslt;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setReuslt(String reuslt) {
        this.reuslt = reuslt;
    }

    private void closeStage() {
        if ( stage != null) {
            stage.close();
        }
    }


}