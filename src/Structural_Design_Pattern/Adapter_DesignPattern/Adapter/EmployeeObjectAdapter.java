package Structural_Design_Pattern.Adapter_DesignPattern.Adapter;

import Structural_Design_Pattern.Adapter_DesignPattern.Adaptee.Employee;
import Structural_Design_Pattern.Adapter_DesignPattern.Target.Customer;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullname();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobtitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLoc();
    }
}
