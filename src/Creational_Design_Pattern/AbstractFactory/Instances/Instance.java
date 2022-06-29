package Creational_Design_Pattern.AbstractFactory.Instances;

import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public interface Instance {
    enum Capacity {micro, small, large}
    void start();
    void attachStorage(Storage storage);
    void stop();
}
