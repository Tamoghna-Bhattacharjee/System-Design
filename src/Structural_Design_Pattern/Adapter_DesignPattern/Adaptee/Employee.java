package Structural_Design_Pattern.Adapter_DesignPattern.Adaptee;

public class Employee {
    private String fullname, jobtitle, officeLoc;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getOfficeLoc() {
        return officeLoc;
    }

    public void setOfficeLoc(String officeLoc) {
        this.officeLoc = officeLoc;
    }
}
