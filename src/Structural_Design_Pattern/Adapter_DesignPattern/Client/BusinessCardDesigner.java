package Structural_Design_Pattern.Adapter_DesignPattern.Client;

import Structural_Design_Pattern.Adapter_DesignPattern.Target.Customer;

public class BusinessCardDesigner {
    public String designCard(Customer customer) {
        return customer.getName() + "\n" + customer.getDesignation()
                + "\n" + customer.getAddress();
    }
}
