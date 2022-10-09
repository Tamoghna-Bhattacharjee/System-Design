package Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler;

import Behavioural_DesignPattern.ChainOfResponsibility.AbstractHandler.LeaveApprover;
import Behavioural_DesignPattern.ChainOfResponsibility.LeaveApplication;

public class Manager extends LeaveApprover {
    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // can approve any sick leaves
        // can approve PTO leaves upto 5 days
        switch (application.getType()) {
            case SICK:
                application.approve(getApprover());
                return true;
            case PTO:
                if (application.getNumberOfDays() <= 5) {
                    application.approve(getApprover());
                    return true;
                }
        }
        return false;
    }
}
