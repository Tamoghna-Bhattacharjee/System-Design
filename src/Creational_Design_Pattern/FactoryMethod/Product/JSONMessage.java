package Creational_Design_Pattern.FactoryMethod.Product;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "JSON BODY";
    }
}

