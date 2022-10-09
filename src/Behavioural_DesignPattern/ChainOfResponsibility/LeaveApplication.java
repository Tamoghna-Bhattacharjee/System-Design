package Behavioural_DesignPattern.ChainOfResponsibility;

import java.time.LocalDate;
import java.time.Period;

public class LeaveApplication {
    public enum  Type {SICK, PTO, LPO};
    public enum Status {PENDING, APPROVED, REJECTED};

    private Type type;
    private LocalDate from, to;
    private String processedBy;
    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.PENDING;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public int getNumberOfDays() {
        return Period.between(from, to).getDays();
    }

    public void approve(String approver) {
        this.status = Status.APPROVED;
        this.processedBy = approver;
    }

    @Override
    public String toString() {
        return "LeaveApplication{" +
                "type=" + type +
                ", processedBy='" + processedBy + '\'' +
                ", status=" + status +
                ", no of days=" + getNumberOfDays() +
                '}';
    }
}
