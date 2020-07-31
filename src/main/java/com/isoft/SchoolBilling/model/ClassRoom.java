package com.isoft.SchoolBilling.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue
    private int id;
    private String className;
    private double termFee;
    private double securityFee;

    public ClassRoom() {
    }

    public ClassRoom(int id, String className, double termFee, double securityFee) {
        this.id = id;
        this.className = className;
        this.termFee = termFee;
        this.securityFee = securityFee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

