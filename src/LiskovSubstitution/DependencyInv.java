package LiskovSubstitution;

import java.util.ArrayList;

public class DependencyInv {
    public static void main(String[] args) {

    }
}

class Manage {
    // High lvl class: Manage does not depends on Low lvl class: Developer, tester etc;
    private ArrayList<Employee> employees;

    public Manage() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }
//    -> Removing the dependency by abstraction
//    public void addDeveloper(Developer developer) {
//        employees.add(developer);
//    }
//    public void addTester(Tester tester) {
//        employees.add(tester);
//    }
}

class Employee {
    String name, adress, id, role;

    public Employee(String name, String adress, String id, String role) {
        this.name = name;
        this.adress = adress;
        this.id = id;
        this.role = role;
    }
}

class Developer extends Employee {
    public Developer(String name, String adress, String id) {
        super(name, adress, id, "Developer");
    }

    public void devWork() {
        System.out.println("developing");
    }
}

class Tester extends Employee {
    public Tester(String name, String adress, String id) {
        super(name, adress, id, "Tester");
    }

    public void testWork() {
        System.out.println("testing");
    }
}

