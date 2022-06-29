package Creational_Design_Pattern.AbstractFactory.Factory;

import Creational_Design_Pattern.AbstractFactory.Instances.GCloudInstance;
import Creational_Design_Pattern.AbstractFactory.Instances.Instance;
import Creational_Design_Pattern.AbstractFactory.Storage.GCloudStorage;
import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public class CloudResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GCloudInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new GCloudStorage(capacity);
    }
}
