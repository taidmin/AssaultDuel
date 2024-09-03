package com.example.assaultduel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.InputStream;

import com.example.assaultduel.bean.LegionPhoto;

import java.util.ArrayList;
import java.util.List;

public class LoadImageUI extends Application {

    private static double WIDTH = 600;
    private static double HEIGHT = 800;
    private static List<LegionPhoto> legionList = new ArrayList<>();//可以用LinkedList
    @Override
    public void start(Stage stage) throws Exception {
        //容器
        Pane pane = new Pane();
        //获取图片字节流
//        InputStream in = getClass().getResourceAsStream("images/bg1.jpg");
        //使用循环
        for(int i = 1;i<2;i++)
        {
            InputStream in = getClass().getResourceAsStream("images/Legion/soldier01attack.gif");
            LegionPhoto legionPhoto = new LegionPhoto(in,50,50,50,50);
            legionList.add(legionPhoto);
        }


//        Image image = new Image(in);
//        //创建一篇对象
//        ImageView imageView = new ImageView(image);
//        imageView.setImage(image);
//        imageView.setX(0);
//        imageView.setY(0);
//        imageView.setPreserveRatio(true);

        for(int i =0;i<legionList.size();i++)
        {
            ImageView imageView = new ImageView(legionList.get(i).getImage());
//        imageView.setImage(image);
            pane.getChildren().add(imageView);
        }

//        //获取子组件的集合，再将图片对象加入集合
//        pane.getChildren().add(imageView);
//        //创建场景Scene
        Scene scene = new Scene(pane,HEIGHT,WIDTH);
//
//        in = getClass().getResourceAsStream("images/icon.png");
//        image = new Image(in);
//        stage.getIcons().add(image);
        stage.setTitle("AssaultDuel");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args)
    {
        launch();
    }
}
