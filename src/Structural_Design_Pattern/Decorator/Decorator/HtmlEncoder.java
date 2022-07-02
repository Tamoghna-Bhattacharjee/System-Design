package Structural_Design_Pattern.Decorator.Decorator;

import Structural_Design_Pattern.Decorator.Component.Message;

public class HtmlEncoder implements Message {

    private Message msg;

    public HtmlEncoder(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "HTML Encoded msg: " + msg.getContent();
    }
}
