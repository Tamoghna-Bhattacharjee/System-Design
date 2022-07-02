package Structural_Design_Pattern.Decorator;

import Structural_Design_Pattern.Decorator.Component.Message;
import Structural_Design_Pattern.Decorator.ConcreteComponent.TextMessage;
import Structural_Design_Pattern.Decorator.Decorator.HtmlEncoder;
import Structural_Design_Pattern.Decorator.Decorator.SSHEncoder;

import java.security.MessageDigest;

public class Client {
    public static void main(String[] args) {
        Message msg = new TextMessage("May the <force> be with you");
        System.out.println(msg.getContent());
        
        // normal decoration
        Message htmlDecorator = new HtmlEncoder(msg);
        System.out.println(htmlDecorator.getContent());

        Message sshDecorator = new SSHEncoder(msg);
        System.out.println(sshDecorator.getContent());

        // recursive decoration
        sshDecorator = new SSHEncoder(htmlDecorator);
        System.out.println(sshDecorator.getContent());
    }
}
