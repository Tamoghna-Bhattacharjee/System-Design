package Creational_Design_Pattern.AbstractFactory.Storage;

public class AWSStorage implements Storage{

    public AWSStorage(int capacity) {
        System.out.println("Allocated " + capacity + " Mib on AWSStorage");
    }

    @Override
    public String getId() {
        return "AWSStorage23";
    }

    @Override
    public String toString() {
        return "AWSStorage class";
    }
}
