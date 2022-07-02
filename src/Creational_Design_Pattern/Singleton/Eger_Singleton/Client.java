package Creational_Design_Pattern.Singleton.Eger_Singleton;

public class Client {
    public static void main(String[] args) {
        EgerRegistry registry1 = EgerRegistry.getInstance();
        EgerRegistry registry2 = EgerRegistry.getInstance();
        System.out.println(registry1 == registry2);
    }
}
