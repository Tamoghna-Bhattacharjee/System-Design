package Creational_Design_Pattern.AbstractFactory.Storage;

public class GCloudStorage implements Storage{
    public GCloudStorage(int capacity) {
        System.out.println("Allocated " + capacity + " Mib on GCloudStorage");
    }

    @Override
    public String getId() {
        return "GCloudStorage23";
    }

    @Override
    public String toString() {
        return "GCloudStorage class";
    }
}
