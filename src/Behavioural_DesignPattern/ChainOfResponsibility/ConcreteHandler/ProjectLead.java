package Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler;

import Behavioural_DesignPattern.ChainOfResponsibility.AbstractHandler.LeaveApprover;
import Behavioural_DesignPattern.ChainOfResponsibility.LeaveApplication;

public class ProjectLead extends LeaveApprover {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // can approve only sick leaves within two days
        if (application.getType() == LeaveApplication.Type.SICK
            && application.getNumberOfDays() <= 2) {
            application.approve(getApprover());
            return true;
        }
        return false;
    }
}
