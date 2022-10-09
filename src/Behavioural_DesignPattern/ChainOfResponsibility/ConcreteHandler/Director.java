package Behavioural_DesignPattern.ChainOfResponsibility.ConcreteHandler;

import Behavioural_DesignPattern.ChainOfResponsibility.AbstractHandler.LeaveApprover;
import Behavioural_DesignPattern.ChainOfResponsibility.LeaveApplication;

public class Director extends LeaveApprover {
    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == LeaveApplication.Type.PTO) {
            application.approve(getApprover());
            return true;
        }
        return false;
    }
}
