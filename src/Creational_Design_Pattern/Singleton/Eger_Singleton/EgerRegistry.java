package Creational_Design_Pattern.Singleton.Eger_Singleton;

public class EgerRegistry {

    private EgerRegistry() {
    }

    private static final EgerRegistry INSTANCE = new EgerRegistry();

    public static EgerRegistry getInstance() {
        return INSTANCE;
    }

}
