package Structural_Design_Pattern.Proxy_DesignPattern.Static_Image_Proxy;

import Structural_Design_Pattern.Proxy_DesignPattern.Proxy_Interface.Image;
import Structural_Design_Pattern.Proxy_DesignPattern.RealObject.BitmapImage;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {

    private BitmapImage img;
    private String filename;
    private Point2D location;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (img != null) img.setLocation(point2D);
        else this.location = point2D;
    }

    @Override
    public Point2D getLocation() {
        if (img != null) return img.getLocation();
        else return this.location;
    }

    @Override
    public void render() {
        if (img == null) {
            img = new BitmapImage(this.filename);
            if (location != null) img.setLocation(location);
        }

        img.render();
    }
}
