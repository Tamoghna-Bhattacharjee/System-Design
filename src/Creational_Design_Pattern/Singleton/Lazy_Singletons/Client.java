package Creational_Design_Pattern.Singleton.Lazy_Singletons;

public class Client {
    public static void main(String[] args) {
        LazyRegistry registry1 = LazyRegistry.getInstance();
        LazyRegistry registry2 = LazyRegistry.getInstance();
        System.out.println(registry1 == registry2);

        LazyRegistry_IHOI singleton;
        singleton = LazyRegistry_IHOI.getInstance();
        singleton = LazyRegistry_IHOI.getInstance();
        singleton = LazyRegistry_IHOI.getInstance();
    }
}
