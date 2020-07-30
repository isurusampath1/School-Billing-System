package com.isoft.SchoolBilling.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Billing {

    @Id
    private Integer id;
    private String admissionNumber;
    private String fullName;
    private String className;
    private String termFee;
    private String securityFee;
    private String state;

    @ManyToOne
    @JoinColumn(name = "classid", insertable = false,updatable = false)
    private ClassRoom aClassRoom;
    private String classid;



    public Billing() {
    }

    public Billing(Integer id, String admissionNumber, String fullName, String className, String termFee, String securityFee, String state) {
        this.id = id;
        this.admissionNumber = admissionNumber;
        this.fullName = fullName;
        this.className = className;
        this.termFee = termFee;
        this.securityFee = securityFee;
        this.state = state;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getTermFee() {
        return termFee;
    }

    public void setTermFee(String termFee) {
        this.termFee = termFee;
    }

    public String getSecurityFee() {
        return securityFee;
    }

    public void setSecurityFee(String securityFee) {
        this.securityFee = securityFee;
    }
}
