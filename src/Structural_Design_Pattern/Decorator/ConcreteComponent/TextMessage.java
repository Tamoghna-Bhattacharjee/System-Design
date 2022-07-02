package Structural_Design_Pattern.Decorator.ConcreteComponent;

import Structural_Design_Pattern.Decorator.Component.Message;

public class TextMessage implements Message {

    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return this.msg;
    }
}
