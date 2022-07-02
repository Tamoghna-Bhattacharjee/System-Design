package Creational_Design_Pattern.Singleton.Lazy_Singletons;

public class LazyRegistry_IHOI {
    // Lazy initialization holder idiom
    // This is another method to apply lazy singleton

    private LazyRegistry_IHOI() {
        System.out.println("LazyRegistry holder idiom is called");
    }

    private static class RegistryHolder {
        static LazyRegistry_IHOI INSTANCE = new LazyRegistry_IHOI();
        static {
            System.out.println("Registry holder");
        }
    }

    public static LazyRegistry_IHOI getInstance() {
        return RegistryHolder.INSTANCE;
    }

}
