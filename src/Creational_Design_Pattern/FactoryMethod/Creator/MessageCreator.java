package Creational_Design_Pattern.FactoryMethod.Creator;

import Creational_Design_Pattern.FactoryMethod.Product.Message;

public abstract class MessageCreator {

    public abstract Message createMessage();

    public Message getMesage() {
        Message msg = createMessage();
        msg.addHeader();
        msg.encrypt();
        return msg;
    }
}
