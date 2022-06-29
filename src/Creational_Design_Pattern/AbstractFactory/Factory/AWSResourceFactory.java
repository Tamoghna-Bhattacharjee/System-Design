package Creational_Design_Pattern.AbstractFactory.Factory;

import Creational_Design_Pattern.AbstractFactory.Instances.AWSInstance;
import Creational_Design_Pattern.AbstractFactory.Instances.Instance;
import Creational_Design_Pattern.AbstractFactory.Storage.AWSStorage;
import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public class AWSResourceFactory implements ResourceFactory{
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new AWSInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacity) {
        return new AWSStorage(capacity);
    }
}
