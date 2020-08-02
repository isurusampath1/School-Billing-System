package com.isoft.SchoolBilling.dto;

public class BillingDTO {
    private String admissionNumber;
    private String fullName;
    private String className;
    private double termFee;
    private double securityFee;

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getTermFee() {
        return termFee;
    }

    public void setTermFee(double termFee) {
        this.termFee = termFee;
    }

    public double getSecurityFee() {
        return securityFee;
    }

    public void setSecurityFee(double securityFee) {
        this.securityFee = securityFee;
    }
}
