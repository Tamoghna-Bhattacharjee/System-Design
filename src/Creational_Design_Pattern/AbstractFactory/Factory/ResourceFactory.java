package Creational_Design_Pattern.AbstractFactory.Factory;

import Creational_Design_Pattern.AbstractFactory.Instances.Instance;
import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacity);
}
