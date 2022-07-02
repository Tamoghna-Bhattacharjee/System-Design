package Creational_Design_Pattern.Singleton.Enum_Singleton;

public enum ResgistryEnum {
    // advantage of using enum to create singleton object:
    // 1. enum can't be inherited
    // 2. You can't create object of enum in your class
    // 3. Handles serialization and deserialization issues
    // not something you generally use

    INSTANCE;

    public void getConfig() {

    }
}
