package Structural_Design_Pattern.Proxy_DesignPattern;

import Structural_Design_Pattern.Proxy_DesignPattern.Proxy_Interface.Image;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************** Static Proxy *******************");

        Image img = ImageFactory.getImage("Static Image.jpeg");
        img.setLocation(new Point2D.Double(5,10));
        System.out.println("Image Location = " + img.getLocation());
        System.out.println("Rendering image now...");
        img.render();
        System.out.println("*************** Static Proxy *******************");




        System.out.println("*************** Dynamic Proxy *******************");
        Image dynamicImg = ImageFactory.getDynamicImage("Dynamic Image.bmp");
        dynamicImg.setLocation(new Point2D.Double(10,20));
        System.out.println("Image Location = " + dynamicImg.getLocation());
        System.out.println("Rendering image now...");
        dynamicImg.render();
        System.out.println("*************** Dynamic Proxy *******************");
    }
}
