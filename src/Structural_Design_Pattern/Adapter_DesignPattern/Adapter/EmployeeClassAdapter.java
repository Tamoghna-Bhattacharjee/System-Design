package Structural_Design_Pattern.Adapter_DesignPattern.Adapter;

import Structural_Design_Pattern.Adapter_DesignPattern.Adaptee.Employee;
import Structural_Design_Pattern.Adapter_DesignPattern.Target.Customer;

public class EmployeeClassAdapter extends Employee implements Customer {

    @Override
    public String getName() {
        return this.getFullname();
    }

    @Override
    public String getDesignation() {
        return this.getJobtitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLoc();
    }
}
