package Behavioural_DesignPattern.ChainOfResponsibility;

import Behavioural_DesignPattern.ChainOfResponsibility.AbstractHandler.LeaveApprover;
import Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler.Director;
import Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler.Manager;
import Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler.ProjectLead;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication application = new LeaveApplication(LeaveApplication.Type.PTO,
                LocalDate.now(), LocalDate.of(2022, 10, 4));
        
        System.out.println(application);
        System.out.println("===============================");
        LeaveApprover approver = makeApproverChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover makeApproverChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }
}
