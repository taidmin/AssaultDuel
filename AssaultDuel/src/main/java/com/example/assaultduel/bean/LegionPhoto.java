package com.example.assaultduel.bean;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.InputStream;

public class LegionPhoto {
    private Image image;
    private ImageView imageView;
    private double x;
    private double y;
    private double width;
    private double height;
    public LegionPhoto()
    {

    }

    public Image getImage() {
        return image;
    }

    public LegionPhoto(InputStream imagePath, double x, double y, double width, double height)
    {
        //初始化...
        this.image = new Image(imagePath);
        this.imageView = new ImageView(image);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
