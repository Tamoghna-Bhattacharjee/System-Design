package Creational_Design_Pattern.Singleton.Lazy_Singletons;

public class LazyRegistry {

    // INSTANCE should be accessed from Main memory instead of Cach
    private static volatile LazyRegistry INSTANCE = null;

    private LazyRegistry() {

    }

    public static LazyRegistry getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistry.class) {
                if (INSTANCE == null)
                    INSTANCE = new LazyRegistry();
            }
        }
        return INSTANCE;
    }

}
