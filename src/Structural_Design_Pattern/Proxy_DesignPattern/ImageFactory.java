package Structural_Design_Pattern.Proxy_DesignPattern;

import Structural_Design_Pattern.Proxy_DesignPattern.Dynamic_Image_Proxy.ImageInvocationHandler;
import Structural_Design_Pattern.Proxy_DesignPattern.Static_Image_Proxy.ImageProxy;
import Structural_Design_Pattern.Proxy_DesignPattern.Proxy_Interface.Image;

import java.lang.reflect.Proxy;

public class ImageFactory {
    public static Image getImage(String filename) {
        return new ImageProxy(filename);
    }

    public static Image getDynamicImage(String filename) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(),
                new Class[]{Image.class},
                new ImageInvocationHandler(filename));

    }
}
