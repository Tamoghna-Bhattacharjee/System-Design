package Structural_Design_Pattern.Adapter_DesignPattern;

import Structural_Design_Pattern.Adapter_DesignPattern.Adaptee.Employee;
import Structural_Design_Pattern.Adapter_DesignPattern.Adapter.EmployeeClassAdapter;
import Structural_Design_Pattern.Adapter_DesignPattern.Adapter.EmployeeObjectAdapter;
import Structural_Design_Pattern.Adapter_DesignPattern.Client.BusinessCardDesigner;

public class Main {
    public static void main(String[] args) {

        // Class Adapter
        System.out.println("*** Class Adapter ***");
        EmployeeClassAdapter classAdapter = new EmployeeClassAdapter();
        populateEmployeeData(classAdapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        System.out.println(designer.designCard(classAdapter));

        
        // Onject Adapter
        System.out.println("*** Office Adapter ***");
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer2 = new BusinessCardDesigner();
        System.out.println(designer2.designCard(objectAdapter));
    }

    public static void populateEmployeeData(Employee employee) {
        employee.setFullname("Tamoghna bhattacharjee");
        employee.setJobtitle("SDE");
        employee.setOfficeLoc("Samsung R&D");
    }
}
