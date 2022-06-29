package Creational_Design_Pattern.AbstractFactory.Instances;

import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public class AWSInstance implements Instance {

    public AWSInstance(Capacity capacity) {
        System.out.println("AWSInstance is created");
    }

    @Override
    public void start() {
        System.out.println("AWSInstance is started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attach " + storage + " to AWSInstance");
    }

    @Override
    public void stop() {
        System.out.println("AWSInstance is stopped");
    }
}
