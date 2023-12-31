package Structural_Design_Pattern.Proxy_DesignPattern.RealObject;

import Structural_Design_Pattern.Proxy_DesignPattern.Proxy_Interface.Image;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    private String filename;
    private Point2D location;

    public BitmapImage(String filename) {
        // Load file from disc
        // Creation of this object leads to loading of the file from Disk which is a slower operation
        // We don't want to make this object unless absolutely needed
        System.out.println("Loading image from disk: " + filename);
        this.filename = filename;
    }


    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        // Render the image data to the Screen
        System.out.println("Rendering: " + this.filename);
    }
}
