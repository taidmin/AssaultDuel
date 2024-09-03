package com.example.assaultduel.controller;

import com.example.assaultduel.gameMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class loginPageController {
    private static double WIDTH = 676.0;
    private static double HEIGHT = 407.5;

    @FXML
    private TextField txtAccont;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private Button btnGoRegister;
    @FXML
    private Button btnLogin;


    @FXML
    public void register(ActionEvent event) {
        try {
           Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("registerPage.fxml"));
            fxmlLoader.load();//报错
            Scene scene = new Scene(fxmlLoader.getRoot(), WIDTH, HEIGHT);

            stage.setTitle("login...");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("加载资源时出现错误：" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("发生未知错误：" + e.getMessage());
        }
    }
}




