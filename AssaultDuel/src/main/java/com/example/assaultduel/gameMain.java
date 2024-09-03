package com.example.assaultduel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;


import java.util.Scanner;

public class gameMain extends Application {
    private Pane gamePame;
    private static double WIDTH = 676.0;
    private static double HEIGHT = 407.5;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(gameMain.class.getResource("loginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), WIDTH, HEIGHT);


//获得图片文件

        InputStream in = getClass().getResourceAsStream("images/icon.png");
        Image image = new Image(in);
        stage.getIcons().add(image);
        stage.setTitle("login...");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args)
    {
        launch();
    }

}