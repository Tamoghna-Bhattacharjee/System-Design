package Creational_Design_Pattern.FactoryMethod.Creator;

import Creational_Design_Pattern.FactoryMethod.Product.Message;
import Creational_Design_Pattern.FactoryMethod.Product.TextMessage;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
