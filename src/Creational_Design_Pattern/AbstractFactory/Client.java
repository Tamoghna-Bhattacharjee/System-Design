package Creational_Design_Pattern.AbstractFactory;

import Creational_Design_Pattern.AbstractFactory.Factory.AWSResourceFactory;
import Creational_Design_Pattern.AbstractFactory.Factory.CloudResourceFactory;
import Creational_Design_Pattern.AbstractFactory.Factory.ResourceFactory;
import Creational_Design_Pattern.AbstractFactory.Instances.Instance;
import Creational_Design_Pattern.AbstractFactory.Storage.Storage;

import java.time.Instant;

public class Client {

    private ResourceFactory factory;
    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance getServer(Instance.Capacity capacity, int storageCap) {
        Instance instance = this.factory.createInstance(capacity);
        Storage storage = this.factory.createStorage(storageCap);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        // ***** aws server ****//
        Client aws = new Client(new AWSResourceFactory());
        Instance awsInstance = aws.getServer(Instance.Capacity.small, 20802);
        awsInstance.start();
        awsInstance.stop();

        // *** GCloud Server *** //
        Client gcloud = new Client(new CloudResourceFactory());
        Instance cldInst = gcloud.getServer(Instance.Capacity.large, 50000);
        cldInst.start();
        cldInst.stop();
    }
}
