package com.isoft.SchoolBilling.model;

import com.isoft.SchoolBilling.enums.BillingStatus;

import javax.persistence.*;

@Entity
public class Billing {

    @Id
    @GeneratedValue
    private Integer id;
    private String admissionNumber;
    private String fullName;
    private String className;
    private double termFee;
    private double securityFee;
    private BillingStatus billingStatus;

    @OneToOne
    @JoinColumn(name = "student", referencedColumnName = "id", insertable = false,updatable = false)
    private Student student;

    public Billing() {
    }

    public Billing(int id, String admissionNumber, String fullName, String className, double termFee, double securityFee, BillingStatus billingStatus) {
        this.id = id;
        this.admissionNumber = admissionNumber;
        this.fullName = fullName;
        this.className = className;
        this.termFee = termFee;
        this.securityFee = securityFee;
        this.billingStatus = billingStatus;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BillingStatus getState() {
        return billingStatus;
    }

    public void setState(BillingStatus state) {
        this.billingStatus = state;
    }

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
