package Structural_Design_Pattern.Decorator.Decorator;

import Structural_Design_Pattern.Decorator.Component.Message;

public class SSHEncoder implements Message {

    private Message msg;

    public SSHEncoder(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return "SSH Encoded message: " + this.msg.getContent();
    }
}
