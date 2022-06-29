package Creational_Design_Pattern.AbstractFactory.Instances;

import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public class GCloudInstance implements Instance{

    public GCloudInstance(Capacity capacity) {
        System.out.println("GCloudInstance is created");
    }

    @Override
    public void start() {
        System.out.println("GCloudInstance is started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attach " + storage + " to GCloudInstance");
    }

    @Override
    public void stop() {
        System.out.println("GCloudInstance is stopped");
    }
}
