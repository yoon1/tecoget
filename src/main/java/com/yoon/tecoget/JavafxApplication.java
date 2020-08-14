package com.yoon.tecoget;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavafxApplication extends Application {
    private ConfigurableApplicationContext ctx;
    private Parent rootNode;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() throws Exception {
        ctx = SpringApplication.run(JavafxApplication.class);
        /*Server Layout Setting*/
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/lobby.fxml"));
        fxmlLoader.setControllerFactory(ctx::getBean);
        rootNode = fxmlLoader.load();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Test"); // 창 타이틀 설정
        stage.setScene(new Scene(rootNode));
        stage.setResizable(false); // 크기 조절 막기
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        ctx.close();
    }
}