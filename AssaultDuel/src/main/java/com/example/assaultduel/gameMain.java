package com.example.assaultduel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;


import java.util.Scanner;

public class gameMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //这里显示登录界面，可以注册，用数据库存储用户名，密码，得分等信息
        FXMLLoader fxmlLoader = new FXMLLoader(gameMain.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 520, 440);
        InputStream in = this.getClass().getResourceAsStream("images/icon.png");
        Image image = new Image(in);
        stage.getIcons().add(image);
        in = this.getClass().getResourceAsStream("images/bg1.jpg");
        image = new Image(in);
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(100);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        //登录成功则打开大厅界面，关闭登录界面
        //用循环等方法来打开各种界面，从大厅，单机，联机游戏等界面切换
    }


}