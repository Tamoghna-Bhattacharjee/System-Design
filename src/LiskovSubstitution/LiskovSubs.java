package LiskovSubstitution;

import java.awt.*;

public class LiskovSubs {
    public static void main(String[] args) {
        Reactangle rect = new Reactangle(5,6);
        Square sq = new Square(5);
        System.out.println(validate(rect));
    }

    static boolean validate(Reactangle rect) {
        return rect.w == 5 && rect.h == 6;
    }
}

interface Shape {
    public int calArea();
}

class Reactangle implements Shape {
    public int w, h;

    public Reactangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int calArea() {
        return w*h;
    }
}

class Square implements Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calArea() {
        return side*side;
    }
}
