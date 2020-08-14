package com.yoon.tecoget.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Controller;
//import main.Main;

@Controller
public class LoginController {
    public LoginController() {
    }

    /* *******************
            Login
    ******************* */
    @FXML
    public void loginButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("login");
 //       Main.screenController.activate("lobby");
    }

    /* *******************
           Game 종료
    ******************* */
    @FXML
    public void exitButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("exit");
//((Node)(actionEvent.getSource())).getScene().getWindow().hide();
    }
}