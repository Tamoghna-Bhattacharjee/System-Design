package Creational_Design_Pattern.FactoryMethod.Product;

public class TextMessage extends Message{

    @Override
    public String getContent() {
        return "TEXT BODY";
    }
}
