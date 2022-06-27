package Creational_Design_Pattern.FactoryMethod.Creator;

import Creational_Design_Pattern.FactoryMethod.Product.JSONMessage;
import Creational_Design_Pattern.FactoryMethod.Product.Message;

public class JSONMessageCreator extends MessageCreator{

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
