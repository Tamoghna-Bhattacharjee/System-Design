package Behavioural_DesignPattern.ChainOfResponsibility.AbstractHandler;

import Behavioural_DesignPattern.ChainOfResponsibility.LeaveApplication;

public abstract class LeaveApprover {
    private String role;
    private LeaveApprover successor;

    public LeaveApprover(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    public String getApprover() {
        return this.role;
    }

    protected abstract boolean processRequest(LeaveApplication application);

    public void processLeaveApplication(LeaveApplication application) {
        if (!processRequest(application) && successor != null)
            successor.processLeaveApplication(application);
    }

}
