package Structural_Design_Pattern.Proxy_DesignPattern.Proxy_Interface;

import java.awt.geom.Point2D;

public interface Image {
    void setLocation(Point2D point2D);
    Point2D getLocation();
    void render();
}
