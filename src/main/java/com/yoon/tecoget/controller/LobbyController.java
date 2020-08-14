package com.yoon.tecoget.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class LobbyController implements Initializable {

    @FXML
    private Button makeRoomButton;
    @FXML private Button backButton;
    @FXML private ListView waitingRoomList;

    private ObservableList<String> listItem;

    /* *******************
          Room 만들기
    ******************* */
    @FXML
    public void makeRoomButtonActionHandler(ActionEvent actionEvent) throws IOException {
        System.out.println("make Room");
        Stage stage = (Stage)makeRoomButton.getScene().getWindow();
        //JavafxApplication.screenController.popupMakeRoom(stage);
    }

    /* *******************
            Logout
    ******************* */
    @FXML
    public void backButtonActionHandler(ActionEvent actionEvent) {
        System.out.println("back");
        //JavafxApplication.screenController.activate("login");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listItem = FXCollections.observableArrayList();
        getWaitingRoomItems();
    }

    /* *******************
        Room List 받아오기
    ******************* */
    public void getWaitingRoomItems() {
        listItem.add("test1");
        listItem.add("test2");
        listItem.add("test3");
        waitingRoomList.setItems(listItem);
    }

    /* *******************
        User Id 받아오기
    ******************* */
    public void getUserList(int userId) {

    }
}
