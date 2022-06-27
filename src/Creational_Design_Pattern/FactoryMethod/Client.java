package Creational_Design_Pattern.FactoryMethod;

import Creational_Design_Pattern.FactoryMethod.Creator.JSONMessageCreator;
import Creational_Design_Pattern.FactoryMethod.Creator.MessageCreator;
import Creational_Design_Pattern.FactoryMethod.Creator.TextMessageCreator;
import Creational_Design_Pattern.FactoryMethod.Product.Message;


public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMesage();
        System.out.println(msg.getContent());
    }
}
